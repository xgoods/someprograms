/**
*@author Brian Goodwin
*@version 1.0.0 Dec. 6, 2014 - modified browers Test_Lab_11_Car to work with Beer class
**/
public class Test_Lab_11_Beer
{
    public static void main(String[] args)
    {
        Tree<Beer> myTree = new Tree<Beer>();

        System.out.println("Before adds, Tree: (Size == "+myTree.size()+")");

        myTree.add(new Beer("Anchor Steam", "Christmas ale", 10.99));
        myTree.add(new Beer("DogFishHead","60 min IPA", 10.69));
        myTree.add(new Beer("Ballast Point","Sculpin", 11.99));
        myTree.add(new Beer("Ommegang","Hop House", 9.99));
        myTree.add(new Beer("Weyerbacher","Last Chance IPA", 12.99));
        myTree.add(new Beer("Allagash","Confluence", 11.99));

        BTNode<Beer> root = myTree.getRoot();
        root.inorderPrint();
        System.out.println("\nTree after adds (Size == "+myTree.size()+")");
	}
}

/* Output is:
Before adds, Tree: (Size == 0)

[Beer:  Allagash Confluence $11.99]

[Beer:  Anchor Steam Christmas ale $10.99]

[Beer:  Ballast Point Sculpin $11.99]

[Beer:  DogFishHead 60 min IPA $10.69]

[Beer:  Ommegang Hop House $9.99]

[Beer:  Weyerbacher Last Chance IPA $12.99]

Tree after adds (Size == 6)
*/
