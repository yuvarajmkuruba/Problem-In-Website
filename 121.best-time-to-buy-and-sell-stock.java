/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
     int gain=0;
     int value=0;
     int min =Integer.MAX_VALUE;
     for(int i=0;i<prices.length;i++){
        if(prices[i]<min){
             min =prices[i];
        }
        else{
            gain = prices[i]-min;
            if(gain>value){
                value=gain;
            }
        }
       
     }
      return value;
    }
}
// @lc code=end

