import java.math.*;;
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
    }
}
