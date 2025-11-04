// To run you need JVM - Java Virtual Machine - it is responsible to execute the java code
// Java is platform independent, if a machine has JVM so it can run java code
// but JVM is platform dependent. It takes byte code as input, not our code file.
// JavaC java compiler will convert our .java file into byte code
// the execution begins from the psvm, without this the program won't execute.

// JVM is part of JRE which provides libraries for the programmer or developer to use.

// JAVA is WORA - Write once run anywhere

// Arrays in Java
// public class main{
//     public static void main(String[] args) {
        
//         // Two ways of creating array in java
//         // int arr[] = {1,2,3,4}; // the typicall normal way
//         // int newArr[] = new int[4]; // this creates an array of 4 elements, just by default this array will have all the elements as 0
//         // and we then have to set the value for each of the specefic index

//         // Multi-dimensional array :
//         // int mulArr[][] = new int[3][2]; // this creates an array of 3 rows and 2 columns
//         // if we were to generate a random value for each element of this matrix we can do
//         // for(int i=0;i<3;i++){
//         //     for(int j=0;j<2;j++){
//         //         mulArr[i][j] = (int)(Math.random() * 10);
//         //         System.out.print(mulArr[i][j] + " ");
//         //     }
//         //     System.out.println();
//         // }

//         // Enhanced for loop
//         // for(int n[]: mulArr){
//         //     for(int m: n){
//         //         m = (int)(Math.random() * 10);
//         //         System.out.print(m + " ");
//         //     }
//         //     System.out.println();
//         // }
//         // what happened in this enhanced for loop is that, in the first loop
//         // int n[]: mulArr, the first element of the mulArr is an entire array so what this do is that it throws the first element of the second variable into the left variable
//         // which in this case was an array so that's why we used the sqaure brackets
//         // and then inside the nested for loop we are just iterating through the array we just got and to access each element of it we used int m: n
//         // what this does is that it throws the elements of n into m one at a time and we print it

//         // Jagged arrays : stores different number of elements in each row
//         int nums[][] = new int[3][]; // we have now created an 2d array which will have 3 rows but the amount of column is not defined, we can set the amount of column per row separately like this :
//         nums[0] = new int[3]; // num of element in this row is 3
//         nums[1] = new int[2]; // num of element in this row is 2
//         nums[2] = new int[4]; // num of element in this row is 4
//         // as you can see we separately targeted each row and assigned it arrays of different sizes
        
//         // now to print them
//         for(int i=0;i<nums.length;i++){
//             for(int j=0;j<nums[i].length;j++){
//                 nums[i][j] = (int)(Math.random() * 10);
//                 System.out.print(nums[i][j] + " ");
//             } System.out.println();
//         }
//         /* this prints : 
//             6 5 4 
//             3 0 
//             5 9 3 4
//         */
//     }
// }


// class Student{
//     int age;
//     String name;
//     double gpa;
// }

// public class main{
//     public static void main(String[] args) {
//         // array like objects
//         // Student s1 = new Student();
//         // s1.age = 20;
//         // s1.name = "Anirudh";
//         // s1.gpa = 8.0;

//         // Student s2 = new Student();
//         // s2.age = 20;
//         // s2.name = "Bob";
//         // s2.gpa = 7.3;
        
//         // Student s3 = new Student();
//         // s3.age = 20;
//         // s3.name = "Helen";
//         // s3.gpa = 5.6;
        
//         // Student s4 = new Student();
//         // s4.age = 20;
//         // s4.name = "Keller";
//         // s4.gpa = 9.2;

//         // Student students[] = new Student[4]; // this now created an array of students
//         // students[0] = s1;
//         // students[1] = s2;
//         // students[2] = s3;
//         // students[3] = s4;

//         // for(int i=0;i<students.length;i++){
//         //     System.out.println("Name : " + students[i].name + " " + "GPA : " + students[i].gpa);
//         // }

//         // StringBuffer
//         StringBuffer str = new StringBuffer("Anirudh");
//         // this creates a string buffer of capacity 16
//         // System.out.println(str.capacity()); // 16
//         // System.out.println(str); // "Anirudh"
//         // System.out.println(str.capacity()); // 23 (16 + 7)
//         // System.out.println(str.length()); // 7
        
//         // to append data into the string
//         str.append(" Kushwah");
//         // System.out.println(str); // "Anirudh Kushwah"
//     }
// }

// class SmartPhone{
//     int price;
//     String name;
//     static String type;

//     public void show(){
//         System.out.println(name + " : " + price + " : " + type);
//     }

//     public static void show1(SmartPhone obj){
//         // System.out.println(name + " : " + price + " : " + type);
//         // we cannot use the non static variable in a static method
//         // also one more thing whenever we have to use the static method, we can call it directly with the class
//         // but that was not the case with the non static method

//         // to get the non static values we can just pass the object into the static method and call the value by references
//         System.out.println(obj.name + " : " + obj.price + " : " + type);
//     }
// }

// public class main{
//     public static void main(String[] args) {
//         // Static keyword : static keyword is a variable which is shared by all the other objects
//         SmartPhone.type = "Smart Phone";
//         // the static variable can be accessed directly with the class name

//         SmartPhone s1 = new SmartPhone();
//         s1.price = 20000;
//         s1.name = "Poco M6 5G";

//         SmartPhone s2 = new SmartPhone();
//         s2.price = 11000;
//         s2.name = "Oppo f11";

//         // s1.show();
//         // s2.show();
//         // as we can see that the 'type' of each of the smartphone object is same 'Smart Phone' which is because we declared the type as a static variable so it is shared with all the objects we create
//         // SmartPhone.show1(s1);
//     }
// }


class Human{
    private int age;
    private String name;
    // constructor --> it looks like a method also it does not return any value
        // the name should be same as your class name

    // public Human(){
    //     System.out.println("in constructor");
    // }
    // the constructor is called without having to explicitly called, so everytime we create a new object a constructor is invoked or created. so we can use it to give default values like :

    public Human(){
        age = 12;
        name = "Alex"; 
    }

    // custom instruction parameter --> this is called parameterized constructor
    public Human(int a, String n){
        age = a;
        name = n;
    }

    // this method is to set the value for the name and age variable
    public void setDetails(int getAge, String getName){ // setter
        this.age = getAge;
        this.name = getName;
    }
    public String getDetails(){ // getter
        return (name + " : " + age);
    }
    
}


class Calc{
    public int add(int n1, int n2){
        return n1 + n2;
    }
    public int sub(int n1, int n2){
        return n1 - n2;
    }
} // that's a normal calculator class, but if we were to create a new class and use this class's function, instead of writing each method again, we can use inheritence
// that was a example of single level inheritence


class AdvCalc extends Calc{ // this 'extendes calc' is that we are inheriting the methods of Calc inside the AdvCalc class

    // right now the Calc class is a SUPER CLASS and the AdvCalc is a SUB CLASS
    public int multi(int n1, int n2){
        return n1 * n2;
    }
    public int div(int n1, int n2){
        return n1 / n2;
    }
}

// lets say we have this class which now can access all the methods of AdvCalc and Calc
// to develop this we have to create a chain of heirarchy
// if we extend VeryAdvCalc with AdvCalc thi
class VeryAdvCalc extends AdvCalc{
    public double power(int n1, int n2){
        return Math.pow(n1, n2);
    }
    public double sqrRoot(int n){
        return Math.sqrt(n);
    }
}
// now VeryAdvCalc -> AdvCalc -> Calc
// so we can now use the methods inside the Calc, now in VeryAdvCalc

public class main{
    public static void main(String[] args) {
        // Encapsulation means that the variable should not be accessible to each and everyone, and to access or modify those variables we should have separate methods
        Human person = new Human();
        Human person1 = new Human();
        person.setDetails(20, "Anirudh");
        // System.out.println(person.getDetails());
        // System.out.println(person1.getDetails());
        
        
        // getters and setters are just methods name which are set to be used by different users to increase readability.
        
        // This keyword
        // if we used this keyword, that keyword will be pointing toward the object with which the method is called upon
        
        // if we were to give custom default values to a constructor we can just pass them as arguments
        Human person3 = new Human(18, "Anirudh");
        // System.out.println(person3.getDetails());

        // Sometimes we don't even need to write up the constructor until unless we want to do something custom
        // because JVM will do that job for us


        // Inheritence - is has

        // we created two calculator classes - Calc and AdvCalc, both of these classes have separate methods in them
        //but if we cannot use the methods of both the classes at the same time, to do that we have inheritence :
        
        // Calc obj = new Calc();
        // int sum = obj.add(3, 4);

        AdvCalc obj = new AdvCalc();
        int sum = obj.add(3, 4); // we can see that we cannot use the add method now that we changes the class name

        int result = 50;
        if(result >= 90) System.out.println("A+");
        else if(result >= 80 && result < 90) System.out.println("A");
        else if(result >= 70 && result < 80) System.out.println("B+");
        else if(result >= 60 && result < 70) System.out.println("B");
        else if(result >= 50 && result < 60) System.out.println("C");
        else if(result >= 40 && result < 50) System.out.println("D");
        else if(result < 40) System.out.println("Fail");
        
    }
}