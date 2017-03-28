/**
 * @file Filt.cpp
 * @brief This is the class file for FileMain.cpp
 * It contains the functions and constructors used
 * for the modifying of file contents
 * @author Brian Goodwin
 * @version 1.0.0
 * @date 9-18-15
 * @note CS 280, S003, FALL 2015, Assignment #1
*/
#include "Filt.h"
#include <iostream>

using namespace std;

/**
 * @brief This constructor accepts the file contents
 * It is used for the removal of fileContent
 * @param fileContent the file content
*/
Filt::Filt(char* fileContent)
{
  this->fileContent=fileContent;
}

/**
 * @brief This constructors accepts the program name 
 * and file name for the error functions
 * @param progName the program name
 * @param fileName the file name
 */
Filt::Filt(char* progName, string fileName)
{
  this->progName=progName;
  this->fileName=fileName;
}

/**
 * @brief This function accepts the file content
 * and removes all consonant by checking if the file
 * content character is = to an uppercase or lowercase
 * consonant. It then takes the current place of that letter, number etc.. 
 * and sets it to the following letter, number etc... to 
 * append the content. It then replaces the consonant to be removed to null
 * @param content the file content
 * @return The file content without consonants
*/
char* Filt::removeConsonant(char* content) 
{
  int i; ///< holds i used in for loops
  int j; ///< holds j used in for loops
  
  for(i=0; content[i]!='\0'; i++)
  {
	while(!(content[i]=='a' ||content[i]=='e' ||content[i]=='i' 
	  ||content[i]=='o' ||content[i]=='u' ||content[i]=='A' 
	  ||content[i]=='E' ||content[i]=='I' ||content[i]=='O' 
	  ||content[i]=='U' ||isdigit(content[i]) ||ispunct(content[i]) 
	  ||isspace(content[i])))
	{
	  for(j=i; content[j]!='\0'; j++)
	  {
		content[j]=content[j+1];
	  }
		
	  content[j]='\0';
	  }
  }
  return content;
}

/**
 * @brief This function accepts the file content
 * and removes all uppercase consonant by checking if the file
 * content character is = to an uppercase consonant. 
 * It then takes the current place of that letter, number etc.. 
 * and sets it to the following letter, number etc... to 
 * append the content and replaces the uppercase consonant to be removed to null
 * @param content the file content
 * @return The file content without uppercase consonants
*/
char* Filt::removeUpperConsonant(char* content) //working do not touch
{
  int i; ///< holds i used in for loops
  int j; ///< holds j used in for loops
  
  for(i=0; content[i]!='\0'; i++)
  {
	while(content[i]=='B' ||content[i]=='C' ||content[i]=='D' 
	  ||content[i]=='F' ||content[i]=='G' ||content[i]=='H' 
	  ||content[i]=='J' ||content[i]=='K' ||content[i]=='L' 
	  ||content[i]=='M' ||content[i]=='N' ||content[i]=='P' 
	  ||content[i]=='Q' ||content[i]=='R' ||content[i]=='S' 
	  ||content[i]=='T' ||content[i]=='V' ||content[i]=='W'
	  ||content[i]=='X' ||content[i]=='Y' ||content[i]=='Z')
	{
	  for(j=i; content[j]!='\0'; j++)
	  {
		content[j]=content[j+1];
	  }
		
	  content[j]='\0';
	}
  }
  return content;
}

/**
 * @brief This function accepts the file content
 * and removes all lowercase consonant by checking if the file
 * content character is = to a lowercase consonant. 
 * It then takes the current place of that letter, number etc.. 
 * and sets it to the following letter, number etc... to 
 * append the content and replaces the lowercase consonant to be removed to null
 * @param content the file content
 * @return The file content without lowercase consonants
*/
char* Filt::removeLowerConsonant(char* content) //working do not touch
{
  int i; ///< holds i used in for loops
  int j; ///<holds j used in for loops
  
  for(i=0; content[i]!='\0'; i++)
  {
	while(content[i]=='b' ||content[i]=='c' ||content[i]=='d' 
	  ||content[i]=='f' ||content[i]=='g' ||content[i]=='h' 
	  ||content[i]=='j' ||content[i]=='k' ||content[i]=='l' 
	  ||content[i]=='m' ||content[i]=='n' ||content[i]=='p' 
	  ||content[i]=='q' ||content[i]=='r' ||content[i]=='s' 
	  ||content[i]=='t' ||content[i]=='v' ||content[i]=='w'
	  ||content[i]=='x' ||content[i]=='y' ||content[i]=='z')
	{
	  for(j=i; content[j]!='\0'; j++)
	  {
		content[j]=content[j+1];
	  }
		
	  content[j]='\0';
	}
  }
  return content;
}

/**
 * @brief This function accepts the file content
 * and removes all vowels by checking if the file
 * content character is = to an uppercase or lowercase
 * vowel. It then takes the current place of that letter, number etc..
 * and sets it to the following letter, number etc... to 
 * append the content. It then replaces the vowel to be removed to null
 * @param content the file content
 * @return The file content without vowels
*/
char* Filt::removeVowel(char* content) //working do not touch
{
  int i; ///< holds i used in for loops
  int j; ///< holds j used in for loops
  
  for(i=0; content[i]!='\0'; i++)
  {
	while(content[i]=='a' ||content[i]=='e' ||content[i]=='i' 
	  ||content[i]=='o' ||content[i]=='u' ||content[i]=='A' 
	  ||content[i]=='E' ||content[i]=='I' ||content[i]=='O' 
	  ||content[i]=='U')
	{
	  for(j=i; content[j]!='\0'; j++)
	  {
		content[j]=content[j+1];
	  }
		
	  content[j]='\0';
	}
  }
  return content;
}

/**
 * @brief This function accepts the file content
 * and removes all uppercase vowels by checking if the file
 * content character is = to an uppercase vowel. 
 * It then takes the current place of that letter, number etc..
 * and sets it to the following letter, number etc... to 
 * append the content. It then replaces the uppercase vowel to be removed to null
 * @param content the file content
 * @return The file content without uppercase vowels
*/
char* Filt::removeUpperVowel(char* content) //working do not touch
{
  int i; ///< holds i used in for loops
  int j; ///< holds j used in for loops
 
  for(i=0; content[i]!='\0'; i++)
  {
	while(content[i]=='A' ||content[i]=='E' ||content[i]=='I' ||content[i]=='O'
	  ||content[i]=='U')
	{
	  for(j=i; content[j]!='\0'; j++)
	  {
		content[j]=content[j+1];
	  }
		
	  content[j]='\0';
	}
  }
  
  return content;
}

/**
 * @brief This function accepts the file content
 * and removes all lowercase vowels by checking if the file
 * content character is = to a lowercase vowel. 
 * It then takes the current place of that letter, number etc..
 * and sets it to the following letter, number etc... to 
 * append the content. It then replaces the lowercase vowels to be removed to null
 * @param content the file content
 * @return The file content without lowercase vowels
*/
char* Filt::removeLowerVowel(char* content) //working do not touch
{
  int i; ///< holds i used in for loops
  int j; ///< holds j used in for loops
 
  for(i=0; content[i]!='\0'; i++)
  {
	while(content[i]=='a' ||content[i]=='e' ||content[i]=='i' ||content[i]=='o'
	  ||content[i]=='u')
	{
	  for(j=i;content[j]!='\0'; j++)
	  {
		content[j]=content[j+1];
	  }
		
	  content[j]='\0';
	}
  }
  
  return content;
}

/**
 * @brief This function accepts the file content
 * and removes all uppercase and lowercase letters by checking if the file
 * content character is = to an uppercase or lowercase letter. 
 * It then takes the current place of that letter, number etc..
 * and sets it to the following letter, number etc... to 
 * append the content. It then replaces the uppercase and lowercase 
 * letters to be removed to null
 * @param content the file content
 * @return The file content without letters
*/
char* Filt::removeLetter(char* content) //working do not touch
{
  int i; ///< holds i used in for loops
  int j; ///< holds j used in for loops
  
  for(i=0; content[i]!='\0'; i++)
  {
	while((islower(content[i]) ||(isupper(content[i]) &&(!(ispunct(content[i]))))))	
	{
	  for(j=i; content[j]!='\0'; j++)
	  {
		content[j]=content[j+1];
	  }
	  
	  content[j]='\0';
	}	
  }
   
  return content;
}

/**
 * @brief This function accepts the file content
 * and removes all uppercase letters by checking if the file
 * content character is = to an uppercase letter. 
 * It then takes the current place of that letter, number etc..
 * and sets it to the following letter, number etc... to 
 * append the content. It then replaces the uppercase letters to be removed to null
 * @param content the file content
 * @return The file content without uppercase letters
*/
char* Filt::removeUpperLetter(char* content) //working do not touch
{
  int i; ///< holds i used in for loops
  int j; ///< holds j used in for loops

  for(i=0; content[i]!='\0'; i++)
  {
	while(isupper(content[i]))
	{
	  for(j=i; content[j]!='\0'; j++)
	  {
		content[j]=content[j+1];
	  }
	  
	  content[j]='\0';
	}
  }
  
  return content;
}

/**
 * @brief This function accepts the file content
 * and removes all lowercase letters by checking if the file
 * content character is = to a lowercase letter. 
 * It then takes the current place of that letter, number etc..
 * and sets it to the following letter, number etc... to 
 * append the content. It then replaces the lowercase letters to be removed to null
 * @param content the file content
 * @return The file content without lowercase letters
*/
char* Filt::removeLowerLetter(char* content) //working do not touch
{
  int i; ///< holds i used in for loops
  int j; ///< holds j used in for loops

  for(i=0; content[i]!='\0'; i++)
  {
	while(islower(content[i]) &&(!(ispunct(content[i]))))
	{
	  for(j=i; content[j]!='\0'; j++)
	  {
		content[j]=content[j+1];
	  }
	
	content[j]='\0';
	}
  }

  return content;//working do not touch
}

/**
 * @brief This function accepts the file content
 * and removes all numbers by checking if the file
 * content character is = to a number. 
 * It then takes the current place of that letter, number etc..
 * and sets it to the following letter, number etc... to 
 * append the content. It then replaces the number to be removed to null
 * @param content the file content
 * @return The file content without numbers
*/
char* Filt::removeNumber(char* content) //working do not touch
{
  int i; ///< holds i used in for loops
  int j; ///< holds j used in for loops
  
  for(i=0; content[i]!='\0'; i++)
  {
	while(isdigit(content[i]))
	{
	  for(j=i; content[j]!='\0'; j++)
	  {
		content[j]=content[j+1];
	  }
		
	  content[j]='\0';
	}
  }
  
  return content;
}

/**
 * @brief This function accepts the file content
 * and removes all whitespace by checking if the file
 * content character is = to a whitespace. 
 * It then takes the current place of that letter, number etc..
 * and sets it to the following letter, number etc... to 
 * append the content. It then replaces the whitespace to be removed to null
 * @param content the file content
 * @return The file content without whitespaces
*/
char* Filt::removeSpace(char* content) //working do not touch
{
  int i; ///< holds i used in for loops
  int j; ///< holds j used in for loops
  
  for(i=0; content[i]!='\0'; i++)
  {
	while(isspace(content[i]))
	{
	  for(j=i; content[j]!='\0'; j++)
	  {
		content[j]=content[j+1];
	  }
		
	  content[j]='\0';
	}
  }
  
  return content;
}		

/**
 * @brief This function accepts the file content
 * and removes all punctuation by checking if the file
 * content character is = to a punctuantion mark. 
 * It then takes the current place of that letter, number etc..
 * and sets it to the following letter, number etc... to 
 * append the content. It then replaces the punctuation to be removed to null
 * @param content the file content
 * @return The file content without punctuation
*/
char* Filt::removePunct(char* content)  //working do not touch
{
  int i; ///< holds i used in for loops
  int j; ///< holds j used in for loops
	
  for(i=0; content[i]!='\0'; i++)
  {
	while(ispunct(content[i]))
	{
	  for(j=i; content[j]!='\0'; j++)
	  {
		content[j]=content[j+1];
	  }
		
	  content[j]='\0';
	}
  }
  
  return content;
}

/**
 * @brief This function accepts the file content
 * and removes all uppercase and lowercase words by checking if the file
 * content character is = to a number, lowercase or uppcase letter. 
 * It then takes the current place of that letter, number etc..
 * and sets it to the following letter, number etc... to 
 * append the content. It then replaces the lowercase, uppercase letters
 * and numbers to be removed to null
 * @param content the file content
 * @return The file content without words
*/
char* Filt::removeWord(char* content)
{
  int i; ///< holds i used in for loops
  int j; ///< holds j used in for loops
	
  for(i=0; content[i]!='\0'; i++)
  {
	while(islower(content[i]) ||isdigit(content[i]) ||isupper(content[i]))
	{
	  for(j=i; content[j]!='\0'; j++)
	  {
		content[j]=content[j+1];
	  }
		
	  content[j]='\0';
	}
  }
  
  return content;
}

/**
 * @brief This function accepts the file content
 * and removes all lowercase words by checking if the file
 * content character is = to an uppercase letter. If the letter is uppercase
 * it moves to the next letter and continues to do so while the next character
 * is not a whitespace or punctuation. It then moves to the next character and
 * checks if its a lowercase letter. If so it then takes the current place of 
 * that letter, number etc.. and sets it to the following letter, number etc... to 
 * append the content. It then essentially replaces the lowercase letters to be 
 * removed to null but only if the entired word is lowercase
 * @param content the file content
 * @return The file content without lowercase words
*/
char* Filt::removeLowerWord(char* content)
{
  int i; ///< holds i used in for loops
  int j; ///< holds j used in for loops
	
  for(i=0; content[i]!='\0'; i++)
  {
	if(isupper(content[i]))
	{
	  do
	  {
		i++;
	  }while(!(isspace(content[i]) ||ispunct(content[i])));
	  
	  i++;
	}
	if(isupper(content[i]) &&islower(content[i+1]))
	{
	  do
	  {
		i++;
	  }while(!(isspace(content[i]) ||ispunct(content[i])));
	}
	while((isdigit(content[i]) &&islower(content[i+1]) ||islower(content[i]) ||(isdigit(content[i]) &&islower(content[i+2]))))
	{
	  for(j=i; content[j]!='\0'; j++)
	  {
		content[j]=content[j+1];
	  }
		
	  content[j]='\0';
	}
	
  }
   
  return content;
}

/**
 * @brief This function accepts the file content
 * and removes all uppercase words by checking if the file
 * content character is = to a lowercase letter. If the letter is lowercase
 * it moves to the next letter and continues to do so while the next character
 * is not a whitespace or punctuation. It then moves to the next character and
 * checks if its an uppercase letter and checks if the following letter is lowercase. 
 * If so it then moves to the next character and checks if it is uppercase. 
 * If so, it then takes the current place of that letter, number etc.. and sets 
 * it to the following letter, number etc... to append the content. 
 * It then essentially replaces the uppercase letters to be 
 * removed to null but only if the entired word is uppercase.
 * @param content the file content
 * @return The file content without uppercase words
*/
char* Filt::removeUpperWord(char* content)
{
  int i; ///< holds i used in for loops
  int j; ///< holds j used in for loops
  
  for(i=0; content[i]!='\0'; i++)
  {
	if(islower(content[i]))
	{
	  do
	  {
		i++;
	  }while(!(isspace(content[i]) ||ispunct(content[i])));
	  
	  i++;
	}
	if(isupper(content[i]) &&islower(content[i+1]))
	{
	  i++;
	}
	while(isupper(content[i]) ||(isdigit(content[i]) &&isupper(content[i+1])) ||(isdigit(content[i]) &&isupper(content[i+2])))
	{
	  for(j=i; content[j]!='\0'; j++)
	  {
		content[j]=content[j+1];
	  }
		
	  content[j]='\0';
	}
  }
	
  return content;
}

/**
 * @brief This function accepts the program name and file name
 * for the use of the error message when user enters too many
 * arguements or just 1 arguement
 * @param progName the program name
 * @param fileName the file name
*/  
void Filt::usageArgs(char* prog, string file)
{
  cerr<<"\033[1;31mError: \033[0m"<<file<<endl;
  cerr<<"\033[1;31mUsage is: \033[0m"<<prog<<" \033[1;36m[filename] [modifier] (you can have multiple modifiers)\033[0m"<<endl;
  cerr<<"\033[1;31mYOU'VE ENTERED TOO MANY AGRUEMENT\033[0m"<<endl;
  cerr<<"\033[1;31mYOU CANNOT ENTER MORE THAN 13 ARGUEMENTS\033[0m"<<endl;
}

/**
 * @brief This function accepts the program name and file name
 * for the use of the error message when user enters no file
 * or wrongly spelt file to be modified
 * @param progName the program name
 * @param fileName the file name
*/
void Filt::usageFile(char* prog, string file)
{
  cerr<<"\033[1;31mError: \033[0m"<<file<<endl;
  cerr<<"\033[1;31mUsage is: \033[0m"<<prog<<" \033[1;36m[filename] [modifier] (you can have multiple modifiers)\033[0m"<<endl;
  cerr<<"\033[1;31mMake sure the file exists and you've entered the file name correctly.\033[0m"<<endl;
}

/**
 * @brief This function accepts the program name and file name
 * for the use of the error message when user enters a null file
 * to be modified
 * @param progName the program name
 * @param fileName the file name
 */  
void Filt::usageFileNull(char* prog, string file)
{
  cerr<<"\033[1;31mError: \033[0m"<<file<<endl;
  cerr<<"\033[1;31mUsage is: \033[0m"<<prog<<" \033[1;36m[filename] [modifier] (you can have multiple modifiers)\033[0m"<<endl;
  cerr<<"\033[1;31mTHERE IS NO FILE CONTENT TO MODIFY IN THIS FILE.\033[0m"<<endl;
}

/**
 * @brief This function accepts the program name and file name
 * for the use of the error message when user enters no modifications
 * @param progName the program name
 * @param fileName the file name
*/
void Filt::usageNoMod(char* prog, string file)
{
  cerr<<"\033[1;31mError: \033[0m"<<file<<endl;
  cerr<<"\033[1;31mUsage is: \033[0m"<<prog<<" \033[1;36m[filename] [modifier] (you can have multiple modifiers)\033[0m"<<endl;
  cerr<<"\033[1;31mYOU DID NOT ENTER A MODIFIER. YOUR FILE WAS NOT MODIFIED\033[0m"<<endl;
}

/**
 * @brief This function accepts the program name and file name
 * for the use of the error message when user enters an
 * incorrect modifier
 * @param progName the program name
 * @param fileName the file name
*/  
void Filt::usageWrongMod(char* prog, string file)
{
  cerr<<"\033[1;31mError: \033[0m"<<file<<endl;
  cerr<<"\033[1;31mUsage is: \033[0m"<<prog<<" \033[1;36m[filename] [modifier] (you can have multiple modifiers)\033[0m"<<endl;
  cerr<<"\033[1;31mYOU'VE ENTERED AN INCORRECT MODIFIER. YOUR FILE CONTENT WAS NOT MODIFIED CORRECTLY.\033[0m"<<endl;
}
