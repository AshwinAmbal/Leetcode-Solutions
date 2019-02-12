class MyLinkedList {

    /** Initialize your data structure here. */
    class Node{
        int val;
        Node next;
        Node(int v){
            val = v;
        }
    }
    Node head;
    int len;
    public MyLinkedList() {
        head = null;
        len = 0;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        Node temp = head;
        for(int i = 0; i < len; i++){
            if(i == index)
                return temp.val;
            temp = temp.next;
        }
        return -1;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        len++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node node = new Node(val), temp = head;
        node.next = null;
        if(head == null){
            head = node;
        }
        else{
            while(temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
        len++;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        Node cur = head, prev = head, node = new Node(val);
        if(head == null || index == 0){
            node.next = head;
            head = node;
        }
        else{
            for(int i = 0; i <= len; i++){
                if(i == index){
                    prev.next = node;
                    node.next = cur;
                    break;
                }
                prev = cur;
                cur = cur.next;
            }
        }
        if(index <= len)
            len++;
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        Node cur = head, prev = head;
        if(index == 0){
            head = head.next;
        }
        else{
            for(int i = 0; i < len; i++){
                if(i == index){
                    prev.next = cur.next;
                    break;
                }
                prev = cur;
                cur = cur.next;
            }
        }
        if(index < len)
            len--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */