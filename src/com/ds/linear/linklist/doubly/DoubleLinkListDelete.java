package com.ds.linear.linklist.doubly;

public class DoubleLinkListDelete {
	static class Node{
		int data;
		Node next;
		Node prev;
		Node(int d){
			data = d;
			next = prev = null;
		}
	}
	
	static Node head;
	
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
		
		DoubleLinkListDelete doubleLinkListDelete = new DoubleLinkListDelete();
		
		doubleLinkListDelete.insert(10);
		doubleLinkListDelete.insert(20);
		doubleLinkListDelete.insert(30);
		doubleLinkListDelete.insert(40);
		doubleLinkListDelete.insert(50);
		
		printLinklist(head);
		
		doubleLinkListDelete.deleteNode(10);
		
		printLinklist(head);
		
	}

	//10->20->30->40->50->null
	
	private void deleteNode(int deleteData) {
		
		Node curNode = head;
		Node preNode = null;
		
		if(curNode.data == deleteData) {
			head = curNode.next;
		}else {
			while(curNode.data != deleteData) {
				preNode = curNode;
				curNode = curNode.next;
			}
			preNode.next = curNode.next;
			if(curNode.next != null) {
				curNode.next.prev = preNode;
			}
		}
	}
	
}
