package VasyaClerk;

public class Line {
    public static String Tickets(int[] peopleInLine) {
        int money_25 = 0;
        int money_50 = 0;
        int money_100 = 0;

        for (int i = 0; i < peopleInLine.length; i++) {
            if (peopleInLine[i] == 25) {
                money_25++;

            } else if (peopleInLine[i] == 50 && money_25 > 0) {
                money_50++;
                money_25--;

            } else if (peopleInLine[i] == 100 && money_25 > 0 && money_50 > 0) {
                money_100++;
                money_50--;
                money_25--;

            } else if (money_25 > 2) {
                money_100 ++;
                money_25 -= 3;
            } else {
                return "NO";
            }
        }
        return "YES";
    }
}
