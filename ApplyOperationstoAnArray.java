class Solution {
    public int[] applyOperations(int[] nums) {
        
        int i=0;

        while(i<nums.length-1){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;

                i++;
            }
            else{
                i++;
            }
        }

       int index,nonZeroIndex=0;

       for(index=0;index<nums.length;index++){
           if(nums[index]!=0){
               int temp=nums[index];
               nums[index]=nums[nonZeroIndex];
               nums[nonZeroIndex]=temp;
               nonZeroIndex++;
           }
       }

       return nums;

    }
}