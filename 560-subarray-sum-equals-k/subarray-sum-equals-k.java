import java.util.HashMap;

public class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); 
        int currentSum = 0, count = 0;
        
        for (int num : nums) {
            currentSum += num; 
            count += map.getOrDefault(currentSum - k, 0);
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }
        
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.subarraySum(new int[]{1, 1, 1}, 2)); // Output: 2
        System.out.println(solution.subarraySum(new int[]{1, 2, 3}, 3)); // Output: 2
    }
}