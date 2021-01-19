package com.app.binary_trees;

import com.app.binary_trees.InorderBinaryTree.TreeNode;

public class PreorderBinaryTree {

	//root ---->> left ----->> right
	
	TreeNode rootNode;
	
	public PreorderBinaryTree() {
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
