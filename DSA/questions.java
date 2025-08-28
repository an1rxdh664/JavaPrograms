import java.util.*;
public class questions{


    // leetcode 198
    public static int houseRobber(){
        int[] nums = {1,2,3,1};
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


    public static void main(String[] args) {
        
    }
}