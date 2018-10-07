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
    public Node node;
    int level;
    LevelNode(Node root, int l){
        node = root;
        level = l;
    }
}

class Solution {
    public int maxDepth(Node root) {
        if(root == null) return 0;
        LevelNode nroot = new LevelNode(root, 1);
        LinkedList<LevelNode> queue = new LinkedList<LevelNode>();
        queue.add(nroot);
        int level, maxlevel = 0;
        while(queue.isEmpty() == false){
            nroot = queue.removeFirst();
            level = nroot.level;
            for(int i = 0; i < nroot.node.children.size(); i++)
                queue.add(new LevelNode(nroot.node.children.get(i), level + 1));
            maxlevel = Math.max(level, maxlevel);
        }
        return maxlevel;
    }
}