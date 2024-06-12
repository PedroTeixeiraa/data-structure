package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalBFS {

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
		bfs(root);
	}

	private static void bfs(TreeNode root) {
		if (root == null) {
			return;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode current = queue.poll();
			System.out.print(current.data + " ");

			if (current.left != null) {
				queue.add(current.left);
			}
			if (current.right != null) {
				queue.add(current.right);
			}
		}

	}
}
