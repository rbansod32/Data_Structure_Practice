package com.ds.nonlinear.tree.binary_search;

public class BSTCreate {

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int d) {
			data = d;
			left = right = null;
		}
	}

	static Node root;

	public static void main(String[] args) {
		BSTCreate bstCreate = new BSTCreate();
		int inputArr[] = { 10, 6, 3, 1, 4, 7, 8, 12, 11, 15, 13, 16 };
		for (int tmpVal : inputArr) {
			root = bstCreate.insert(root, tmpVal);
		}
		printTree(root);
	}

	private Node insert(Node root, int data) {
		if (root == null) {
			root = new Node(data);
		} else {
			if (data < root.data) {
				root.left = insert(root.left, data);
			} else if (data > root.data) {
				root.right = insert(root.right, data);
			}
		}
		return root;
	}

	private static void printTree(Node root) {
		boolean isLeaf = true;
		if (root != null) {
			System.out.print("Node:" + root.data);
			if (root.left != null) {
				System.out.print(" Left:" + root.left.data);
				isLeaf = false;
			}
			if (root.right != null) {
				System.out.print(" Right:" + root.right.data);
				isLeaf = false;
			}
			if (isLeaf) {
				System.out.print(" Leaf Node");
			}
			System.out.println();
			printTree(root.left);
			printTree(root.right);
		}
	}
}
