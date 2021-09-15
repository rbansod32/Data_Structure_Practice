package com.ds.linear.linklist.single;

public class SingleLinkListDelete {

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	static Node head;

	private void insertNode(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			Node last = head;
			while(last.next != null) {
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
		System.out.print("end\n");
	}

	public static void main(String[] args) {

		SingleLinkListDelete singleLinkListDelete = new SingleLinkListDelete();

		singleLinkListDelete.insertNode(10);
		singleLinkListDelete.insertNode(20);
		singleLinkListDelete.insertNode(30);
		singleLinkListDelete.insertNode(40);

		printLinklist(head);

		singleLinkListDelete.deleteNode(20);
		
		printLinklist(head);
		
	}

	private void deleteNode(int deleteData) {
		
		Node curNode = head;
		Node prevNode = null;
		
		if(curNode.data == deleteData) {
			head = curNode.next;
		}else {
			while(curNode.data != deleteData) {
				prevNode = curNode;
				curNode = curNode.next;
			}
			
			prevNode.next = curNode.next;
		}
		
	}

}
