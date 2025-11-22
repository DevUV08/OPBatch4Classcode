# Question 1: 
https://leetcode.com/problems/guess-number-higher-or-lower/description/
## Solution: 
```
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start=1;
        int end=n;
        while(start<=end){
            int mid=start+(end-start)/2;
            int computerNum=guess(mid);
            if(computerNum==0){
                return mid;
            }else if(computerNum==-1){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
```

# Question 2: 
https://leetcode.com/problems/maximum-subarray/description/
## Solution : 
```
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int currentSum=nums[0];
        for(int i=1;i<nums.length;i++){
            currentSum=Math.max(currentSum+nums[i], nums[i]);
            if(currentSum>maxSum){
                maxSum=currentSum;
            }
        }
        return maxSum;
    }
}
```