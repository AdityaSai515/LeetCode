class Solution {
    public int majorityElement(int[] nums) {
        int count =0, max=0;
        int ele =nums[0];
        for(int i=0;i<nums.length;i++)
        {
               for(int j=i+1;j<nums.length;j++)
               {
                   if(nums[i]==nums[j])
                    count++;
               }
               if(count>max)
               {
                 ele =nums[i];
                 max = count;
               }
               count=0;
        }
        return ele;
    }
}