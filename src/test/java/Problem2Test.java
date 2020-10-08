import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Problem2Test {

    // Example test
    // Okay to change
    // add your tests here
    // Timothy Muresan
    @Test
    public void testBubbleSort() {
        int inputs[][] = {
                {},
                {1},
                {0, 2},
                {3, 1},
                {3, 2, 1},
                {3, 2, 5, 7},
                {4, 3, 1},
                {5, 2, 3, 1, 8}
        };
        int answer[][] = {
                {},
                {1},
                {0, 2},
                {1, 3},
                {1, 2, 3},
                {2, 3, 5, 7},
                {1, 3, 4},
                {1, 2, 3, 5, 8}
        };

        assertEquals(inputs.length, answer.length);

        for (int i=0; i<inputs.length; i++) {

            Problem2.bubbleSort(inputs[i]);
            //System.out.println(Arrays.toString(inputs[i]));
            assertArrayEquals(inputs[i], answer[i]);
        }
    }
}
