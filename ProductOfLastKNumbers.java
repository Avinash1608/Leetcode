class ProductOfNumbers {
    
    ArrayList<Integer> list=new ArrayList<>();

    public ProductOfNumbers() {
        list.clear();
        
    }
    
    public void add(int num) {
       //if upcoming num is 0 then clear the list

        if(num==0)
        {   list.clear();
            return;

        }

        int prev=(list.size()==0)?1:list.get(list.size()-1); 
        //retriving the previous one to keep track of prefix product

        list.add(prev*num);
        //adding the prefix product

    }
    
    public int getProduct(int k) {
        int s=list.size();

        if(s<k) 
            return 0;
        else if(s==k) 
            return list.get(s-1);
        //since it contains the product of all numbers
        else
            return (list.get(s-1)/list.get(s-1-k));
    }

    
}