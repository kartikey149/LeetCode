class ProductOfNumbers {
    List<Integer> ls;
    public ProductOfNumbers() {
        ls=new ArrayList<>();
    }
    
    public void add(int num) {
        ls.add(num);
    }
    
    public int getProduct(int k) {
        int h=ls.size()-1;
        int prod=1;
        for(int i=0;i<k;i++){
            prod*=ls.get(h--);
        }
        return prod;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */