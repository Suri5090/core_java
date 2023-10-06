package com.practice;

public class SinglySingleList {

	private ListNode head;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public static void main(String[] args) {
		
		SinglySingleList sll = new SinglySingleList();
		
		sll.head = new ListNode(10);
		ListNode second = new ListNode(5);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(3);
		
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		
		sll.display();
	}

	private void display() {
		ListNode current = head;
		while(current!=null) {
			System.out.print(current.data+" --> ");
			current = current.next;			
		}
		System.out.print("null");
	}
}
