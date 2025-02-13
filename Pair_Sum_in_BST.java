class Solution {
    boolean findTarget(Node root, int target) {
        // Write your code here
       HashSet<Integer>set=new HashSet<>();
       return inorder(root,target,set);
    }
    boolean inorder(Node root, int target, HashSet<Integer>set){
        if(root==null) return false;
        if(inorder(root.left,target,set)) return true;
        if(set.contains(target-root.data)) return true;
        set.add(root.data);
        return inorder(root.right,target,set);
    }

}
