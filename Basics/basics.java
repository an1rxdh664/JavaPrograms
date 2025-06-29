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



