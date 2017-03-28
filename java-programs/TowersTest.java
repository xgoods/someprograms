/**
Brian Goodwin
CS241 march 28 2016
**/

import java.util.Scanner;
public class TowersTest
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of discs(max 6): ");
        int numOfDiscs=keyboard.nextInt();
        
        Towers hanoiTowers=new Towers(numOfDiscs);
        
        
    }
}
