import java.lang.reflect.Array;
import java.math.*;
import java.util.Arrays;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        // array declaration
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++) arr[i] = (int)(Math.random() * 10);
        // for(int i=0;i<arr.length;i++) System.out.print(arr[i] + " ");

        int[] newArr; // declaration of array
        //      --> reference variable name
        
        newArr = new int[5]; // initialisation : here the object is being created in the heap memory
        // this is called dynamic memory allocation

        // input -
        Scanner in = new Scanner(System.in);

        int[] numsArr = new int[5];
        // for(int i=0;i<numsArr.length;i++){
        //     System.out.print("Enter num : ");
        //     numsArr[i] = in.nextInt();
        // }

        // for(int num : numsArr) System.out.print(num + " ");

        // for integer array the default value is 0 and for String or Char array the default value is null.

        // Strings are immutable in java and arrays are mutable in java

        // passing array as arguments
        int nums[] = {1,2,3,4};
        // System.out.println(Arrays.toString(nums));
        change(nums);
        // System.out.println(Arrays.toString(nums)); // we see that the value is now changed to the value we set in the function.
    }
    static void change(int[] arr){
        arr[0] = 45;
    }
}
