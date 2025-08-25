import java.util.ArrayList;
import java.util.Arrays;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(5); // this is how an array list is created
        // initial size of this array list is 5

        for(int i=0;i<5;i++) list.add((int)(Math.random() * 10)); // adding 5 random values to the list
        for(int i=0;i<5;i++) System.out.print(list.get(i) + " "); // printing them
    }
}