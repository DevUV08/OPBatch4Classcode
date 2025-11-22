
public class LinearSearch {
    // TC in worst and average case: O(n) 
    // SC : O(1)
    static int findValue(int nums[],int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={4,3,1,6,7,8,2};
        int target=6;
        System.out.println(findValue(nums, target));
    }
}
