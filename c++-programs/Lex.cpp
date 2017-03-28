/**
 *@file Lex.cpp
 *@author Brian Goodwin
 *@date 10-15-15
 *@note CS 280, S003, FALL 2015, Assignment #2
 *@brief This is the class file for LexMain.cpp
 *It contains the functions that are used to get tokens from
 *file or user input and return the token and the lexeme
**/
#include <iostream>
#include <string>
#include <cstdlib>
#include "p2lex.h"
using namespace std;

enum Where //holds certain states depending on where the pointer is in the input or file
{
  ATBEGIN, //at the beginning
  ATID, //at an identifier
  ATSTRING, //at a string
  ATCOMMENT //at a comment
 
};

int linenum=1; //used for line number

/**
 *@brief This function is used to check if a certain lexeme is a reserved word or an identifier
 *@param word the lexeme
 *@return the token
**/ 
inline Token reservedWordCheck(const string& word)
{
  if(word=="set")
  {	
	return SET;
  }
  else if(word=="print")
  {
	return PRINT;
  }
  else if(word=="search")
  {
	return SEARCH;
  }
  else if(word=="for")
  {
	return FOR;
  }
		
  return ID;
}

/**
 *@brief This function is used to get a specific token by looping through the input or file content.
 *It initializes an integer to point to the input or file content and depending on the input or file content
 *it uses certain states to determine what token should be returned
 *@param br the pointer to the file or input
 *@param lexeme the lexeme
 *@return the token to be returned
**/
Token getToken(istream *br, string& lexeme)
{
  int readThrough; //holds value to read through file content or input
  Where state=ATBEGIN; //initializes state to be used to determine what token should be returned
  lexeme.clear(); //makes sure there is no lexemes
  while((readThrough=br->get())) //loops through the file content or user input
  {
	
	if(readThrough=='\n') //if its a new line increase linenum by 1
	{
	  linenum++;
	}
	
	switch(state)
	{
	  case ATBEGIN: //case its at the beginning of the file or input
		if(isspace(readThrough)) //continue until pointer gets to value thats not a space
		{
		  continue;
		}
		
		lexeme+=readThrough; //add to the lexeme
		
		if(readThrough=='+')
		{
		  return UNION;
		}
		
		if(readThrough=='^')
		{
		  return INTERSECT;
		}
		
		if(readThrough=='(')
		{
		  return LPAREN;
		}
		
		if(readThrough==')')
		{
		  return RPAREN;
		}
		
		if(readThrough==';')
		{
		  return SC;
		}
		if(isdigit(readThrough)) //print error because value cannot be number unless its in an identifier string or comment
		{
		  cout<<"Error on line "<<linenum<<endl;
		  return ERR;
		}
		
		if(isalpha(readThrough)) //if pointer gets to letter send state to ATID
		{
		  state=ATID;
		}
		else if(readThrough=='/') //if pointer gets to slash send state to ATCOMMENT
		{
		 
		  state=ATCOMMENT;
		}
		
		else if(readThrough=='"') //if pointer gets to quotes send state to ATSTRING
		{
		  state=ATSTRING;
		}
		
		else //file or input is done
		{
		  return DONE;
		}
		
		break;
		
	  case ATID: //case if the pointer is at an identifier
		if(isalnum(readThrough)) //continue to read through all alphanumeric values and add contents to the lexeme
		{
		  lexeme+=readThrough;
		  continue;
		}
		
		br->putback(readThrough); //put back last value
		
		return reservedWordCheck(lexeme); //send lexeme reservedWordCheck to see if lexeme is a reserved word
		
		break;
		
		
	  case ATSTRING: //case if pointer is at a string
		if(readThrough=='\n') //if newline print error because string needs to be enclosed in quotes on same line
		{
		  cout<<"Error on line "<<linenum<<endl;
		  return ERR;
		}
		if(readThrough!='"') //continue until second quote is reached
		{
		  continue;
		}
		 
		return STRING;
		break;
		
	  case ATCOMMENT: //case if pointer is at a comment
		
		if(readThrough!='\n') //continue until new line because comments must be on same line after //
		{
		  
		  lexeme.clear(); //clear the lexeme becasue it is ignored
		  continue;
		}
		
		state=ATBEGIN; //send state back to the beginning
		break;
		
		
	  default: //if an error has occured that wasnt suppose to occur
		cerr<<"There was a problem..."<<endl;
		exit(1);
		break;
	}
  }
 
  return DONE;
}


	
	
	
	
	
	
	
	