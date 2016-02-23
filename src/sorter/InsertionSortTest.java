package sorter;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by raygomez on 2/23/16.
 */
public class InsertionSortTest {

    @Test
    public void testSort() throws Exception {

        int[] array = new int[]{1, 2, 3, 4};
        new InsertionSort().sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4}, array);
    }

    @Test
    public void testSortInverted() throws Exception {

        int[] array = new int[]{4, 3, 2, 1};
        new InsertionSort().sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4}, array);
    }


}