class Solution {
    public long coloredCells(int n) {
        
        // long count=0;
        

        // for(int i=0;i<n;i++){
        //     count+=(2*i+1);
        // }

        // for(int i=0;i<n-1;i++){
        //     count+=(2*i+1);
        // }

        // return count;
        long res=n;

        return 1 + (res-1) * res * 2;
    }
}