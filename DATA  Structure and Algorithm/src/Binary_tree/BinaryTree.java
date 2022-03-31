package Binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public TreeNode root;
     public class TreeNode{
        public TreeNode left,right;
        public int data;
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

    public void Inorder(TreeNode root){
        if(root==null) return;
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }
    public void PostOrder(TreeNode root){
        if(root== null) return;
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data+" ");
    }
    public void LevelOrder(TreeNode root){
         if(root==null) return;
        Queue<TreeNode> queue =new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode temp=queue.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                queue.offer(temp.left);
            }
            if(temp.right!=null){
                queue.offer(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.createBinaryTree();
        System.out.println("_______________________\n");
        System.out.println("PreOder Traversal\n");
        bt.PreOrder(bt.root);
        System.out.println("\n_______________________\n");
        System.out.println("Inorder Traversal\n");
        bt.Inorder(bt.root);
        System.out.println("\n_______________________\n");
        System.out.println("PostOrder Traversal\n");
        bt.PostOrder(bt.root);
        System.out.println("\n_______________________\n");
        System.out.println("Level Order\n");
        bt.LevelOrder(bt.root);


    }
}

