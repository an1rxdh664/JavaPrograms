import java.util.Scanner;
// public class functions {
//     // public static int calArea(int length, int breadth){
//     //     return length * breadth;
//     // }

//     public static String revString(String inputString){
//         String rev = "";
//         for(int i=inputString.length()-1;i>=0;i--){
//             rev += inputString.charAt(i);
//         }
//         return rev;
//     }
//     public static void main(String[] args) {
//         Scanner inp = new Scanner(System.in);
//         // System.out.print("Enter length : ");
//         // int l = inp.nextInt();
//         // System.out.print("Enter breadth : ");
//         // int b = inp.nextInt();
//         // System.out.print("Area : " + calArea(l, b));
        
        
//         System.out.print("Enter String : ");
//         String inString = inp.next();
//         System.out.println("Reversed String : " + revString(inString));
//     }
// }

// constructor with parameter



public class functions{
    static class Student{
        String name;
        int age;
        Scanner input = new Scanner(System.in);
    
        public void insert_data(String name, int age){
            System.out.println("Enter name : ");
            this.name = input.nextLine();
    
    
            System.out.println("Enter age : ");
            this.age = input.nextInt();
        };
    
        public void show_data(){
            System.out.println("Your name : " + name);
            System.out.println("Your age : " + age);
        };
    }
    // declaration
    public static String example_function(){
        return "Hello World";
    }

    public static int add(int a, int b){
        return a + b;
    }


    public static void main(String []args){
        // function call ->
        // System.out.println(example_function());

        // parameter and arguments
        // System.out.println(add(2,3));

        Student st1 = new Student("Anirudh", 20);
        
    }
}