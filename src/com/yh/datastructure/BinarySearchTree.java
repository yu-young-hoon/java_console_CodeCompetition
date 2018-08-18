package com.yh.datastructure;

public class BinarySearchTree {
	private class Node {
		Node left;
		Node right;
		int data;
	}
	public Node root;
	
	public void insertData(int data) {
		if(root == null) {
			Node node = new Node();
			node.data = data;
			root = node;
			return;
		}
		insertNode(root, data);
	}
	
	private void insertNode(Node parent, int data) {
		if(parent.data >= data) {
			if(parent.left == null) {
				Node node = new Node();
				node.data = data;
				parent.left = node;
				return;
			}
			insertNode(parent.left, data);
		} else {
			if(parent.right == null) {
				Node node = new Node();
				node.data = data;
				parent.right = node;
				return;
			}
			insertNode(parent.right, data);
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
						succedingNode.left = findNodeParent.right.left;
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
