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
    public List<Integer> preorder(Node root) {
        if(root == null) return new ArrayList<Integer>();
        List <Integer> trav = new ArrayList<Integer>();
        trav.add(root.val);
        System.out.println(root.val);
        for(Node Child : root.children){
            trav.addAll(preorder(Child));
        }
        return trav;
    }
}