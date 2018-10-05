class MyQueue {

    /** Initialize your data structure here. */
    Stack <Integer> stack1 = new Stack();
    Stack <Integer> stack2 = new Stack();
    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        while(stack1.isEmpty() == false){
            stack2.push(stack1.pop());
        }
        stack1.push(x);
        while(stack2.isEmpty() == false){
            stack1.push(stack2.pop());
        }
        
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(stack1.isEmpty() == false)
            return stack1.pop();
        else
            return -1;
    }
    
    /** Get the front element. */
    public int peek() {
        if(stack1.isEmpty() == false)
            return stack1.peek();
        else
            return -1;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty();
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