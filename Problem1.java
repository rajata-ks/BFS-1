// Time Complexity :O(n)
// Space Complexity :0(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : nothing


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem1 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int size=q.size();

            for(int i=0; i<size; i++){
                TreeNode curr = q.poll();
                if(curr != null){
                    level.add(curr.val);
                    q.add(curr.left);
                    q.add(curr.right);
                }
            }
            if(level.size()>0){
                res.add(level);
            }
        }

        return res;
    }
}
