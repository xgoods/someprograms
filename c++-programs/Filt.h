/**
 * @file Filt.h
 * @brief This the header file for the FiltMain.cpp
 * It contains the function outline for FiltMain.cpp
 * @author Brian Goodwin
 * @version 1.0.0
 * @date 9-18-15
 * @note CS 280, S003, FALL 2015, Assignment #1
*/
#ifndef FILT_H
#define FILT_H
#include <string>
class Filt
{
  private:
	char* fileContent; ///< holds the file content
	char* progName; ///< holds the program name
	std::string fileName; ///< holds the file name
  
  public:
	/**
	 * @brief This constructor accepts the file contents
	 * It is used for the removal of file content
	 * @param fileContent the file content
	*/
	Filt(char* fileContent);
	
	/**
	 * @brief This constructors accepts the program name
	 * and file name for the error functions
	 * @param progName the program name
	 * @param fileName the file name
	*/
	Filt(char* progName, std::string fileName);
	
	/**
	 * @brief This function accepts the file content
	 * and removes all vowels
	 * @param content the file content
	 * @return The file content without vowels
	*/
	char* removeVowel(char* content);
	
	/**
	 * @brief This function accepts the file content
	 * and removes all uppercase vowels
	 * @param content the file content
	 * @return the file content without uppercase vowels
	*/
	char* removeUpperVowel(char* content);
	
	/**
	 * @brief This function accepts the file content
	 * and removes all consonants
	 * @param content the file content
	 * @return the file content without consonants
	*/ 
	char* removeConsonant(char* content);
	
	/**
	 * @brief This function accepts the file content
	 * and removes all uppercase consonants
	 * @param content the file content
	 * @return the file content without uppercase consonants
	*/  
	char* removeUpperConsonant(char* content);
	
	/**
	 * @brief This function accepts the file content
	 * and removes all letters
	 * @param content the file content
	 * @return the file content without letters
	*/  
	char* removeLetter(char* content);
	
	/**
	 * @brief This method accepts the file content
	 * and removes all uppercase letters
	 * @param content the file content
	 * @return the file content without uppercase letters
	*/  
	char* removeUpperLetter(char* content);
	
	/**
	 * @brief This function accepts the file content
	 * and removes all lowercase consonants
	 * @param content the file content
	 * @return the file content without lowercase consonants
	*/  
	char* removeLowerConsonant(char* content);
	
	/**
	 * @brief This function accepts the file content
	 * and removes all lowercase vowels
	 * @param content the file content
	 * @return the file content without lowercase vowels
	*/  
	char* removeLowerVowel(char* content);
	
	/**
	 * @brief This function accepts the file content
	 * and removes all lowercase letters
	 * @param content the file content
	 * @return the file content without lowercase letters
	*/  
	char* removeLowerLetter(char* content);
	
	/**
	 * @brief This function accepts the file content
	 * and removes all numbers
	 * @param content the file content
	 * @return the file content without numbers
	*/  
	char* removeNumber(char* content);
	
	/**
	 * @brief This function accepts the file content
	 * and removes all whitespaces
	 * @param content the file content
	 * @return the file content without whitespaces
	*/  
	char* removeSpace(char* content);
	
	/**
	 * @brief This function accepts the file content
	 * and removes all punctuation
	 * @param content the file content
	 * @return the file content without punctuation
	*/  
	char* removePunct(char* content);
	
	/**
	 * @brief This function accepts the file content
	 * and removes all words
	 * @param content the file content
	 * @return the file content without words
	*/  
	char* removeWord(char* content);
	
	/**
	 * @brief This function accepts the file content
	 * and removes all lowercase words
	 * @param content the file content
	 * @return the file content without lowercase words
	*/  
	char* removeLowerWord(char* content);
	
	/**
	 * @brief This function accepts the file content
	 * and removes all uppercase words
	 * @param content the file content
	 * @return the file content without uppercase words
	*/  
	char* removeUpperWord(char* content);
	
	/**
	 * @brief This function accepts the program name and file name
	 * for the use of the error message when user enters no file
	 * or wrongly spelt file to be modified
	 * @param progName the program name
	 * @param fileName the file name
	*/  
	void usageFile(char* progName, std::string fileName);
	
	/**
	 * @brief This function accepts the program name and file name
	 * for the use of the error message when user enters a null file
	 * to be modified
	 * @param progName the program name
	 * @param fileName the file name
	*/  
	void usageFileNull(char* progName, std::string fileName);
	
	/**
	 * @brief This function accepts the program name and file name
	 * for the use of the error message when user enters no modifications
	 * @param progName the program name
	 * @param fileName the file name
	*/  
	void usageNoMod(char* prog, std::string file);
	
	/**
	 * @brief This function accepts the program name and file name
	 * for the use of the error message when user enters too many
	 * arguements or just 1 arguement
	 * @param progName the program name
	 * @param fileName the file name
	*/  
	void usageArgs(char* prog, std::string file);
	
	/**
	 * @brief This function accepts the program name and file name
	 * for the use of the error message when user enters an
	 * incorrect modifier
	 * @param progName the program name
	 * @param fileName the file name
	*/  
	void usageWrongMod(char* prog, std::string file);
};

#endif