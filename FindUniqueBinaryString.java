class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n=nums.length;
        HashSet<String> set=new HashSet<>();
        StringBuilder res=new StringBuilder("");
        for(String i:nums){
            set.add(i);
        }

        backtrack(n,set,res);

        return res.toString();

        
    }

    boolean backtrack(int n, HashSet<String> set, StringBuilder res){
        if(res.length()==n){
            if(!set.contains(res.toString())){
                return true;
            }
            return false;
        }

        for(char ch='0';ch<='1';ch++){
            res.append(ch);
            if(backtrack(n,set,res)){
                return true;
            }
            res.deleteCharAt(res.length()-1);
        }
        return false;
    }
}