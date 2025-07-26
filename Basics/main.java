// To run you need JVM - Java Virtual Machine - it is responsible to execute the java code
// Java is platform independent, if a machine has JVM so it can run java code
// but JVM is platform dependent. It takes byte code as input, not our code file.
// JavaC java compiler will convert our .java file into byte code
// the execution begins from the psvm, without this the program won't execute.

// JVM is part of JRE which provides libraries for the programmer or developer to use.

// JAVA is WORA - Write once run anywhere

// Arrays in Java
public class main{
    public static void main(String[] args) {
        
        // Two ways of creating array in java
        // int arr[] = {1,2,3,4}; // the typicall normal way
        // int newArr[] = new int[4]; // this creates an array of 4 elements, just by default this array will have all the elements as 0
        // and we then have to set the value for each of the specefic index

        // Multi-dimensional array :
        // int mulArr[][] = new int[3][2]; // this creates an array of 3 rows and 2 columns
        // if we were to generate a random value for each element of this matrix we can do
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<2;j++){
        //         mulArr[i][j] = (int)(Math.random() * 10);
        //         System.out.print(mulArr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // Enhanced for loop
        // for(int n[]: mulArr){
        //     for(int m: n){
        //         m = (int)(Math.random() * 10);
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }
        // what happened in this enhanced for loop is that, in the first loop
        // int n[]: mulArr, the first element of the mulArr is an entire array so what this do is that it throws the first element of the second variable into the left variable
        // which in this case was an array so that's why we used the sqaure brackets
        // and then inside the nested for loop we are just iterating through the array we just got and to access each element of it we used int m: n
        // what this does is that it throws the elements of n into m one at a time and we print it

        // Jagged arrays : stores different number of elements in each row
        int nums[][] = new int[3][]; // we have now created an 2d array which will have 3 rows but the amount of column is not defined, we can set the amount of column per row separately like this :
        nums[0] = new int[3]; // num of element in this row is 3
        nums[1] = new int[2]; // num of element in this row is 2
        nums[2] = new int[4]; // num of element in this row is 4
        // as you can see we separately targeted each row and assigned it arrays of different sizes
        
        // now to print them
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j] = (int)(Math.random() * 10);
                System.out.print(nums[i][j] + " ");
            } System.out.println();
        }
        /* this prints : 
            6 5 4 
            3 0 
            5 9 3 4
        */
    }
}