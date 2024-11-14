package test1;

public class BinaryTreeInOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a sample binary tree:
		// 		 1
		// 		/ \
		// 		2 3
		// 		/ \
		// 		4 5

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		System.out.println("Inorder Traversal of the Binary Tree:: ");
		inorderTraversal(root);
	}

	public static void inorderTraversal(TreeNode root) {
		if (root == null) {
			return;
		}
		
		// Recursively traverse the left subtree
		inorderTraversal(root.left);

		// Visit the right node
		System.out.print(root.value + " ");

		// Recursively traverse the right subtree
		inorderTraversal(root.right);
	}
}

class TreeNode {
	int value;
	TreeNode left, right;

	TreeNode(int value) {
		
		this.value = value;
		left = right = null;
	}
}
