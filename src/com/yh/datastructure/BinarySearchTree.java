package com.yh.datastructure;

public class BinarySearchTree {
	private class Node {
		Node left;
		Node right;
		int data;
	}
	public Node root;
	
	public BinarySearchTree () {
		
	}
	
	public void insertData(int data) {
		Node node = new Node();
		node.data = data;
		
		if(root == null) {
			root = node;
			return;
		}
		
		Node findEndNode = root;
		while(true) {
			if(findEndNode.data >= node.data) {
				if(findEndNode.left == null) {
					findEndNode.left = node;
					break;
				}
				findEndNode = findEndNode.left;
			} else {
				if(findEndNode.right == null) {
					findEndNode.right = node;
					break;
				}
				findEndNode = findEndNode.right;
			}
		}
	}
	
	public void deleteData(int data) {
		Node findNodeParent = root;
		while(true) {
			if(findNodeParent.data >= data) {
				if(findNodeParent.left == null) {
					System.out.println("찾지 못했습니다.");
					return;
				}
				if(findNodeParent.left.data == data) { // 찾음
					Node succedingNode = findSuccedingNode(findNodeParent.left);
					if(succedingNode != null)
						succedingNode.right = findNodeParent.left.right;
					findNodeParent.left = succedingNode;
					break;
				}
				
				findNodeParent = findNodeParent.left;
			} else {
				if(findNodeParent.right == null) {
					System.out.println("찾지 못했습니다.");
					return;
				}
				if(findNodeParent.right.data == data) { // 찾음
					Node succedingNode = findSuccedingNode(findNodeParent.right);
					if(succedingNode != null)

					findNodeParent.right = succedingNode;
					break;
				}
				findNodeParent = findNodeParent.right;
			}
		}
	}
	
	private Node findSuccedingNode(Node deleteNode) {
		Node succedingNode = deleteNode;
		if(succedingNode.right != null) {
			succedingNode = succedingNode.right;
			while(true) {
				if(succedingNode.left == null) {
					return succedingNode;
				}
				succedingNode = succedingNode.left;
			}
		} else if(succedingNode.left != null) {
			return succedingNode.left;
		} else {
			return null;
		}
	}
	
	public static void main(String args[]) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insertData(15);
		tree.insertData(10);
		tree.insertData(20);
		tree.insertData(8);
		tree.insertData(12);
		tree.insertData(18);
		tree.insertData(25);
		
		tree.deleteData(25);
		
		System.out.println("");
	}
}
