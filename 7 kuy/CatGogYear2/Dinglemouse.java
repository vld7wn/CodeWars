package CatGogYear2;


/**
This is related to my other Kata about cats and dogs.
Kata Task
I have a cat and a dog which I got as kitten / puppy.
I forget when that was, but I do know their current ages as catYears and dogYears.
Find how long I have owned each of my pets and return as a list [ownedCat, ownedDog]
NOTES:
Results are truncated whole numbers of "human" years
Cat Years
15 cat years for first year
+9 cat years for second year
+4 cat years for each year after that
Dog Years
15 dog years for first year
+9 dog years for second year
+5 dog years for each year after that
 */

public class Dinglemouse {
    public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
        // Your code here!
        return new int[]{calculate(catYears, 4), calculate(dogYears, 5)};
    }
    public static int calculate(int petYears, int fiveorfour) {
        if(petYears < 15) return 0;
        if(petYears < 24) return 1;
        else {
            int toHumanYears = 2 + (petYears - 24) / fiveorfour;
            return toHumanYears;
        }
    }
}
