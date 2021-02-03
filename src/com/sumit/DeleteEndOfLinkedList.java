package com.sumit;

public class DeleteEndOfLinkedList {
	
	static Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	void printLinkedList(Node head) {
		while(head !=null) {
			System.out.println(head.data + " ");
			head = head.next;
		}
	}
  
	Node deleteLastNode(Node head) {
		
		if(head == null || head.next==null) {
			return null;
		}
		
		Node secondLastNode = head;
		while(secondLastNode.next.next!=null) {
			secondLastNode = secondLastNode.next;
		}
		secondLastNode.next = null;
		return head;
	}
	
	public static void main(String[] args) {
		DeleteEndOfLinkedList deleteEndOfLinkedList = new DeleteEndOfLinkedList();
		deleteEndOfLinkedList.head = new Node(10);
		deleteEndOfLinkedList.head.next = new Node(20);
		deleteEndOfLinkedList.head.next.next = new Node(30);
		deleteEndOfLinkedList.head.next.next.next = new Node(40);
		
		System.out.println("List before deleting end of linked list");
		deleteEndOfLinkedList.printLinkedList(head);
		
		Node deleteLastNode = deleteEndOfLinkedList.deleteLastNode(head);
		System.out.println("List after deleting end of linked list");
		deleteEndOfLinkedList.printLinkedList(deleteLastNode);
	}
}
