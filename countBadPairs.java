class Solution {
    public long countBadPairs(int[] nums) {

        long n=nums.length;
        long goodPairs=0;

        long totalPairs=(n*(n-1))/2;

        Map<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<n;i++){
            int diff=i-nums[i];//calculating the difference

            int prev=mp.getOrDefault(diff,0); //vhecking for good pairs(ie is the difference is previously present)

            goodPairs+=prev;

            mp.put(diff,mp.getOrDefault(diff,0)+1); //adding the diff to the map
            //if already present incrementing it by one

            

        }
        return totalPairs-goodPairs;
        
    }
}