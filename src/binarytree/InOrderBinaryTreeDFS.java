package binarytree;

public class InOrderBinaryTreeDFS {

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

		// 5 3 4 1 2
		printInOrderBinaryTree(root);
	}

	// LEFT -> CURRENT -> RIGHT
	private static void printInOrderBinaryTree(TreeNode root) {
		if (root == null)
			return;


		printInOrderBinaryTree(root.left);
		System.out.print(root.data + " ");
		printInOrderBinaryTree(root.right);
	}
}
