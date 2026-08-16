class Solution {
    public boolean hasDuplicate(int[] nums) {
        int a=nums.length;
        for(int i=0;i<a;i++)
        {
            for(int j=i+1;j<a;j++)
            {
                if(nums[i]==nums[j])
                {
                    return true;
                }
            }
        }
        return false;
    }
}