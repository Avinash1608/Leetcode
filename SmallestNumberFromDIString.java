class Solution {
    public String smallestNumber(String pattern) {

        boolean used[]=new boolean[10];
        StringBuilder sb=new StringBuilder();
        backtrack(pattern,0,new int[pattern.length()+1],used,sb);
        return sb.toString();
        
    }

    boolean backtrack(String pattern,int ind,int [] num,boolean used[],StringBuilder sb){
        if(ind>pattern.length()){
            for(int i=0;i<num.length;i++){
                sb.append(num[i]);
            }
            return true;
        }

        for(int digit=1;digit<=9;digit++){
            if(!used[digit] && (ind==0 || isValid(num[ind-1],digit,pattern.charAt(ind-1)))){
                used[digit]=true;
                num[ind]=digit;

                if(backtrack(pattern,ind+1,num,used,sb)){
                    return true;
                }

                used[digit]=false;
                num[ind]=0;

            }
        }
        return false;

    }

    boolean isValid(int lastDigit,int curDigit,char condition){
        return (condition=='I' && lastDigit < curDigit) || (condition=='D' && lastDigit > curDigit);
    }
}