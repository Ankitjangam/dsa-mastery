import java.util.Arrays;
import java.util.Scanner;

/*  Problem No1 and No2 here Only*/

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //create an arrays
        System.out.println("Enter The length of an Array");
        int n = scan.nextInt();
        int[] arr = new int[n];



        System.out.println("Enter The Elements of Array");

        // Take inputs from Users
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }


        System.out.println();
        //1. print all elements in an Array
        System.out.println("Original Array : " + Arrays.toString(arr));


        /*Find Maximum and Minimum Elements in Array*/
        System.out.println();
        System.out.println("Maximum And Minimum Ele in an Array............................................");
        BasicProblems.findMAx_And_Min(arr);

        /*Sum of Elements in Array*/
        System.out.println();
        System.out.println("Sum of all Elements  of Array...................................................");
        BasicProblems.sumOfAll(arr);

        /*Find Odd and Even Elements in an Array*/
        System.out.println();
        System.out.println("Even and Odd Elements in an Array................................................");
        BasicProblems.evenAndOdd(arr);


         /*Count occurrences of a specific element in an array*/
        System.out.println();
        /*number */
        System.out.println("Enter The countable Element");
        int num =scan.nextInt();
        System.out.println("Count occurrences of a specific element............................................");
        BasicProblems.count_occurrences(arr,num);


        /*Find second largest and second-smallest elements*/
        System.out.println();
        System.out.println("2nd Largest and 2nd Smallest Element in an Array....................................");
        BasicProblems.find_2ndLarge_And_2ndSmall_Ele(arr);


        /*Reverse an array in-place*/

        System.out.println();
        System.out.println("Reversed an array in-place");
        BasicProblems.reverseArray_inPlace(arr);


        /*Swap first and last elements*/


        System.out.println();
        //1. print all elements in an Array
        System.out.println("Original Array : " + Arrays.toString(arr));

        System.out.println();
        System.out.println("Swap first and last elements........................................................");
        BasicProblems.swap_1st_And_Last_Ele(arr);


    }
}
