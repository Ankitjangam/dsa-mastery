import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //create an arrays
        System.out.println("Enter The length of an Array");
        int n = scan.nextInt();
        int [] arr = new int[n];


        System.out.println("Enter The Elements of Array");

        // Take inputs from Users
        for(int i=0;i<arr.length;i++) {
            arr[i]=scan.nextInt();
        }

        System.out.println("Original Array : " + Arrays.toString(arr));





    }
}
