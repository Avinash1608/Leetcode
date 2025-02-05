class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        int m=s1.length();
        int n=s2.length();

        ArrayList<Character> mismatch = new ArrayList<>();
        int mismatches=0;
        for(int i=0;i<n;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                mismatch.add(s1.charAt(i));
                mismatch.add(s2.charAt(i));
                mismatches++;
            }
            if(mismatches>2){
                return false;
            }
        }

        if(mismatch.size()==4){
            return (mismatch.get(0)==mismatch.get(3) && mismatch.get(1)==mismatch.get(2) );
        }
        return false;

       
        
    }
}