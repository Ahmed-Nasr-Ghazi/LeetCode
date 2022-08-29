class Solution {
    public int search(int[] nums, int target) {
                int first = 0;
        int mid = nums.length/2;
        int last = nums.length;
        for (int i = 0; i < nums.length; i++){
           if (nums[mid] == target){
               return mid;
           }
           else if(nums[mid] > target){
               last = mid;
               mid = mid / 2;
           }else if (nums[mid] < target){
               first = mid;
               mid = ( last + mid ) / 2;
           }

        }
        return -1;
    }
}