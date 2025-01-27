import java.util.Arrays;
import java.util.Random;

public class Hw2Tasks {
    public static void main(String[] args) {
        fillArrayAndCalculateAverage();
        findMaxValue();
    }

    public static void fillArrayAndCalculateAverage() {
        int[] arr = new int[55];
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10 + random.nextInt(90); // generate from 10 to 99
        }
        for (int array : arr) {
            sum += array;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Elements of array: " + arr.length);
        System.out.println("Sum of elements: " + sum);

        double average = (double) sum / arr.length;
        System.out.println("Average value: " + average);
    }

    public static void findMaxValue() {
        int[] arr1 = new int[20];
        Random random = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 1 + random.nextInt(9); // generate from 1 to 9
        }
        System.out.println(Arrays.toString(arr1));

        int maxValue = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > maxValue) {
                maxValue = arr1[i];
            }
        }
        System.out.println("Max value of array: " + maxValue);
    }
}
