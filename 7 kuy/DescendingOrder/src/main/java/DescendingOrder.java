
/**
 * Your task is to make a function that can take any non-negative
 * integer as an argument and return it with its digits in descending order.
 * Essentially, rearrange the digits to create the highest possible number.
 *
 * Examples:
 * Input: 42145
 * Output: 54421
 *
 * Input: 145263
 * Output: 654321
 *
 * Input: 123456789
 * Output: 987654321
 */

public class DescendingOrder {

    public static int sortDesc(final int num) {
        //Your code
        if (num <= 0) return 0;

        int sorteNumber = 0;

        for (int i = 9; i >= 0; i--) {
            int tmpNumber = num;
            System.out.print(tmpNumber + " " + i + "# ");

            while (tmpNumber > 0) {
                int digit = tmpNumber % 10;
                System.out.println(digit + "@ ");
                if (digit == i) {
                    sorteNumber *= 10;
                    System.out.print(sorteNumber + "% ");
                    sorteNumber += digit;
                    System.out.println(sorteNumber + "^ ");
                }
                tmpNumber /= 10;
                System.out.print(tmpNumber + "& ");
            }
        }
        System.out.println(sorteNumber);
        return sorteNumber;
    }
}
