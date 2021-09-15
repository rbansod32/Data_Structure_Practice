package com.ds.linear.linklist.doubly;

public class DoubleLinkListSearch {
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
	
		DoubleLinkListSearch doubleLinkListSearch = new DoubleLinkListSearch();
		
		doubleLinkListSearch.insert(10);
		doubleLinkListSearch.insert(20);
		doubleLinkListSearch.insert(30);
		doubleLinkListSearch.insert(40);
		doubleLinkListSearch.insert(50);
		
		printLinklist(head);
		
		int searchPos = doubleLinkListSearch.searchNode(40);
		
		System.out.println("Element found on location : " + searchPos);
		
	}

	private int searchNode(int searchData) {
		int searchPos = 0;
		
		Node curNode = head;
		
		while(curNode.data != searchData) {
			curNode = curNode.next;
			searchPos++;
		}
		
		return searchPos;
	}
	
}
