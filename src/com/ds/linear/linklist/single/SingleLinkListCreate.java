package com.ds.linear.linklist.single;

public class SingleLinkListCreate {

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	static Node head;

	private void insert(int i) {

		Node newNode = new Node(i);

		if (head == null) {
			head = newNode;
		} else {
			Node last = head;
			while (last.next != null) {
				last = last.next;
			}

			last.next = newNode;
		}

	}

	private static void printLinklist(Node head) {
		while (head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.print("end");
	}

	public static void main(String[] args) {

		SingleLinkListCreate singleLinkList = new SingleLinkListCreate();

		singleLinkList.insert(10);
		singleLinkList.insert(20);
		singleLinkList.insert(30);
		singleLinkList.insert(40);

		printLinklist(head);

	}

}
