/**
Brian Goodwin
CS241 march 28 2016
**/
public class Towers
{
    private int numDiscs;
    
    public Towers(int n)
    {
        numDiscs=n;
        
        moveDiscs(numDiscs,'A','C','B');
    }
    
    public void moveDiscs(int num, char fromPeg, char toPeg, char tempPeg)
    {
        if(num>0)
        {
            moveDiscs(num-1,fromPeg,tempPeg,toPeg);
            System.out.println("Move disc "+ num+" to tower " + fromPeg+" to peg "+toPeg);
            moveDiscs(num-1,tempPeg,toPeg,fromPeg);
        }
    }
}
        
