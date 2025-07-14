/* Data type :
    Primitive, Non-Primitive
        Primitive : 
            int :
                byte, short, long
            float :
                double, float
                Java by default support double,
                    but to use float, we have to explecitely put an f in the variable.

            character
            boolean

*/
// public class basics {
//     public static void main(String[] args) {
        
//         // Data types
//         int num = 5;
//         int dig = 1_00_000_000;
//         // in java we can separate zeroes like this to maintain readabilty
//         System.out.println(num);
//         System.out.println(dig);
        
//         double num1 = 10.65; // by default float container
//         float num3 = 10.4f; // explicit f
        
//         System.out.println(num1);
//         System.out.println(num3);
        
//         char str = 'A';
//         System.out.println(str);
//     }
// }

/* Type conversion in JAVA
    Implicit and explicit conversion

    explicit conversion is when we decalre the conversion
        like :
            byte b = 10;
            int a = 3;
            b = (byte)a;
                --> This is called CASTING

    implicit conversion takes place when we try to assign a value of a data type which has lower range than the variable we are assigning it into a variable with a ranger bigger than it.
        like :
            int a = 10;
            byte b = 9;
            a = b;  --> this works fine
                --> This is called CONVERSION
    
    Type promotion
        --> promotion of a data type into another after some operation which leads to the value of that data type going out of it's range
        like :
            byte a = 10;
            byte b = 30;
            int res = b * a;
                --> this is type promotion, bytes are now converted into integers.
*/
// public class basics{
//     public static void main(String[] args) {
//         // explicit conversion
//         // byte b = 10;
//         // int a = 19;
//         // // b = a; // This would result in error even if the value of the integer a is in the range of byte b
//         // b = (byte)a;
//         // System.out.println(b);

//         // implicit conversion
//         // int a = 10;
//         // byte b = 0;
//         // a = b;
//         // System.out.println(a); 
//     }
// }

// A basic example of methods in java :
// class Calculate{
//     public int add(int num1,int num2, int num3){
//         int result = num1 + num2 + num3;
//         return result;
//     }
    
//     // If we add another Method of the same name
//     // which have different parameters or return type
//     // it would be called method overloading.
//     // and it can be done in java
//     public int add(int n1,int n2){
//         return n1 + n2;
//     }
// }
// public class basics{
//     public static void main(String[] args) {
//         Calculate calc = new Calculate();
//         int a = 4;
//         int b = 5;
//         // int res = calc.add(a,b);,
//         int res = calc.add(a,b,10);
//         System.out.println(res);
//     }
// }



// In JVM every method has it's own stack memory.
//      --> all the local variables are stored in this.

// Objects in Java resides in the heap memory.
//      --> which contains all the instance variable
//          --> Let's say i created a variable named int num, the definition of it will be in the heap
//              it occupies space in the stack memory


// import java.util.Scanner;

// Arrays :
// public class basics{
//     public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // to take inputs in java
        // System.out.print("Enter your name : ");
        // String name = scan.nextLine();
        // intialize a scanner which scans the input
        // System.out.print("Hello "+name+" !");
        // Declaration and printing an array
        // int arr[] = {1,2,3,4};
        // for(int i=0;i<4;i++) System.out.println(arr[i]);
        
        // int arr[] = new int[4];
        // this creates an array of 4 elements each assigned 0 at the moment.
        // for(int i=0;i<4;i++) System.out.println(arr[i]);

        // Multi dimensional arrays 
        // int arr[][] = new int[3][4];
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<4;j++){
        //         // This generates a random value and stores into the multidimensional array
                
        //         arr[i][j] = (int)(Math.random() * 100);
        //             // Multiplying by 100 returns double dig val
        //             // Multiplying by 10 returns single dig val

        //         System.out.print(arr[i][j] + " ");
        //     } System.out.println();
        // }

        // multidimensional jagged array
        // int jagAr[][] = new int[3][];
        // // in jagged array, we have defined amount of rows but not columns

        // // declaring how many values will each row contain
        // jagAr[0] = new int[4];
        // jagAr[1] = new int[2];
        // jagAr[2] = new int[3];

        // for(int i=0;i<jagAr.length;i++){
        //     for(int j=0;j<jagAr[i].length;j++){
        //         jagAr[i][j] = (int)(Math.random() * 10);
        //         System.out.print(jagAr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // Exception are the error which occur during the runtime, not the compilation
//     }
// }


// Strings

// public class basics{
//     public static void main(String[] args) {
        // The ideal way to create a string in JAVA is like : 
        // String name = "Anirudh";
        // System.out.println(name);
        // Strings can be MUTABLE and IMMUTABLE
        /// What generally happens in JAVA is whenever the value of a string is updated
        /// it's reference is updated not the original string
        /// the original string is still in the heap memory of JVM, which will later be garbage collected 

        // StringBuffer name = new StringBuffer("Anirudh");
        // System.out.println(name.capacity());
        // String buffer occupies an extra 16 space in buffer.
        // System.out.println(name.length());
        // Capacity and Length are different

        // name.append(" Kushwah"); // This will add this string into my name string
        // System.out.println(name);

//     }
// }

// class Mobile{
//     String brand;
//     int price;
//     // String type; // Initial
//     static String type; // Static type

//     public void show() {
//         System.out.println("Phone -> "+brand+" : "+price+" : "+ type);
//     }
// }
// public class basics{
//     public static void main(String[] args) {
//         Mobile Obj = new Mobile();
//         Obj.brand = "Xiaomi";
//         Obj.price = 11000;
//         // Obj.type = "Smart Phone"; // Normal
//         Mobile.type = "Smart Phone";
//         Mobile Obj2 = new Mobile();
//         Obj2.brand = "Apple";
//         Obj2.price = 125000;
//         // Obj2.type = "Smart Phone"; // Normal
//         Mobile.type = "Smart Phone";
//         // Static variables can be accessed directly with their class.

//         // Normal object creation

//         Obj.show();
//         Obj2.show();

//         // But if we create a static variable which is common for the objects, we have to use STATIC Keyword


//     }
// }