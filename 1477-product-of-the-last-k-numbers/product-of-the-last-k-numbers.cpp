class ProductOfNumbers {
private:
    vector<int> ls;

public:
    ProductOfNumbers() {
        
    }
    
    void add(int num) {
        ls.push_back(num);
    }
    
    int getProduct(int k) {
        int h = ls.size() - 1;
        int prod = 1;
        for (int i = 0; i < k; i++) {
            prod *= ls[h--];
        }
        return prod;
    }
};