public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0;
        for (int num: nums) {
            if(num == 1) count++;
            if(num != 1) {
                max = (max > count)? max: count;
                count = 0;
            }
        }
        return (max > count)? max: count;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}