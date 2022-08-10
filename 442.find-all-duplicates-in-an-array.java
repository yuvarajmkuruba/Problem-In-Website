import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=442 lang=java
 *
 * [442] Find All Duplicates in an Array
 */

// @lc code=start
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       List<Integer> result = new ArrayList<Integer>();
       Arrays.sort(nums);
       for (int i = 0; i < nums.length-1; i++) {
          if(nums[i]==nums[i+1]){
            result.add(nums[i]);
          }
       }
       return result;
    }
}
// @lc code=end

