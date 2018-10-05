class MyStack {

    /** Initialize your data structure here. */
    LinkedList<Integer> queue1 = new LinkedList<Integer>();
    LinkedList<Integer> queue2 = new LinkedList<Integer>();
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue2.add(x);
        while(queue1.isEmpty() == false){
            queue2.add(queue1.removeFirst());
        }
        while(queue2.isEmpty() == false)
            queue1.add(queue2.removeFirst());
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(queue1.isEmpty() == false)
            return queue1.removeFirst();
        else
            return -1;
    }
    
    /** Get the top element. */
    public int top() {
        if(queue1.isEmpty() == false)
            return queue1.peek();
        else
            return -1;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty();
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