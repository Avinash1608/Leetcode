class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod=1000000007;
        int prefixSum=0;
        int evenC=1;
        int oddC=0;
        int res=0;

        for(int n:arr){
            prefixSum+=n;

            if(prefixSum%2 == 0){//if prefix sum is even add res with odd count and increase even count 
                res+=oddC;
                evenC++;
            }
            else{//if prefix sum is odd add res with even count and increase odd count 
                res+=evenC;
                oddC++;
            }

            res=res % mod;
        }

        return res;
    }
}