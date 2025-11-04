abstract class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    abstract void showRole();
}

class AccountHolder extends Person implements BankInterface {
    private String accountNumber;
    private double balance;

    AccountHolder(String name, int age, String accountNumber){
        this(name , age, accountNumber, 0.0);
    }

    AccountHolder(String name, int age, String accountNumber, double balance){
        super(name, age);
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    void showRole(){
        
    }
}