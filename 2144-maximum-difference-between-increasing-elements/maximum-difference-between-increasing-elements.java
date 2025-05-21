public class Solution{
    public static int maximumDifference(int[] nums) {
        int minVal = nums[0];
        int maxDiff = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > minVal) {
                maxDiff = Math.max(maxDiff, nums[i] - minVal);
            } else {
                minVal = nums[i]; 
            }
        }
        return maxDiff;
    }
    public static void main(String[] args) {
        int[] nums1 = {7, 1, 5, 4};
        int[] nums2 = {9, 4, 3, 2};
        int[] nums3 = {1, 5, 2, 10};

        System.out.println(maximumDifference(nums1));
        System.out.println(maximumDifference(nums2));
        System.out.println(maximumDifference(nums3));
    }
}
