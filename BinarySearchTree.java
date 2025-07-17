class Node{
    int data;
    Node left, right;
    
    Node(int data){
        this.data = data;
        left = right = null;
    }
}
class BinarySearchTree
{
    Node root = null;
    
    static Node insert(Node root, int key){
        if(root == null){
            root = new Node(key);
            return root;
        }
        if(key < root.data){
           root.left = insert(root.left, key);
        }
        else{
            root.right = insert(root.right, key);
        }
        return root;
    }
    static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
	public static void main(String[] args) {
		
		BinarySearchTree tree = new BinarySearchTree();
		
		tree.root = insert(tree.root, 10);
        tree.root = insert(tree.root, 8);
        tree.root = insert(tree.root, 3);
        tree.root = insert(tree.root, 1);
        tree.root = insert(tree.root, 6);
        tree.root = insert(tree.root, 7);
        tree.root = insert(tree.root, 14);
        tree.root = insert(tree.root, 4);

        inorder(tree.root);

		
		
	}
}
