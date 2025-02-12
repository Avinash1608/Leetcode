class Solution {

    int getDigitSum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {

        int map[]=new int[82];
        //Map<Integer,Integer> map=new HashMap<>();
        int ans=-1;

        for(int num:nums){
            int digitSum=getDigitSum(num);

            if(map[digitSum]>0){
                int prevNum=map[digitSum];
                ans=Math.max(prevNum+num,ans);
                map[digitSum]=Math.max(prevNum,num);
            }
            else{
                map[digitSum]=num;
            }
        }

        return ans;
        
    }
}