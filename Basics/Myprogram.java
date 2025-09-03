class Calc{

    int num = 5; // instance variable
    int ret = 10;

    public int add(int n1, int n2){
        System.out.println(num);
        return ret;
    }
    public int subtract(int n1, int n2){
        System.out.println(ret);
        return n1 - n2;
    }
}
public class Myprogram{
    public static void main(String[] args) {
        Calc obj = new Calc();
        
        int sum = obj.add(1, 2);
        
        
        int a = 5;


        System.out.println(sum);
    }

}