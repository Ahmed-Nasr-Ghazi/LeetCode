class Solution {
    public int search(int[] nums, int target) {
        int high = nums.length-1, low = 0;		
		
		while (low <= high) {
            
            int middle = (low + high) / 2;

			if (nums[middle] == target) {
				return middle;
			}
			if (target > nums[middle]) {
				low = middle + 1;
			}
			if (target < nums[middle]) {
				high = middle - 1;
			}
			
		}
        return -1;
    }
}
