package com.ds.nonlinear.tree.binary;

public class BinaryTreeCreate {

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

		BinaryTreeCreate binaryTreeCreate = new BinaryTreeCreate();

		binaryTreeCreate.insert(10);
		binaryTreeCreate.insert(20);
		binaryTreeCreate.insert(30);
		binaryTreeCreate.insert(40);
		binaryTreeCreate.insert(50);

		printLinklist(root);
		
	}

	private void insert(int data) {

		Node newNode = new Node(data);

		if (root == null) {
			root = newNode;
		} else {

			Node last = root;
			while(last.left != null) {
				last = last.left;
			}
			
			last.left = newNode;
			
		}

	}
	
	private static void printLinklist(Node root) {
		while (root != null) {
			System.out.print(root.data + "->");
			root = root.left;
		}
		System.out.print("end");
	}

}
