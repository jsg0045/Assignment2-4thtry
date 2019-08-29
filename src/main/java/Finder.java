// Joshua Gatlin
// 8/26/19
// Assignment 2
// Create two functions, one that finds the max in an array
// and another that finds the min.

public class Finder {
    // This method finds the max in an array.
    public int findMax(int[] intArray) {
        if (intArray == null) {
            return 0;
        }
        int max = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (max < intArray[i]) {
                max = intArray[i];
            }
        }
        return max;
    }

    // This method finds the min in an array.
    public int findMin(int[] intArray) {
        if (intArray == null) {
            return 0;
        }
        int min = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (min > intArray[i]) {
                min = intArray[i];
            }
        }
        return min;
    }
}
