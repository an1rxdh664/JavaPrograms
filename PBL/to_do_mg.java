import java.util.Scanner;

public class to_do_mg {

    public static int mainScreen(){
        Scanner user_input = new Scanner(System.in);
        System.out.println("To-Do List Manager");
        System.out.println("[1] Add Task");
        System.out.println("[2] Update Task");
        System.out.println("[3] Delete Task");
        System.out.println("[4] Print All Tasks");
        System.out.println("[5] Exit");
        System.out.print("Enter your choice (1/2/3/4/5) : ");
        int user_input_value = user_input.nextInt();
        return user_input_value; 
    }
    
    public void addTasks(){}

    public void updateTasks(){}
    
    public void deleteTasks(){}
    
    public void printTasks(){}

    public static void main(String []args){
        boolean userChoice = true;
        while(userChoice){            
            int user_input_value = mainScreen();
            switch(user_input_value){
                case 1:
                    System.out.println("Task Add");
                    mainScreen();
                case 2:
                    System.out.println("Task Update");
                    mainScreen();
                case 3:
                    System.out.println("Task Delete");
                    mainScreen();
                case 4:
                    System.out.println("Task Lists");
                    mainScreen();
                case 5:
                    System.out.println("Program End");
                    userChoice = false;
                    break;
            }
        }
    }
}