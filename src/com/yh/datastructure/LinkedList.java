package com.yh.datastructure;

public class LinkedList {
	private class Node{
		Node next;
		int data;
	}	
	private Node head;
	
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		
		if(head == null) {
			head = node;
			return;
		}
		
		node.next = head;
		head = node;
	}
	
	public void printAll() {
		Node node = head;
		while(node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
}
