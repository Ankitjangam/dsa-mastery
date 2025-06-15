import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicProblems {


    /* find maximum and minimum elements in arrays */
    public static void findMAx_And_Min(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i > max) {
                max = i;
            }

            if (i<min) {
                min = i;
            }

        }

        System.out.println("Max Element : " + max);
        System.out.println("Min Element :" + min);
    }



    /*sum all elements in an Array*/

    public static void sumOfAll(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum  : " + sum);
    }


    /* separate even and odd numbers*/

    public static void evenAndOdd(int[] arr) {

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int i : arr) {
            if (i % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }
        }

        System.out.println("Even Elements : " + even);
        System.out.println("Odd Elements : " + odd);
    }


    /*Count occurrences of a specific element in an array*/

    public static void count_occurrences(int[] arr , int num) {
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            if(num == arr[i]) {
                count++;
            }


        }

        System.out.println("Count Occurrence : " + num + " is " + count);
    }


    /* Find second largest and second-smallest elements*/
    public static void find_2ndLarge_And_2ndSmall_Ele(int[] arr) {

        int large = 0;
        int small =0;

        Arrays.sort(arr);
         small = arr[1];
         large = arr[arr.length-2];

        System.out.println("2nd Largest element : " + large);
        System.out.println("2nd Smallest element : " + small);
    }

    /*Reverse an array in-place*/
    public static void reverseArray_inPlace(int[] arr) {

        int start = 0;
        int end = arr.length-1;

        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start ++;
            end --;
        }

        System.out.println("Reversed Array : " + Arrays.toString(arr));

    }



    /*Swap first and last elements*/
    public static void swap_1st_And_Last_Ele(int[] arr) {


        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        System.out.println("Swapped Last and First Element : " + Arrays.toString(arr));

    }


}
