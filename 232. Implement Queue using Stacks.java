class MyQueue {
    Stack<Integer> stack1, stack2;
    public MyQueue() {
        stack1 = new Stack();
        stack2 = new Stack();
    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        int data;
        while(stack1.size() > 1){
            stack2.push(stack1.pop());
        }
            data = stack1.pop();
            while(!stack2.empty()){
            stack1.push(stack2.pop());
            }
            return data;
    }
    
    public int peek() {
        int data;
        while(stack1.size() > 1){
            stack2.push(stack1.pop());
        }
            data = stack1.peek();
            while(!stack2.empty()){
            stack1.push(stack2.pop());
            }
            return data;
    }
    
    public boolean empty() {
        return stack1.size() == 0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */