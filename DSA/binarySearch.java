public class binarySearch {
    public static void main(String[] args) {
        int[] nums = {1,14,21,28,45,47,55,89,100};
        int target = 55;
        int start = 0;
        int end = nums.length-1;
        int middle = (start + end) / 2;
        for(int i=0;i<nums.length;i++){
            if(middle == target) System.out.println("element found");
        }
    }
}
