import javax.swing.JOptionPane;
/**
* @author Brian Goodwin
* @version 1.0 Mar. 27, 2014
* The purpose of this program is to translate a sentence
* to pig latin
**/
public class PigLatin
{
	public static void main(String[] args)
	{

		StringBuilder sentence = new StringBuilder("I thoroughly enjoy pig latin"); //creates StringBuilder object

		JOptionPane.showMessageDialog(null,"The original sentence is: " + sentence);

		sentence.insert(1, "ay"); //inserts string "ay" in space 1
		sentence.delete(4,6); //deletes letters in spaces 4 through 6
		sentence.insert(12, "thay"); //inserts string "thay" in space 12
		sentence.insert(22, "ay"); //inserts string "ay" in space 22
		sentence.deleteCharAt(25); //deletes letter in space 25
		sentence.insert(27, "pay"); //inserts string "pay" in space 27
		sentence.deleteCharAt(31); //deletes letter in space 31
		sentence.insert(35, "lay"); //inserts string "lay" in space 35

		JOptionPane.showMessageDialog(null,"The pig latin translation is: " + sentence);

		System.exit(0); //exits JOptionPane
	} //exits main method
} //exits public class

/*-----------------------------------------------------------------------------------------------------------------------------------------------------------

1.0 import JOptionPane;

2.0 create StringBuilder object named sentence;

3.0 print original sentence;

4.0 insert string "ay" in space 1;

5.0 delete letters in spaces 4 through 6;

6.0 insert string "thay" in space 12;

7.0 insert string "ay" in space 22

8.0 delete letter in space 25;

9.0 insert string "pay" in space 27;

10.0 delete letter in space 31;

11.0 insert string "lay" in space 35;

12.0 print original sentence translated to pig latin;

13.0 exit JOptionPane;

14.0 end;

*/