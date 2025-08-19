import java.util.Scanner;
public class functions {
    // public static int calArea(int length, int breadth){
    //     return length * breadth;
    // }

    public static String revString(String inputString){
        String rev = "";
        for(int i=inputString.length()-1;i>=0;i--){
            rev += inputString.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // System.out.print("Enter length : ");
        // int l = inp.nextInt();
        // System.out.print("Enter breadth : ");
        // int b = inp.nextInt();
        // System.out.print("Area : " + calArea(l, b));
        
        
        System.out.print("Enter String : ");
        String inString = inp.next();
        System.out.println("Reversed String : " + revString(inString));
    }
}