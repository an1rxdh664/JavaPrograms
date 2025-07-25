// To run you need JVM - Java Virtual Machine - it is responsible to execute the java code
// Java is platform independent, if a machine has JVM so it can run java code
// but JVM is platform dependent. It takes byte code as input, not our code file.
// JavaC java compiler will convert our .java file into byte code
// the execution begins from the psvm, without this the program won't execute.

// JVM is part of JRE which provides libraries for the programmer or developer to use.

// JAVA is WORA - Write once run anywhere


// int a[] = {1,2,3,4};

public class index{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        for(int a=0;a<arr.length;a++){
            System.out.println(arr[a]); 
        }
        for(int i in arr){
            System.out.println(i);
        }
    }
}