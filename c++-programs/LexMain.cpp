/**
 *@file LexMain.cpp
 *@author Brian Goodwin
 *@date 10-15-15
 *@note CS 280 S003, FALL 2015, Assignment #2
 *@brief This program is the main execution for the lexical analyzer
**/
#include<iostream>
#include<istream>
#include<fstream>
#include<map>
#include<vector>
#include<algorithm>
#include<string>
#include "p2lex.h"
using namespace std;

inline string toString(Token l);
void usage(char *progname, string msg);

int main(int argc, char *argv[])
{
  string token; //holds token for string conversion
  string temp; //holds temp for printing ID
  int firstHighest = 0; //holds first highest occurence of token
  int secondHighest = 0; //holds second highest occurence of token
  int thirdHighest = 0; //holds third highest occurence of token
  int countHighest1; //holds count for how many times first highest token occurs
  int countHighest2; //holds count for how many times second highest token occurs
  int countHighest3; //holds count for how many times third highest token occurs
  int countTotalHighest; //holds count for total time first second and third highest token occurs
  map<string,int> tokenMap; //holds map for the token and occurences
  vector<string> listID; //holds vector for list of identifiers
  vector<int> seenTokens; //holds vector for the occurences of each token
  map<string,int>::iterator it; //iterator to iterate through tokenMap
  Token t; //holds token value
  string recognized; //holds lexeme
  
  istream *br; //pointer to input
  ifstream theFile; //used for file if user enters one
  
  if(argc==1) //if user doesnt specify file read from standard in
  {
	br=&cin;
  }
  
  else if(argc==2) //if user enters file name read from that file
  {
	theFile.open(argv[1]);
	
	if(theFile.is_open())
	{
	  br=&theFile;
	}
  
	else //if an issue occured when opening file
	{
	  usage(argv[0], "\033[1;31mCannot open \033[0m" + string(argv[1]));
	  return 1;
	}
  }
  else //if user entered too many file names
  {
	usage(argv[0], "\033[1;31mMore than one file name was given\033[0m");
	exit(1);
  }
  
  while((t=getToken(br,recognized)) != DONE) //continuously calls getToken and assigns to token t
  {
	if((token=toString(t)) != "DONE") //converts token t to string
	{
	  tokenMap[token]++; //adds tokens and occurences to tokenMap
	}
	if(token=="ERR") //if token returns error stop program
	{
	  exit(1);
	}
	  
	if(token=="Identifier") //if token return identifier add to identifier vector
	{
	  listID.push_back(recognized);
	}
  }
 
	
  sort(listID.begin(), listID.end()); //sort the identifiers
  listID.erase( unique( listID.begin(), listID.end() ), listID.end()); //erase duplicate identifiers
	
  for(it=tokenMap.begin(); it!=tokenMap.end(); it++) //iterator through tokenMap and add to seenTokens
  {
	seenTokens.push_back(it->second);
  }
  
  for (int i = 0; i < seenTokens.size(); i++) //loops through seenToken to get first second and third highest occurence of token
  {
	if (seenTokens.at(i) > firstHighest)
    {
	  thirdHighest = secondHighest;
      secondHighest = firstHighest;            
      firstHighest = seenTokens.at(i);
	}
    else if (seenTokens.at(i) > secondHighest)
    {
	  thirdHighest = secondHighest;
      secondHighest = seenTokens.at(i);
    }
    else if (seenTokens.at(i) > thirdHighest)
	{
      thirdHighest = seenTokens.at(i);
	}
        
  }
	
  countHighest1=count(seenTokens.begin(), seenTokens.end(), firstHighest); //counts how many occurences of first highest token appear
  countHighest2=count(seenTokens.begin(), seenTokens.end(), secondHighest); //counts how many occurences of second highest token appear
  countHighest3=count(seenTokens.begin(), seenTokens.end(), thirdHighest); //counts how many occurences of third highest token appear
  countTotalHighest=(countHighest1+countHighest2+countHighest3); //counts total number of occurences

  if(tokenMap.size()>=countTotalHighest) //if the tokenMap size is greater than the total number of occurences
  {
	for (it=tokenMap.begin(); it!=tokenMap.end(); it++) //loop through tokenMap and print first highest occurence of tokens
	{
	  if(it->second==firstHighest)
	  {
		cout<<it->first<<": "<<it->second<<endl;
	  }
	}
	for (it=tokenMap.begin(); it!=tokenMap.end(); it++) //loop through tokenMap and print second highest occurence of tokens
	{
	  if(it->second==secondHighest)
	  {
		cout<<it->first<<": "<<it->second<<endl;
	  }
	}
	for (it=tokenMap.begin(); it!=tokenMap.end(); it++) //loop through tokenMap and print third highest occurence of tokens
	{
	  if(it->second==thirdHighest)
	  {
		cout<<it->first<<": "<<it->second<<endl;
	  }
	}
  }
  
  else //if tokenMap is less that total number of occurences print top 3 or less occurences of tokens
  {
	for (it=tokenMap.begin(); it!=tokenMap.end(); it++)
		cout<<it->first<<": "<<it->second<<endl;
  }	  
  
  if(listID.size()!='\0') //if the identifier vector is not null
  {
	temp=listID.back();
	cout<<endl;
	cout<<"List of identifiers: ";
	for(int i=0; i<listID.size(); i++) //loop to print identifiers
	{
	  cout<<listID[i];
	  if(listID[i]!=temp) //ensures comma isnt printed with last identifier
	  {
		cout<<", ";
	  }
	}
	  cout<<endl;
  }
	
return 0;
}

/**
 *@brief This functions converts the token to a string
 *@param t the token
 *@return the converted string representation
**/
inline string toString(Token t)
{
  switch(t)
  {
	case ID:
	  return "Identifier";
	
	case STRING:
	  return "String constant";
	  
	case UNION:
	  return "Union operator";
	  
	case INTERSECT:
	  return "Intersect operator";
	  
	case SET:
	  return "SET keyword ";
	  
	case PRINT:
	  return "PRINT keyword";
	  
	case SEARCH:
	  return "SEARCH keyword";
	  
	case FOR:
	  return "FOR keyword";
	  
	case LPAREN:
	  return "Left paren";
	  
	case RPAREN:
	  return "Right paren";
	  
	case SC:
	  return "Semicolon";
	  
	case ERR:
	  return "ERR";
	  
	case DONE:
	  return "DONE";
	  
	default:
	  return "NOPE";
  }
}

/**
 *@brief This function is used to show error message and usage of the program if certain error occurs
 *@param *progname the program name the user enters
 *@param msg the msg to be printed for that certain error
**/
void usage(char *progname, string msg)
{
	cerr << "\033[1;31mError: \033[0m" << msg << endl;
	cerr << "Usage is: " << progname << " [filename]" << endl;
	cerr << "specifying filename reads from that file; no filename reads standard input" << endl;
}