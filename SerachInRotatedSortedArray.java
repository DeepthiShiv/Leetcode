class Solution {
    public int search(int[] nums, int target) {
        //si- starting index, ei- ending index
        int si = 0;
        int ei = nums.length - 1;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Check if the left side is sorted
            if (nums[si] <= nums[mid]) {
                // Target is in the sorted left side
                if (nums[si] <= target && target < nums[mid]) {
                    ei = mid - 1; // Search in the left half
                } else {
                    si = mid + 1; // Search in the right half
                }
            } else { // Right side is sorted
                // Target is in the sorted right side
                if (nums[mid] < target && target <= nums[ei]) {
                    si = mid + 1; // Search in the right half
                } else {
                    ei = mid - 1; // Search in the left half
                }
            }
        }
        return -1; // Target not found
    }
}
