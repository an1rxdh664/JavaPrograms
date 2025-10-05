import java.util.Arrays;
import java.util.Scanner;
public class functions {
    /* Format -->
        return_type name(){
            //body
            return ...;
        }
    */
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        String myMessage = myGreet("Anirudh");
        // System.out.println(myMessage);
        // getNums(1,2,3,5,6,5,32,1,23); // this is callled variable arguments

        // multiple(1,2,"Anirudh", "Badmaas", "Bob");
        /* 
            1
            2
            [Anirudh, Badmaas, Bob]
        */
    }
    
    // multiple arguments
    static void multiple(int a, int b, String ...s){
        // in case of variable multiple arguments, the ...var should always come at the end because we don't know how many elements will there be in the variable argument.
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(s));
    }
    
    // Variable arugments - varArgs - It is used when we don't know how many arguments we want to pass onto a function
    // takes the collection of inputs and make an array out of it
    
    static void getNums(int ...nums){ //varArgs
        System.out.println(Arrays.toString(nums)); // [1, 2, 3, 5, 6, 5, 32, 1, 23]
    }


    static String myGreet(String name){
        return "Hello " + name;
    }


    // function overloading - is when we have functions of the same name but which takes different number of arguments
    // it checks which method to call or execute based on the passed argument during compilation
}
