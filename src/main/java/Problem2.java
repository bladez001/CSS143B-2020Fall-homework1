public class Problem2 {
    // Timothy Muresan
    // Do not change signature (function name, parameters)
    public static void bubbleSort(int[] data) {
        // Add your solution
        // sorts in ascending order
        int l = data.length;
        for (int i = 0; i < l-1; i++) {
            for (int j = 0; j < l - 1 - i; j++) {
                if (data[j] > data[j + 1]){
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] =temp;
                }
            }
        }
    }
}
