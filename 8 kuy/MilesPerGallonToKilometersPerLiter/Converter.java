package MilesPerGallonToKilometersPerLiter;


/**
 *
Sometimes, I want to quickly be able to convert miles
per imperial gallon into kilometers per liter.
Create an application that will display the number of
kilometers per liter (output) based on the number of miles per imperial gallon (input).
Make sure to round off the result to two decimal points.
If the answer ends with a 0, it should be rounded off
without the 0. So instead of 5.50, we should get 5.5.
Some useful associations relevant to this kata:
1 Imperial Gallon = 4.54609188 litres
1 Mile = 1.609344 kilometres

*/

/**
1 британский галон/мтля == 0,354006189955917 км/л
*/
import java.math.BigDecimal;

public class Converter {

    public static float mpgToKPM(final float mpg) {
        return BigDecimal.valueOf(mpg * 1.609344f / 4.54609188f).setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
    }
}