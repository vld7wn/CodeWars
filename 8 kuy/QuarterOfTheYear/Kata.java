package QuarterOfTheYear;

import java.time.Month;
import java.time.temporal.IsoFields;

/**
Given a month as an integer from 1 to 12,
return to which quarter of the year it belongs as an integer number.
For example: month 2 (February),
is part of the first quarter;
month 6 (June),
is part of the second quarter;
and month 11 (November),
is part of the fourth quarter.
*/

public class Kata {
    public static int quarterOf(int month) {
        // Your code here
        return Month.of(month).get(IsoFields.QUARTER_OF_YEAR);
    }
}
