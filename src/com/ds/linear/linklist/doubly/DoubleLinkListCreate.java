package com.ds.linear.linklist.doubly;

public class DoubleLinkListCreate {
	static class Node{
		int data;
		Node next = null;
		Node prev = null;
		Node(int d){
			data = d;
			next = prev = null;
		}
	}
	
	static Node head;
	
	private static void printLinklist(Node head) {
		while (head != null) {
			
			String tmp = "Node:" + head.data;
			tmp += head.prev != null ? "-> Prev:" + head.prev.data : "-> Prev:Null";
			tmp += head.next != null ? "-> Next:" + head.next.data : "-> Next:Null";
			
			System.out.println(tmp);
			head = head.next;
		}
	}
	
	public static void main(String[] args) {
		DoubleLinkListCreate doubleLinkListInsert = new DoubleLinkListCreate();
		
		doubleLinkListInsert.insert(10);
		doubleLinkListInsert.insert(20);
		doubleLinkListInsert.insert(30);
		doubleLinkListInsert.insert(40);
		doubleLinkListInsert.insert(50);
		
		printLinklist(head);
		
	}

	private void insert(int data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
		}else {
			Node last = head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = newNode;
			newNode.prev = last;
		}
	
	}
	
}
