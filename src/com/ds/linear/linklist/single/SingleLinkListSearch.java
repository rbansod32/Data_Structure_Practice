package com.ds.linear.linklist.single;

public class SingleLinkListSearch {
	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	static Node head;

	private static void printLinklist(Node head) {
		while (head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.print("end\n");
	}

	public static void main(String[] args) {
		SingleLinkListSearch singleLinkListSearch = new SingleLinkListSearch();

		singleLinkListSearch.insert(10);
		singleLinkListSearch.insert(20);
		singleLinkListSearch.insert(30);
		singleLinkListSearch.insert(40);

		printLinklist(head);
		
		int findPos = searchNode(30);
		
		System.out.println("Found on position : " + findPos);
	}

	private static int searchNode(int searchData) {
		Node curNode = head;
		int findPos = 0;
		while(curNode.data != searchData) {
			curNode = curNode.next;
			findPos++;
		}
		return findPos;
	}

	private void insert(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node last = head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
	}

}
