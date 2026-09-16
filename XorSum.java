public class XorSum {

    public static int subsetXORSum(int[] nums) {
        int xorSum = 0, l = nums.length;
        for(int i = 0; i < l; i++) {
            int count = (i + 1) * (l - i);
            if(count % 2 != 0) xorSum = xorSum ^ nums[i];
            //System.out.println(xorSum);
        }
        return xorSum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("XOR of All Subarray XORs: " + subsetXORSum(arr));
    }
}
