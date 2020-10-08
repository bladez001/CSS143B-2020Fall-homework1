public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        // Add your solution
        //Timothy Muresan
        int r = data.length - 1;
        for (int l = 0; l <= r; ) {
            int val = l + (r - l) / 2;

            // check if target is present at midpoint
            if (data[val] == target) {
                return val;
            }

            // ignore left half if target is greater
            if (data[val] < target) {
                l = val + 1;
            }

            // ignore right side if target is smaller
            else {
                r = val - 1;
            }
        }
        // If the program reaches this point, the target was not found.
        return -1;
    }
}
