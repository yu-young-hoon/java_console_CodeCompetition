package com.yh.datastructure;

import java.util.Iterator;

public class Stack {
	private class Node {
		Node next;
		int data;
	}
	
	private Node front;
	
	public void pushBack(int data) {
		Node node = new Node();
		node.data = data;
		
		if(front == null) {
			front = node;
			return;
		}
		
		node.next = front;
		front = node;
	}
	
	public Integer pop() {
		if(front == null)
			return null;
		int data = front.data;
		front = front.next;
		return data;
	}
}
