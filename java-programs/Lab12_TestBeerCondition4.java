/**
*@Brian Goodwin
*@version 1.0.0 Dec. 6, 2014 - modified Browers Lab12_TestCarCondition4 to work with Beer class
**/
public class Lab12_TestBeerCondition4
{
    public static void main(String args[])
    {
        Tree<Beer> myTree = new Tree<Beer>();
        Beer valueToRemove = new Beer("Ballast Point","Sculpin",11.99);
        BTNode<Beer> root;

        myTree.add(new Beer("Ballast Point","Sculpin", 11.99));
        myTree.add(new Beer("Allagash","Confluence", 11.99));
        myTree.add(new Beer("DogFishHead","60 min IPA", 10.69));
        myTree.add(new Beer("Weyerbacher","Last Chance IPA", 12.99));
        myTree.add(new Beer("Ommegang","Hop House", 9.99));
        myTree.add(new Beer("Anchor Steam", "Christmas ale", 10.99));

        System.out.println("Tree before removal (Size == "+myTree.size()+")");
        root = myTree.getRoot();
        root.inorderPrint();

        // attempt to remove valueToRemove
        if (myTree.remove(valueToRemove))
            System.out.println("\n"+valueToRemove + " removed");
        else
            System.out.println("\n"+valueToRemove + " not removed");

        System.out.println("\nTree After removal (Size == "+myTree.size()+")");
        root = myTree.getRoot();
        root.inorderPrint();

    }
}
/* output should be:
Tree before removal (Size == 6)
[Beer:  Allagash Confluence $11.99]
[Beer:  Anchor Steam Christmas ale $10.99]
[Beer:  Ballast Point Sculpin $11.99]
[Beer:  DogFishHead 60 min IPA $10.69]
[Beer:  Ommegang Hop House $9.99]
[Beer:  Weyerbacher Last Chance IPA $12.99]
test4

[Beer:  Ballast Point Sculpin $11.99] removed

Tree After removal (Size == 5)
[Beer:  Allagash Confluence $11.99]
[Beer:  Anchor Steam Christmas ale $10.99]
[Beer:  DogFishHead 60 min IPA $10.69]
[Beer:  Ommegang Hop House $9.99]
[Beer:  Weyerbacher Last Chance IPA $12.99]

*/
