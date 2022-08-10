import java.util.Arrays;
class Solution {
    public int findDuplicate(int[] nums) {
    //     for(int i = 0; i<nums.length; i++){
    //         if(nums[Math.abs(nums[i])] < 0){
    //             return Math.abs(nums[i]);
    //         }else {
    //             nums[Math.abs(nums[i])] = nums[Math.abs(nums[i])] * -1;
    //         }
    //     }
    //   return -1;  
     Arrays.sort(nums);
    for(int i=0;i<nums.length-1;i++){
        if(nums[i]==nums[i+1]){
            return nums[i];
        }
    }
    return 0;

    }
}
// @lc code=end

