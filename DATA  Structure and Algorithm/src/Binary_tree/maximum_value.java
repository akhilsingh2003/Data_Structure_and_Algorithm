package Binary_tree;

import com.sun.source.tree.Tree;

import java.util.Scanner;

public class maximum_value {
    public TreeNode root;
    public static class TreeNode{
        public int data;
        public TreeNode left, right;
        public TreeNode(int data){
            this.data=data;
        }
    }
    public int FindMax(TreeNode root){
        if(root==null) return Integer.MIN_VALUE;
        int result = root.data;
        int left=FindMax(root.right);
        int right=FindMax(root.left);
        if(left>result) result=left;
        if(right>result) result=right;
        return result;
    }
    public void preorder(TreeNode root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        maximum_value tree = new maximum_value();
        Scanner sc=new Scanner(System.in);
        tree.root = new TreeNode(sc.nextInt());
        tree.root.left = new TreeNode(sc.nextInt());
        tree.root.right = new TreeNode(sc.nextInt());
        tree.root.left.left = new TreeNode(sc.nextInt());
        System.out.println("Tree is :- \n");
        tree.preorder(tree.root);
        System.out.println("\n___________________");
        System.out.println("maximum value is :- "+tree.FindMax(tree.root));


    }

}
