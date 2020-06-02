package june.one;

public class InvertBinaryTree {

	// Definition for a binary tree node.
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	private TreeNode invert(TreeNode node) {
		if (node == null)
			return node;

		TreeNode left = invert(node.left);
		TreeNode right = invert(node.right);

		node.left = right;
		node.right = left;

		return node;
	}

	public TreeNode invertTree(TreeNode root) {
		if (root == null)
			return null;

		if (root.right == null && root.left == null)
			return root;

		root = invert(root);

		return root;
	}
}
