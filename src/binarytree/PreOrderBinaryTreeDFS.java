package binarytree;

public class PreOrderBinaryTreeDFS {
	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.left.left = new TreeNode(5);

		////////////////
		//      1     //
		//   3    2   //
		//  5 4       //
		////////////////

		printPreOrderBinaryTree(root);
	}

	// ROOT -> LEFT -> RIGHT
	private static void printPreOrderBinaryTree(TreeNode root) {
		if (root == null) {
			return;
		}

		System.out.print(root.data + " ");
		printPreOrderBinaryTree(root.left);
		printPreOrderBinaryTree(root.right);
	}
}