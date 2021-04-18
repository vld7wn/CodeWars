package SpeedControl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GpsSpeedTest {
    private static int randInt(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
    private static void testing(long actual, long expected) {
        assertEquals(expected, actual);
    }
    private static double[] calcX(int n) {
        double[] x = new double[n];
        x[0] = 0.0; int prev = 0;
        for (int i = 1; i < n; i++) {
            int v = randInt(1, 25);
            while (v < prev) {
                v++;
            }
            prev = v;
            x[i] = i * v / 100.0;
        }
        return x;
    }
    public static int gpsSol(int s, double[] x) {
        if (x.length <= 1) return 0;
        double mx = 1; double v = 0;
        for (int k = 0; k < x.length - 1; k++) {
            v = (3600 * (x[k + 1] - x[k]) / s);
            if (v > mx) mx = v;
        }
        return (int)Math.floor(mx);
    }

    @Test
    public void test1() {
        System.out.println("Fixed Tests: gps");
        double[] x = new double[] {0.0, 0.23, 0.46, 0.69, 0.92, 1.15, 1.38, 1.61};
        testing(GpsSpeed.gps(20, x), 41);
        x = new double[] {0.0, 0.11, 0.22, 0.33, 0.44, 0.65, 1.08, 1.26, 1.68, 1.89, 2.1, 2.31, 2.52, 3.25};
        testing(GpsSpeed.gps(12, x), 219);
        x = new double[] {0.0, 0.18, 0.36, 0.54, 0.72, 1.05, 1.26, 1.47, 1.92, 2.16, 2.4, 2.64, 2.88, 3.12, 3.36, 3.6, 3.84};
        testing(GpsSpeed.gps(20, x), 80);
        x = new double[] {0.0, 0.01, 0.36, 0.6, 0.84, 1.05, 1.26, 1.47, 1.68, 1.89, 2.1, 2.31, 2.52, 2.73, 2.94, 3.15};
        testing(GpsSpeed.gps(14, x), 90);
        x = new double[] {0.0, 0.02, 0.36, 0.54, 0.72, 0.9, 1.08, 1.26, 1.44, 1.62, 1.8};
        testing(GpsSpeed.gps(17, x), 72);
        x = new double[] {0.0, 0.24, 0.48, 0.72, 0.96, 1.2, 1.44, 1.68, 1.92, 2.16, 2.4};
        testing(GpsSpeed.gps(12, x), 72);
        x = new double[] {0.0, 0.02, 0.44, 0.66, 0.88, 1.1, 1.32, 1.54, 1.76};
        testing(GpsSpeed.gps(17, x), 88);
        x = new double[] {0.0, 0.2, 0.4, 0.6, 0.8, 1.0, 1.32, 1.54, 1.76, 1.98, 2.2, 2.42, 2.76, 2.99, 3.22, 3.45};
        testing(GpsSpeed.gps(16, x), 76);
        x = new double[] {0.0, 0.01, 0.36, 0.75, 1.0, 1.25, 1.5, 1.75, 2.0, 2.25, 2.5, 2.75, 3.0, 3.25, 3.5, 3.75, 4.0, 4.25, 4.5, 4.75};
        testing(GpsSpeed.gps(17, x), 82);
        x = new double[] {0.0, 0.2, 0.4, 0.69, 0.92, 1.15, 1.38, 1.61, 1.92, 2.16, 2.4, 2.64, 2.88, 3.12, 3.36};
        testing(GpsSpeed.gps(19, x), 58);
        x = new double[] {};
        testing(GpsSpeed.gps(19, x), 0);
        x = new double[] {0.0};
        testing(GpsSpeed.gps(19, x), 0);
    }
    @Test
    public void test4() {
        System.out.println("Random Tests");
        for (int i = 0; i < 200; i++) {
            int n = randInt(10, 25);
            double[] x = calcX(n);
            int s = randInt(12, 50);
            testing(GpsSpeed.gps(s, x), gpsSol(s, x));
        }
    }
}