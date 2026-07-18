class MyStack {

    private    List<Integer> ls;
    public MyStack() {
        ls=new ArrayList<>();
    }
    
    public void push(int x) {
        ls.add(x);
    }
    
    public int pop() {
        return ls.remove(ls.size()-1);
    }
    
    public int top() {
        return ls.get(ls.size()-1);
    }
    
    public boolean empty() {
        return ls.size()==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */