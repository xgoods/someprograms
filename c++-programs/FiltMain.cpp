/**
 * @file FiltMain.cpp
 * @brief This is the main file for execuation.
 * The purpose of this program is for a user to modify file conent
 * using command line arguements by typing ./FiltMain a file and modifier(s).
 * After a file and modifier is selected the program will modify the file content
 * accordingly.
 * @note !!!!!THE COLORS USED IN THE PROGRAM ARE SPECIFIC TO LINUX ONLY!!!!
 * @note !!!!!THESE COLORS WILL ONLY WORK ON LINUX MACHINES!!!!! 
 * @author Brian Goodwin
 * @version 1.0.0
 * @date 9-18-15
 * @note CS 280 S003, FALL 2015, Assignment #1
*/
#include <fstream>
#include <iostream>
#include <string>
#include <cstring>
#include <cstdlib>
#include "Filt.h"
using namespace std;

int main(int argc, char *argv[])
{
  
  int j; ///< holds j used in for loops
  char* fileContent; ///< holds the file content
  char* progName; ///< holds the program name
  string letter="letter"; ///< holds letter modifier
  string vowel="vowel"; ///< holds vowel modifier
  string consonant="consonant"; ///< holds consonant modifier
  string word="word"; ///< holds word modifier
  string number="number"; ///< holds number modifier
  string space="space"; ///< holds space modifier
  string punct="punct"; ///< holds punctuation modifier
  string upper="upper"; ///< holds upper modifier
  string lower="lower"; ///< holds lower modifier
  string fileName; ///< holds file name
  Filt error(progName, fileName); ///< creates Filt object for error functions
  
   
  
  if(argc<2 )//if user only enters file name
  {
	cerr<<("\033[1;31mYOU MUST ENTER A FILENAME.\033[0m")<<endl;
  }
  
  else if(argc>13) //if user enters too many modifiers
  {
	progName=argv[0]; //sets first arg to program name
	fileName=argv[1]; //sets second arg to file name
	error.usageArgs(argv[0], "\033[1;31mCannot open \033[0m" + string(argv[1]));
	exit(1);
  }
  
  else//if user enters the correct amount of modifiers
  {
	progName=argv[0]; //sets first arg to program name
	fileName=argv[1]; //sets second arg to file name 
	ifstream theFile(argv[1], ios::in); //ifstream the file to be modified
	
	
	if(!(theFile.is_open())) //if the file cannot be opened
	{
	  	error.usageFile(progName, "\033[1;31mCannot open \033[0m" + string(fileName));
		exit(1);
	}
	
	if(theFile.is_open()) //if the file is open
	{
	  
	  string contents((istreambuf_iterator<char>(theFile)), 
	  istreambuf_iterator<char>()); //reads successive elements of file from streambuf to contents of type string
	  fileContent = new char[contents.length()+1]; //creates char array with length of contents
	  strcpy(fileContent, contents.c_str()); //copys contents from content string to file content char array
	  
	  if(contents.length()=='\0') //if users input file is null
	  {
		
		error.usageFileNull(progName, "\033[1;31mFile is null- \033[0m" +string(fileName));
		exit(1);
	  }
	  
	  cout<<"\033[1;36mFile content before modification: \033[0m";
	  cout<<fileContent<<endl;//prints file content before mod
	  
	  Filt theFilter(fileContent); //creates object of Filt and passes file content
	  
	  for(j=2; j<argc; j++) //used to march down argv args
	  {
		if(!(argv[j]==consonant ||argv[j]==vowel ||argv[j]==letter ||argv[j]==number ||argv[j]==space
		  ||argv[j]==punct ||argv[j]==word ||argv[j]==upper ||argv[j]==lower)) //if user enters mod that doesnt exist
		{
		  error.usageWrongMod(progName, string(fileName));
		  exit(1);
		}
		
		else if(argv[j]==upper &&argv[j-1]==upper ||(argv[j]==lower &&argv[j-1]==lower)
			||(argv[j]==lower &&argv[j-1]==upper) ||(argv[j]==upper &&argv[j-1]==lower)) //if user enters incorrect use of mod
		{
		  error.usageWrongMod(progName, string(fileName));
		  exit(1);
		}
		
		else if((argv[j]==upper &&argv[j+1] =='\0') ||(argv[j]==lower &&argv[j+1]=='\0')) //if user enters incorrect use of mod
		{
		  error.usageWrongMod(progName, string(fileName));
		  exit(1);
		}
		
		else
		{
		  if(argv[j]==consonant) //if mod selected is consonant
		  {
			if(argv[j-1]==upper) //if mod selected is upper consonant
			{
			  theFilter.removeUpperConsonant(fileContent); //removes upper consonant
			}
			else if(argv[j-1]==lower) //if mod selected is lower consonant
			{
			  theFilter.removeLowerConsonant(fileContent); //removes lower consonant
			}
			else
			{
			  theFilter.removeConsonant(fileContent); //removes consonant
			}
		  }
		
		  if(argv[j]==vowel) //if mod selected is vowel
		  {
			if(argv[j-1]==upper) //if mod selected is upper vowel
			{
			  theFilter.removeUpperVowel(fileContent); //removes upper vowel
			}
			else if(argv[j-1]==lower) //if mod selected is lower vowel
			{
			  theFilter.removeLowerVowel(fileContent); //removes lower vowel
			}
			else
			{
			  theFilter.removeVowel(fileContent); //removes vowel
			}
		  }
		
		  if(argv[j]==letter) //if mod selected is letter
		  {
			if(argv[j-1]==upper) //if mod selected is upper letter
			{
			  theFilter.removeUpperLetter(fileContent); //removes upper letter
			}
			else if(argv[j-1]==lower) //if mod selected is lower letter
			{
			  theFilter.removeLowerLetter(fileContent); //removes lower letter
			}
			else
			{
			  theFilter.removeLetter(fileContent); //removes letter
			}
		  }
		
		  if(argv[j]==number) //if mod selected is number
		  {
			theFilter.removeNumber(fileContent); //removes number
		  }
		
		  if(argv[j]==space) //if mod selected is space
		  {
			theFilter.removeSpace(fileContent); //removes whitespace
		  }
		
		  if(argv[j]==punct) //if mod selected is punct
		  {
			theFilter.removePunct(fileContent); //removes punctuation
		  }
		
		  if(argv[j]==word) //if mod selected is word
		  {
			if(argv[j-1]==upper) //if mod selected is upper word
			{
			  theFilter.removeUpperWord(fileContent); //removes upper word
			}
			else if(argv[j-1]==lower) //if mod selected is lower word
			{
			  theFilter.removeLowerWord(fileContent); //removes lower word
			}
			else
			{
			  theFilter.removeWord(fileContent); //removes word
			}
		  }
		}
	  }
		
		cout<<fileContent<<endl; //prints file after mod
		theFile.close(); //close file
	}
  }
 
  return 0;
}