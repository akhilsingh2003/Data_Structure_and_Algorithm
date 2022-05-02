package Binary_tree;

class AVL_tree
{
    TreeNode root;
    class TreeNode
    {
        int key, height;
        TreeNode left, right;

        TreeNode(int d)
        {
            key = d;
            height = 1;
        }
    }

    int height(TreeNode N)
    {
        if (N == null)
            return 0;
        return N.height;
    }

    int max(int a, int b)
    {
        return (a > b) ? a : b;
    }

    TreeNode rightRotate(TreeNode y)
    {
        TreeNode x = y.left;
        TreeNode T2 = x.right;
        x.right = y;
        y.left = T2;

        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        return x;
    }
    TreeNode leftRotate(TreeNode x)
    {
        TreeNode y = x.right;
        TreeNode T2 = y.left;
        y.left = x;
        x.right = T2;
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;
        return y;
    }

    int getBalance(TreeNode N)
    {
        if (N == null)
            return 0;
        return height(N.left) - height(N.right);
    }

    TreeNode insert(TreeNode node, int key)
    {
        if (node == null)
            return (new TreeNode(key));

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else
            return node;

        node.height = 1 + max(height(node.left),
                height(node.right));

        int balance = getBalance(node);

        // If this node becomes unbalanced, then
        // there are 4 cases Left Left Case
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);

        // Right Right Case
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);

        // Left Right Case
        if (balance > 1 && key > node.left.key)
        {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left Case
        if (balance < -1 && key < node.right.key)
        {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        return node;
    }


    TreeNode minValueNode(TreeNode node)
    {
        TreeNode current = node;

        /* loop down to find the leftmost leaf */
        while (current.left != null)
            current = current.left;

        return current;
    }

    TreeNode deleteNode(TreeNode root, int key)
    {
        if (root == null)
            return root;
        if (key < root.key)
            root.left = deleteNode(root.left, key);
        else if (key > root.key)
            root.right = deleteNode(root.right, key);
        else
        {
            if ((root.left == null) || (root.right == null))
            {
                TreeNode temp = null;
                if (temp == root.left)
                    temp = root.right;
                else
                    temp = root.left;
                if (temp == null)
                {
                    temp = root;
                    root = null;
                }
                else
                    root = temp;
            }
            else
            {
                TreeNode temp = minValueNode(root.right);
                root.key = temp.key;
                root.right = deleteNode(root.right, temp.key);
            }
        }
        if (root == null)
            return root;
        root.height = max(height(root.left), height(root.right)) + 1;
        int balance = getBalance(root);
        if (balance > 1 && getBalance(root.left) >= 0)
            return rightRotate(root);

        // Left Right Case
        if (balance > 1 && getBalance(root.left) < 0)
        {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // Right Right Case
        if (balance < -1 && getBalance(root.right) <= 0)
            return leftRotate(root);

        // Right Left Case
        if (balance < -1 && getBalance(root.right) > 0)
        {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }
    void preOrder(TreeNode node)
    {
        if (node != null)
        {
            System.out.print(node.key + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public static void main(String[] args)
    {
        AVL_tree tree = new AVL_tree();

        /* Constructing tree given in the above figure */
        tree.root = tree.insert(tree.root, 25);
        tree.root = tree.insert(tree.root, 15);
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 4);
        tree.root = tree.insert(tree.root, 12);

        System.out.println("Preorder traversal of "+ "constructed tree is : ");
        tree.preOrder(tree.root);
        tree.root = tree.deleteNode(tree.root, 25);
        System.out.println("");
        System.out.println("Preorder traversal after "+ "deletion of 10 :");
        tree.preOrder(tree.root);
    }
}


