import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class arrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(5); // this is how an array list is created
        // initial size of this array list is 5

        // for(int i=0;i<5;i++) list.add((int)(Math.random() * 10)); // adding 5 random values to the list
        // for(int i=0;i<5;i++) System.out.print(list.get(i) + " "); // printing them

        // instead of the for loop i could've just done
        // System.out.print(list);

        // add / remove methods
        // list.add(5);
        // list.add(3);
        // list.add(4);
        // list.add(1);
        // System.out.println(list);

        // list.remove(4);
        // System.out.println(list);

        // Multidimensional arrays in array list
        ArrayList<ArrayList<Integer>> exList = new ArrayList<>();
        // array list of array lists

        // initialisation for each element of the current array list
        // for (int i = 0; i < 3; i++) {
        //     exList.add(new ArrayList<>());
        // }


        // storing values --
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         exList.get(i).add(in.nextInt());
        //     }
        // }

        // System.out.println(exList); // [[1, 2, 3], [5, 4, 9], [7, 8, 5]]


        // Max value
        int[] nums = {1,45,123,11,34,24,5};
        System.out.println(getMax(nums));
        System.out.println(getMaxInRange(nums, 3, 6));
        
        
        // Reverse array
        // for(int n: nums) System.out.print(n + " ");
        // System.out.println();
        // reverseArr(nums);
        // for(int n: nums) System.out.print(n + " ");

        // Linear search
        System.out.println("Value found at index : " + linearSearch(nums, 11));

    }
    static int getMax(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
    static int getMaxInRange(int[] arr, int startIndex, int stopIndex){
        int max = arr[startIndex];
        if(stopIndex > arr.length || startIndex < 0) System.out.println("Enter a valid index");;
        for(int i=startIndex;i<stopIndex;i++){
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }

    // reverse array
    static void reverseArr(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static int linearSearch(int[] arr, int target){
        int index = 0;
        if(arr.length<0) return -1;
        for(int i=0;i<arr.length;i++) if(arr[i]==target) return i;
        return 0;
    }
}