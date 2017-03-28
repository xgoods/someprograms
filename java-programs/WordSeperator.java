import javax.swing.JOptionPane;
/**
* @author Brian Goodwin
* @version 1.0, Mar. 27, 2014
* The purpose of this program is to edit
* a sentence to be grammatically correct
**/
public class WordSeperator
{
	public static void main(String[] args)
	{

		StringBuilder sentence = new StringBuilder("StopAndSmellTheRoses"); //creates StringBuilder object
		char sentenceSpace = ' '; // holds a space

		JOptionPane.showMessageDialog(null,"The original string is: " + sentence);

		sentence.insert(4, sentenceSpace); //inserts a space at space 4
		sentence.deleteCharAt(5); //deletes the letter in space 5
		sentence.insert(5, "a"); //inserts lowercase a in space 5
		sentence.insert(8, sentenceSpace); //inserts a space at space 8
		sentence.deleteCharAt(9); //deletes the letter in space 9
		sentence.insert(9, "s"); //inserts lowercase s in space 9
		sentence.insert(14, sentenceSpace); //inserts a space at space 14
		sentence.deleteCharAt(15); //deletes the letter in space 15
		sentence.insert(15, "t"); //inserts lowercase t in space 15
		sentence.insert(18, sentenceSpace); //inserts a space at space 18
		sentence.deleteCharAt(19); //deletes letter in space 19
		sentence.insert(19, "r"); //inserts lowercase r in space 19

		JOptionPane.showMessageDialog(null,"The edited sentence is: " + sentence);

		System.exit(0); //exits JOptionPane
	} // exits main method
} //exits public class

/*-----------------------------------------------------------------------------------------------------------------------------------------------------------

1.0 import JOptionPane;

2.0 create StringBuilder object called sentence;

3.0 create char variable sentenceSpace initialized to ' ';

4.0 print original sentence;

5.0 insert a space at space 4;

6.0 delete the letter in space 5;

7.0 insert lowercase a in space 5;

8.0 insert a space at space 8;

9.0 deletes the letter in space 9;

10.0 insert lowercase s in space 9;

11.0 insert a space at space 14;

12.0 delete the letter in space 15;

13.0 insert lowercase t in space 15;

14.0 insert a space at space 18;

15.0 delete letter in space 19;

16.0 insert lowercase r in space 19;

17.0 print edited sentence;

18.0 exit JOptionPane;

19.0 end;

*/