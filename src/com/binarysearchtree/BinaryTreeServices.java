package com.binarysearchtree;

public class BinaryTreeServices {
	Node root;

	/**
	 * Method to add data to Binary Search Tree. 1. Create a newNode for the data 2.
	 * Call the insertAll method 3. Call the display method to print the Binary
	 * Search Tree
	 * 
	 * @param data - data to insert
	 */
	public void insert(int data) {

		Node newNode = new Node(data);
		this.root = insertAll(root, newNode);
		display(this.root);
		System.out.println();
	}

	/**
	 * Method to insert the node to the tree 1. Check if the root is null. If null
	 * then we return the node 2. If node less than root node will be entered to the
	 * left 3. If the node greater than root node will be entered to the right
	 * 
	 * @param root - Root node
	 * @param node - Node to insert
	 * @return - Node output with implemented BST
	 */
	public Node insertAll(Node root, Node node) {

		if (root == null)
			return node;
		else if (root.compareTo(node) > 0) {
			System.out.print(" inserted " + node.data + " in the left \n");
			root.left = insertAll(root.left, node);
		}

		else if (root.compareTo(node) < 0) {
			System.out.print(" inserted " + node.data + " in the right \n");
			root.right = insertAll(root.right, node);
		}

		return root;
	}

	/**
	 * Method to display the BST 1. If root null -return 2. Else - display the left
	 * and then root and then the right child.
	 * 
	 * @param root - root to display the BST
	 */
	public void display(Node root) {
		if (root == null)
			return;

		display(root.left);
		System.out.print(" " + root.data);
		display(root.right);
	}

	/**
	 * Method to display the BST in order. left, data, right. Pass the node and then
	 * call the method inorder and check left or right
	 */
	public void inorder() {
		inorder(root);
	}

	private void inorder(Node r) {
		if (r != null) {
			inorder(r.left);
			System.out.print(r.data + " ");
			inorder(r.right);
		}
	}

	/**
	 * Method to display the BST. root, left, right. Pass the node and then call the
	 * method preorder and check left or right
	 */
	public void preorder() {
		preorder(root);
	}

	private void preorder(Node r) {
		if (r != null) {
			System.out.print(r.data + " ");
			preorder(r.left);
			preorder(r.right);
		}
	}

	/**
	 * Method postorder to display the BST. lefft, right, root node. Pass the node
	 * and then call the method postorder and check left or right
	 */
	public void postorder() {
		postorder(root);
	}

	private void postorder(Node r) {
		if (r != null) {
			postorder(r.left);
			postorder(r.right);
			System.out.print(r.data + " ");
		}
	}
}