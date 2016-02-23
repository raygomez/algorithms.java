package sorter;

/**
 * Created by raygomez on 2/23/16.
 */
public class InsertionSort {

    private int[] input;

    public void sort(int[] in) {
        input = in;

        for (int i = 1; i < in.length; i++) {
            int key = input[i];
            int j = i - 1;
            while(j >= 0 && input[j] > key) {
                input[j+1] = input[j];
                j = j - 1;
            }
            input[j + 1] = key;
        }
    }


}
