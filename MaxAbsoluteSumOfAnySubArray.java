class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int prefixSum=0;
        int maxPrefixSum=0;
        int minPrefixSum=0;

        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i];

            maxPrefixSum=Math.max(maxPrefixSum,prefixSum);
            minPrefixSum=Math.min(minPrefixSum,prefixSum);
        }

        return maxPrefixSum-minPrefixSum;//this gives absolute sum


        

        
    }
}