/**
*@author Brian Goodwin
*@version 1.0 Oct 26, 2014 - modified browers RunTestQueueWithCar to work with Beer class
**/

public class RunTestQueueWithBeer
{
    public static void main(String[] args)
    {
        TestQueueGeneric<Beer> testQueueBeer = new TestQueueGeneric<Beer>();

        Beer[] arrayOfBeersToAdd = {
                    new Beer("Lagunitas", "A Little Sumpin", 10.99),
                    new Beer("DogFishHead","60 min IPA", 10.69),
                    new Beer("Ballast Point","Sculpin", 11.99),
                    new Beer("Ommegang","Hop House", 9.99),
                    new Beer("Weyerbacher","Last Chance IPA", 12.99),
                    new Beer("Allagash","Confluence", 11.99) };

        testQueueBeer.test(arrayOfBeersToAdd );
    }

}

/*
Display Queue Size on startup
Size: 0

===========
<<Start adds:

[Beer:  Lagunitas A Little Sumpin $10.99]

[Beer:  DogFishHead 60 min IPA $10.69]

[Beer:  Ballast Point Sculpin $11.99]

[Beer:  Ommegang Hop House $9.99]

[Beer:  Weyerbacher Last Chance IPA $12.99]

[Beer:  Allagash Confluence $11.99]
Stopped adding>>
===========


Display Queue size after adds
Size: 6

Removed: 
[Beer:  Lagunitas A Little Sumpin $10.99]

Display Queue size after 1 remove
Size: 5

===========
<<Start removing:

[Beer:  DogFishHead 60 min IPA $10.69]

[Beer:  Ballast Point Sculpin $11.99]

[Beer:  Ommegang Hop House $9.99]

[Beer:  Weyerbacher Last Chance IPA $12.99]

[Beer:  Allagash Confluence $11.99]
Stopped removing>>
===========

Display Queue size after remove all
Size: 0

attempt to remove 1 item from an empty Queue: good

Display Queue size after 1 remove
Size: 0

*/

