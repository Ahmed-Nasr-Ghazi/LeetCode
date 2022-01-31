class Solution {
    public int[] buildArray(int[] nums) {
        if(nums.length==0) return null;
        int l=nums.length;
        int[] ans= new int[l];
        for(int i=0; i<l; i++){
            ans[i]=nums[nums[i]];
        }
        return ans;    
    }
}