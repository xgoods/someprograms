/**
*@author Brian Goodwin
*@version 1.0 Oct.8, 2014 - modified Browers RunTestLinkedBagWithCar.java to run with
* Beer.java class file
**/

public class RunTestLinkedBagWithBeer
{
    public static void main(String[] args)
    {
        TestLinkedBagGeneric<Beer> testLinkedBagBeer = new TestLinkedBagGeneric<Beer>();

        /*
        * Beers to add
        */
        Beer[] arrayOfBeersToAdd = {
                    new Beer("Lagunitas", "A Little Sumpin", 10.99),
                    new Beer("DogFishHead","60 min IPA", 10.69),
                    new Beer("Ballast Point","Sculpin", 11.99),
                    new Beer("Ommegang","Hop House", 9.99),
                    new Beer("Weyerbacher","Last Chance IPA", 12.99),
                    new Beer("Allagash","Confluence", 11.99) };

   		/*
   		*Beers to search for
   		*/
        Beer[] arrayOfBeersToSearchFor = {
                    new Beer("Founders","Dirty Bastard", 12.99),
                    new Beer("Ballast Point","Sculpin", 11.99),
                    new Beer("Dogfishhead","60 min ipa", 10.69),
                    new Beer("Allagash","ConFluence", 11.99) };
        
        /*
        *Beers to delete
        */
        Beer[] arrayOfBeersToDelete = {
                    new Beer("Founders","Dirty Bastard", 12.99),
                    new Beer("Ballast Point","Sculpin", 11.99),
                    new Beer("DogfishHead","60 Min IPA", 10.69),
                    new Beer("Allagash","Confluence", 11.99) };

        testLinkedBagBeer.test ( arrayOfBeersToAdd,
                                   arrayOfBeersToSearchFor,
                                   arrayOfBeersToDelete );
    }

}



