import java.util.Stack;
class MinStack {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> mst = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int value) {
        st.push(value);
        if(mst.isEmpty() || mst.peek()>= value ){
            mst.push(value);
        }
    }
    
    public void pop() {
       int a = st.pop();
       if(a == mst.peek()){
        mst.pop();
       }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return mst.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */