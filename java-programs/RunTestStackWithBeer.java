/**
*@author Brian Goodwin
*@version 1.0 Oct 15, 2014 - modified Browers RunTestStackWithCar to work with Beer.java   
**/

public class RunTestStackWithBeer
{
    public static void main(String[] args)
    {
        TestStackGeneric<Beer> testStackBeer = new TestStackGeneric<Beer>();

        //Beers to add
        Beer[] arrayOfBeersToAdd = {
                    new Beer("Lagunitas", "A Little Sumpin", 10.99),
                    new Beer("DogFishHead","60 min IPA", 10.69),
                    new Beer("Ballast Point","Sculpin", 11.99),
                    new Beer("Ommegang","Hop House", 9.99),
                    new Beer("Weyerbacher","Last Chance IPA", 12.99),
                    new Beer("Allagash","Confluence", 11.99) };

    	testStackBeer.test(arrayOfBeersToAdd);
    }

}

/*
Display Stack Size on startup
Size: 0

===========
<<Start Pushes:

[Beer:  Lagunitas A Little Sumpin $10.99]

[Beer:  DogFishHead 60 min IPA $10.69]

[Beer:  Ballast Point Sculpin $11.99]

[Beer:  Ommegang Hop House $9.99]

[Beer:  Weyerbacher Last Chance IPA $12.99]

[Beer:  Allagash Confluence $11.99]
Stopped Pushing>>
===========


Display stack size after adds
Size: 6

Removed: 
[Beer:  Allagash Confluence $11.99]

Display stack size after 1 pop
Size: 5

===========
<<Start poping:

[Beer:  Weyerbacher Last Chance IPA $12.99]

[Beer:  Ommegang Hop House $9.99]

[Beer:  Ballast Point Sculpin $11.99]

[Beer:  DogFishHead 60 min IPA $10.69]

[Beer:  Lagunitas A Little Sumpin $10.99]
Stopped Poping>>
===========

Display stack size after pop all
Size: 0

attempt to remove 1 item from an empty stack: good

Display stack size after 1 pop
Size: 0
*/

