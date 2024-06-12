package binarytree;

public class PostOrderBinaryTreeDFS {

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

		// 5 4 3 2 1
		printPostOrderBinaryTree(root);
	}


	// LEFT -> RIGHT -> CURRENT
	private static void printPostOrderBinaryTree(TreeNode root) {
		if (root == null)
			return;

		printPostOrderBinaryTree(root.left);
		printPostOrderBinaryTree(root.right);
		System.out.print(root.data + " ");
	}
}
