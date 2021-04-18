package Multiplesof3or5;

public class Solution {
    public int solution ( int number) {

        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        return sum;
    }
}
