import java.util.*;
public class questions{


    // leetcode 198
    public int houseRobber(int[] nums){
        int prev1 = 0;
        int prev2 = 0;
        int current = 0;
        for(int i=0;i<nums.length;i++){
            current = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }

    public static int sumOfDigits(int number){
        int n = number;
        int sum = 0;
        while(n!=0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
    public static int addDigits(int num){
        if(num < 10 && num>=0){
            return num;
        }
        int sum = sumOfDigits(num);
        
        while(sum>=10) sum = sumOfDigits(sum);

        return sum;
    }
    public static void main(String[] args) {
        int res = addDigits(39);
        System.out.println(res);
    }
}