import java.util.*;
public class constructor{
    class Account{
        String firstName;
        String lastName;
        int age;
        String bankBranch;
        double accountNumber;
        int currBalance;
        int phoneNumber;
        public Account(String fName, String lName, int ageOld, int phNumber){
            firstName = fName;
            lastName = lName;
            age = ageOld;
            phoneNumber = phNumber;
        }
        public void setDetails(String branch, int cBalance){
            bankBranch = branch;
            accountNumber = Math.random() * 10;
            currBalance = cBalance;
        }
        public void showDetails(){
            System.out.println("Bank : ");
            System.out.println("First Name : " + firstName + " " + "Last Name : " + lastName);
            System.out.println("First Name : " + firstName + " " + "Last Name : " + lastName);
        }
    }
    public static void main(String[] args) {
        int n = 120;
        int count = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=4;i<n;i++){
            int sr = (int)(Math.floor(Math.sqrt(i)));
            if(sr*sr==i) numbers.add(i);
        }
        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i)%n==0){
                int num = n;
                while(num!=0){
                    count++;
                    num /= numbers.get(i);
                }
            }
        }
        System.out.println(numbers);
        System.out.println(count);
    }
}