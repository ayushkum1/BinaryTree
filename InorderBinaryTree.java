package com.app.binary_trees;

public class InorderBinaryTree {

	//Inorder : Left ----->> root ---->> right
	
	TreeNode rootNode;
	
	public InorderBinaryTree() {
		rootNode = null;
	}
	
	public class TreeNode{
		int data;
		TreeNode leftChildNode;
		TreeNode rightChildNode;
	}
	
	public void addToTree() {
		rootNode = new TreeNode();
		rootNode.data = 5;
		rootNode.leftChildNode = new TreeNode();
		rootNode.rightChildNode = new TreeNode();
		rootNode.leftChildNode.data = 3;
		rootNode.rightChildNode.data = 1;
		rootNode.rightChildNode.leftChildNode = new TreeNode();
		rootNode.rightChildNode.leftChildNode.data = 9;
	}
	
	public void inorder() {
		inorder(rootNode);
	}
	
	public void inorder(TreeNode node) {
		
		if(node == null) {
			return;
		}
		
		if(node.leftChildNode != null) {
			inorder(node.leftChildNode);
		}
		
		System.out.println(node.data);
		
		if(node.rightChildNode != null) {
			inorder(node.rightChildNode);
		}
		
	}
	
	public void postOrder() {
		postOrder(rootNode);
	}
	
	public void postOrder(TreeNode node) {
		
		if(node == null) {
			return;
		}
		
		if(node.leftChildNode != null) {
			postOrder(node.leftChildNode);
		}
		
		if(node.rightChildNode != null) {
			postOrder(node.rightChildNode);
		}
		
		System.out.println(node.data);
		
	}
	
	
	public void preOrder() {
		preOrder(rootNode);
	}
	
	public void preOrder(TreeNode node) {
		
		if(node == null) {
			return;
		}
		
		System.out.println(node.data);
		
		if(node.leftChildNode != null) {
			preOrder(node.leftChildNode);
		}
		
		if(node.rightChildNode != null) {
			preOrder(node.rightChildNode);
		}	
	}
	
}
