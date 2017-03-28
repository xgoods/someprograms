//Brian Goodwin
//assignment 3 s003
#include "p2lex.h"
#include <fstream>
#include <string>
using namespace std;
extern int linenum;

int errcount = 0;

void errmsg(string msg)
{
  errcount++;
  cerr << linenum << ": " << msg << endl;
}
class PTree 
{
protected:
  PTree *left;
  PTree *right;
  int line;

public:
  PTree(PTree *left = 0, PTree *right = 0, int line=0) 
  {
	this->left=left;
	this->right = right;
	this->line=line;
  }
  int nodeCount() 
  {
	int count = 0;
	
	if( left == 0 && right == 0 ) 
	  return 1;

	if(left) 
	  count += left->nodeCount();
	
	if(right) 
	  count += right->nodeCount();
		
	return count;
  }
  virtual void findEmptyStrings(){};
};

class PTreeStmtList : public PTree 
{
public:
	PTreeStmtList(int line, PTree *s1, PTree *s2 = 0) : PTree(s1, s2, line) {}
};

class PTreePrint : public PTree 
{
public:
	PTreePrint(PTree *expr) : PTree(expr) {}
};

class PTreeSet : public PTree 
{
	string id;
public:
	PTreeSet(string id, PTree *expr) : PTree(expr) { this->id = id; }
};

class PTreeUnion : public PTree 
{
public:
	PTreeUnion(PTree *s1, PTree *s2 = 0,int line=0 ) : PTree(s1, s2, line) {}
};

class PTreeIntersect : public PTree 
{
public:
	PTreeIntersect(PTree *s1, PTree *s2 = 0,int line=0) : PTree(s1, s2, line) {}
};

class PTreeLparen : public PTree 
{
public:
	PTreeLparen(PTree *s1, PTree *s2 = 0,int line=0) : PTree(s1, s2,line) {}
};

class PTreeRparen : public PTree 
{
public:
	PTreeRparen(PTree *s1, PTree *s2 = 0,int line=0) : PTree(s1, s2,line) {}
};

class PTreeID : public PTree 
{
string id;
public:
	PTreeID(string id) : PTree() { this->id = id; }
};

class PTreeSTR : public PTree 
{
string str;
public:
	PTreeSTR(string str) : PTree() { this->str = str; }
};

class PTreeSearch : public PTree
{
string search;
public:
  PTreeSearch(string search) : PTree() {this->search=search;}
};

extern PTree *Program(istream *br);
extern PTree *StmtList(istream *br);
extern PTree *Stmt(istream *br);
extern PTree *Expr(istream *br);
extern PTree *Term(istream *br);
extern PTree *Primary(istream *br);
extern PTree *SearchExp(istream *br);

// Program ::= StmtList
PTree *Program(istream *br)
{
  return StmtList(br);
}

// StmtList ::= Stmt | Stmt StmtList
PTree *StmtList(istream *br)
{
  PTree *stmt;

	stmt = Stmt(br);

	if(stmt)
		return new PTreeStmtList(linenum, stmt, StmtList(br) );
	return 0;
}

// Stmt ::= PRINT Expr SC | SET ID Expr SC
PTree *Stmt(istream *br)
{
	Token t;
	string lexeme;
	
	t = getToken(br, lexeme);
	if(t == PRINT) 
	{
		PTree *expr = Expr(br);
		
		if(expr == 0) 
		{
			errmsg("Expected an expression1");
			return 0;
		}

		t = getToken(br, lexeme);
		if(t != SC) 
		{
			errmsg("Missing semicolon");
			return 0;
		}
		
		return new PTreePrint(expr);
	}
	else if(t == SET) 
	{
		string id;
		t = getToken(br, id);
		
		if(t != ID) 
		{
			errmsg("Expected an identifier");
			return 0;
		}
		
		PTree *expr = Expr(br);
		if(expr == 0) 
		{
			errmsg("Expected an expression2");
			return 0;
		}

		t = getToken(br, lexeme);
		
		if(t != SC) 
		{
			errmsg("Missing semicolon");
			return 0;
		}

		return new PTreeSet(id, expr);
	}
	else if(t != DONE)
		errmsg("invalid");

	return 0;
}

// Expr ::= term UNION expr | Term

PTree *Expr(istream *br)
{
	PTree *term = Term(br);
	if(term == 0) 
	  return 0;

	Token t;
	string lexeme;
	
	t = getToken(br, lexeme);
	//cout<<"HEre "<<t<<linenum<<endl;
	if(t != UNION) 
	{
		pushbackToken(t,lexeme);
		return term;
	}
	t = getToken(br, lexeme);
	//cout<<"THERE "<<t<<linenum<<endl;
	if(t==STRING)
	{
	  cout<<"Invalid union at line "<<linenum<<endl;
	}
	
	PTree *expr = Expr(br);
	if(expr == 0) 
	{
		errmsg("Expected an expression3");
		return 0;
	}
	
	
	
	return new PTreeUnion(term,expr);
}

// Term ::= primary INTERSECT term | Primary 

PTree *Term(istream *br)
{
	PTree *pri = Primary(br);
	if( pri == 0 ) 
	  return 0;

	Token t;
	string lexeme;

	t = getToken(br, lexeme);
	
	if(t != INTERSECT) 
	{
		pushbackToken(t,lexeme);
		return pri;
	}
	
	//t = getToken(br, lexeme);
	if(t!=STRING)
	{
	  cout<<"Invalid intersect operator for given types at line " <<linenum<<endl;
	}
	
	
	
	PTree *term = Term(br);
	if( term == 0 ) 
	{
		errmsg("Expected a term");
		return 0;
	}
	
	
	return new PTreeIntersect(pri,term);
}

// Primary ::= ID | search_expr| STRING
PTree *Primary(istream *br)
{
	Token t;
	string lexeme;
	
	t = getToken(br, lexeme);
	//cout<<"HERE"<<t<<endl;
	
	  if(t==ID)
		return new PTreeID(lexeme);
		
	  if(t==STRING)
		return new PTreeSTR(lexeme);
	  if(t==SEARCH)
		PTree *searchExp=SearchExp(br);
		
}
//search_expr::= SEARCH STRING FOR STRING
PTree *SearchExp(istream *br)
{
  Token t;
  string lexeme;

	t = getToken(br, lexeme);
	//cout<<"SEARCH"<<t<<endl;
	
	if(t != SEARCH) 
	{
		pushbackToken(t,lexeme);
		return 0;
	}
	
	if(t!=STRING)
	  errmsg("Expected string");
	else
	  return new PTreeSTR(lexeme);
	
	t = getToken(br, lexeme);
	
	if(t!=FOR)
	  errmsg("Expected for");
	
	t = getToken(br, lexeme);
	
	if(t!=STRING)
	  errmsg("Missing String");
	else
	  return new PTreeSTR(lexeme);
	
}
void usage(char *progname, string msg)
{
  cerr << "Error: " << msg << endl;
  cerr << "Usage is: " << progname << " [filename]" << endl;
  cerr << " specifying filename reads from that file; no filename reads standard input" << endl;
}

int main(int argc, char *argv[])
{
    istream *br;
    ifstream infile;
    
    if( argc == 1 )
        br = &cin;
    else if( argc == 2 ) 
	{
        infile.open(argv[1]);
        if( infile.is_open() )
            br = &infile;
        else 
		{
            usage(argv[0], "Cannot open " + string(argv[1]));
            return 1;
        }
    }
    else 
	{
        usage(argv[0], "More than one file name was given");
        return 1;
    }

    PTree *program;

    program = Program(br);

    if(!program || errcount)
    	return 0;
    
    
   cout<<"Node Count Is: "<<program->nodeCount()<<endl;

    return 0;
}