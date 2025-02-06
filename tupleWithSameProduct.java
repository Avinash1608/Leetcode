class Solution {
    public int tupleSameProduct(int[] nums) {

        int n=nums.length;

        Map<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                mp.put(nums[i]*nums[j],mp.getOrDefault(nums[i]*nums[j],0)+1);
            }
        }

        int count=0;

        for(Map.Entry<Integer,Integer> it: mp.entrySet()){
            int val=it.getValue();

            if(val>1){
                count+=((val*(val-1))/2)*8;
            }
        }

        return count;

    }
}