//Given an array, move all the zeros to the right of the array while
//mainting the order for the rest of the array.

void moveZeroes(vector<int>& nums) {
    int lastNonZeroFoundAt = 0;
  
    for (int i = 0; i < nums.size(); i++) {
        if (nums[i] != 0) {
            nums[lastNonZeroFoundAt++] = nums[i];
        }
    }
    // After we have finished processing new elements,
    // all the non-zero elements are already at beginning of array.
    // We just need to fill remaining array with 0's.
    for (int i = lastNonZeroFoundAt; i < nums.size(); i++) {
        nums[i] = 0;
    }
}
