class Solution {
    public boolean check(int[] nums) {
       int len = nums.length;
        int count=0;
        for(int i =0 ; i<nums.length; i++){
            if(nums[i]>nums[(i+1)%len]){
                count++;
            }
        }
        return count>1? false : true;
    }
}