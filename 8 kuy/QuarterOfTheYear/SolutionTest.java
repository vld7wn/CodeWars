package QuarterOfTheYear;

import org.junit.Test;
import java.util.*;
import java.util.stream.*;

public class SolutionTest {
    @Test
    public void fixedTests() {
        // Tester.doTest( 3, 1);
       // Tester.doTest( 8, 3);
        //Tester.doTest(11, 4);
    }
    @Test
    public void randomTests() {
        final List<Integer> trials = IntStream.rangeClosed(1, 12).boxed().collect(Collectors.toList());
        Collections.shuffle(trials);
      //  trials.forEach(month -> Tester.doTest(month, (int)Math.ceil(month / 3.0)));
    }
}
