public class LinkedListNode{
    int val, minimum;
    public LinkedListNode(){
        val = -1;
        minimum = Integer.MAX_VALUE;
    }
    public LinkedListNode(int value, int min){
        val = value;
        minimum = min;
    }
    int getVal(){
        return val;
    }
    int getMin(){
        return minimum;
    }
}

class MinStack {

    /** initialize your data structure here. */
    LinkedList<LinkedListNode> stack = new LinkedList<LinkedListNode>();
    public MinStack() {
    }
    
    public void push(int x) {
        int minimum = stack.size() > 0 ? Math.min(stack.getFirst().minimum, x) : x;
        LinkedListNode p = new LinkedListNode(x, minimum);
        stack.addFirst(p);
    }
    
    public void pop() {
        if(stack.size()>0)
            stack.removeFirst();
    }

    
    public int top() {
        return stack.getFirst().val;
    }
    
    public int getMin() {
        return stack.getFirst().minimum;
    }
}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */