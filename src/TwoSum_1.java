import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3, 3}, 6)));
    }

    static class Solution {
        public int[] twoSum(int[] nums, int target){
            Map<Integer, Integer> checked = new HashMap<>();
            for (int i = 0; i < nums.length; i++){
                if(checked.get(target - nums[i]) != null){
                    return new int[]{checked.get(target - nums[i]), i};
                }
                else{
                    checked.put(nums[i], i);
                }
            }
            return null;
        }
    }
}

