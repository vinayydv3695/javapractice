public class maxarray {
    public static void main(String[] args) {
        // Declaring an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing and printing elements of the array
        System.out.println("Element at index 0: " + numbers[0]);
        System.out.println("Element at index 1: " + numbers[1]);
        System.out.println("Element at index 2: " + numbers[2]);
        System.out.println("Element at index 3: " + numbers[3]);
        System.out.println("Element at index 4: " + numbers[4]);

        // Finding the maximum and minimum elements in the array
        int max = findMax(numbers);
        int min = findMin(numbers);

        // Printing the maximum and minimum elements
        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);
    }

    // Function to find the maximum value in the array
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Function to find the minimum value in the array
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}

