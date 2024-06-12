public class PreOrderBinaryTreeDFS {
	public static void main(String[] args) {

		Node root = new Node(1);
		root.right = new Node(2);
		root.left = new Node(3);
		root.left.right = new Node(4);
		root.left.left = new Node(5);


		// 1 3 5 4 2

		printPreOrderBinaryTree(root);
	}

	private static void printPreOrderBinaryTree(Node root) {
		if (root == null) {
			return;
		}

		System.out.print(root.data + " ");
		printPreOrderBinaryTree(root.left);
		printPreOrderBinaryTree(root.right);
	}
}