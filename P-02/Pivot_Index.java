class pivot_Index {
    public int pivotIndex(int[] nums) {
        int prefixSum =0;
        int leftSum =0;
        for(int  i : nums) prefixSum+=i;
        for(int i = 0;i < nums.length;i++) {
            if(prefixSum - leftSum - nums[i] == leftSum ) return i;
            leftSum+=nums[i];
        }
        return -1;
    }
}