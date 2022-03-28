package Binary_tree;

public class BinaryTree {
    private TreeNode root;
    private class TreeNode{
        private TreeNode left,right;
        private int data;
        public TreeNode(int data){
            this.data=data;
        }
    }
    public void createBinaryTree()
    {
        TreeNode first=new TreeNode(1);
        TreeNode Second=new TreeNode(2);
        TreeNode Third=new TreeNode(3);
        TreeNode fourth=new TreeNode(4);
        TreeNode fifth=new TreeNode(5);

        root =first;
        first.left=Second;
        first.right=Third;
        Second.left=fourth;
        Second.right=fifth;

    }
    public void PreOrder(TreeNode root)
    {
        if(root==null) return;
        System.out.print(root.data+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }

    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.createBinaryTree();
        bt.PreOrder(bt.root);
    }
}

