/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> postorder(Node root) {
        if(root == null) return new ArrayList<Integer>();
        List <Integer> trav = new ArrayList<Integer>();
        for(Node Child : root.children){
            trav.addAll(postorder(Child));
        }
        trav.add(root.val);
        return trav;
    }
}