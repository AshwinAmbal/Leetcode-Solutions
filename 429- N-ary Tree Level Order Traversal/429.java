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

class LevelNode{
    public Node root;
    public int level = 0;
    public LevelNode(){}
    public LevelNode(Node r, int l){
        root = r;
        level = l;
    }
}
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        if(root == null)
            return new ArrayList<List<Integer>>();
        ArrayList<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        LinkedList<LevelNode> queue = new LinkedList<>();
        LevelNode lroot = new LevelNode(root, 0);
        int currLevel = 0;
        queue.add(lroot);
        while(!queue.isEmpty()){
            LevelNode l = queue.removeFirst();
            if(currLevel == l.level){
                temp.add(l.root.val);
            }
            else{
                result.add(temp);
                temp = new ArrayList<>();
                temp.add(l.root.val);
            }
            currLevel = l.level;
            for(Node child: l.root.children){
                queue.add(new LevelNode(child, l.level + 1));
            }
        }
        result.add(temp);
        return result;
    }
}