package com.app.binary_trees;

public class InorderTester {

	public static void main(String[] args) {
		InorderBinaryTree bt = new InorderBinaryTree();
		
		bt.addToTree();
		
		System.out.println("Inorder");
		
		bt.inorder();
		
		System.out.println();

		System.out.println("Preorder");
		bt.preOrder();

		System.out.println();
		System.out.println("Postorder");
		bt.postOrder();
	}
	
}
