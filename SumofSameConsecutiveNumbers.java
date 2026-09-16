public class SumofSameConsecutiveNumbers {

    public static int sumOfSameConsecutiveNumbers(int[] nums, int k) {
        int count = 1,curr = nums[0]; //2
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == curr) count++; // 2
            if(nums[i] != curr) {
                if(count == k) return curr * k;
                else {
                    curr = nums[i];
                    count = 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,3,3,3,4,4};
        int k = 2;
        System.out.println(sumOfSameConsecutiveNumbers(nums, k));
    }
}


