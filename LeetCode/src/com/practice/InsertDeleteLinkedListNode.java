package com.practice;

public class InsertDeleteLinkedListNode {

	private ListNode head;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public void display() {
		ListNode current = head;
		while(current!=null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
	}
	
	public void insertAtBegin(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head=newNode;
	}
	
	public void insertAtEnd(int value) {
		ListNode newNode = new ListNode(value);
		if(head==null) {
			head=newNode;
			return;
		}
		ListNode current = head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=newNode;
	}
	
	public void deleteAtBegin() {
		ListNode current = head;
		current=current.next;
		head=current;
	}
	
	public ListNode deleteAtEnd() {
		if(head==null || head.next==null) {
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		while(current.next!=null) {
			previous = current;
			current = current.next;
		}
		previous.next=null;
		return current;
	}
	
	public static void main(String[] args) {
		InsertDeleteLinkedListNode iln = new InsertDeleteLinkedListNode();
		iln.head = new ListNode(10);
		ListNode second = new ListNode(8);
		ListNode third = new ListNode(5);
		ListNode fourth = new ListNode(7);
		
		iln.head.next = second;
		second.next = third;
		third.next = fourth;
		iln.display();
		System.out.println();
		iln.insertAtBegin(3);
		iln.display();
		System.out.println();
		iln.insertAtEnd(11);
		iln.display();
		System.out.println();
		iln.deleteAtBegin();
		iln.display();
		System.out.println();
		iln.head = iln.deleteAtEnd();
		iln.display();
	}
}
