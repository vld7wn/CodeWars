package CatGogYear2;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTests {

    @Test
    public void zero() {
        assertArrayEquals(new int[]{0,0}, Dinglemouse.ownedCatAndDog(9,7));
    }

    @Test
    public void one() {
        assertArrayEquals(new int[]{1,1}, Dinglemouse.ownedCatAndDog(15,15));
        assertArrayEquals(new int[]{1,1}, Dinglemouse.ownedCatAndDog(18,21));
        assertArrayEquals(new int[]{1,1}, Dinglemouse.ownedCatAndDog(19,17));
    }

    @Test
    public void two() {
        assertArrayEquals(new int[]{2,2}, Dinglemouse.ownedCatAndDog(24,24));
        assertArrayEquals(new int[]{2,2}, Dinglemouse.ownedCatAndDog(25,25));
        assertArrayEquals(new int[]{2,2}, Dinglemouse.ownedCatAndDog(26,26));
        assertArrayEquals(new int[]{2,2}, Dinglemouse.ownedCatAndDog(27,27));
    }

    @Test
    public void ten() {
        assertArrayEquals(new int[]{10,10}, Dinglemouse.ownedCatAndDog(56,64));
    }

    // =========================================

    private static class DinglemouseAnswer20180128 {
        private static int[] ownedCatAndDog(final int catYears, final int dogYears) {
            final int ownedCat = catYears < 15 ? 0 : catYears < 24 ? 1 : 2 + (catYears-24)/4;
            final int ownedDog = dogYears < 15 ? 0 : dogYears < 24 ? 1 : 2 + (dogYears-24)/5;
            return new int[]{ownedCat, ownedDog};
        }
    }

    @Test
    public void random() {
        for (int r = 0; r < 100; r++) {
            final int catYears = (int)(Math.random() * 100) + 1;
            final int dogYears = (int)(Math.random() * 100) + 1;
            final int expected[] = DinglemouseAnswer20180128.ownedCatAndDog(catYears, dogYears);
            final int actual[] = Dinglemouse.ownedCatAndDog(catYears, dogYears);
            System.out.println(String.format("Random test %d: catYears=%d, dogYears=%d => %s", r+1, catYears, dogYears, Arrays.toString(expected)));
            assertArrayEquals(expected, actual);
        }
    }

}