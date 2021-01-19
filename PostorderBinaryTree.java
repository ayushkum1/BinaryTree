package com.app.binary_trees;

import com.app.binary_trees.InorderBinaryTree.TreeNode;

public class PostorderBinaryTree {

	//postorder: left --->> right ----->> root
	
	TreeNode rootNode;
	
	public PostorderBinaryTree() {
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
	
}
