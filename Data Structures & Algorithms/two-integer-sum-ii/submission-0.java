class Solution {
    public int[] twoSum(int[] num, int target) {
        int left=0;
        int right=num.length-1;
        while(left<right){
            int cur=num[left]+num[right];
            if(cur==target){
                return new int[]{left+1,right+1};
            }
            else if(cur<target){
            left++;
            }
            else{
            right--;
            }
        }
       return new int[0];
        
    }
}
