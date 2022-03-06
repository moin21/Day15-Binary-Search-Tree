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
	 * Method postorder to display the BST. left, right, root node. Pass the node
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

	/**
	 * Method size to check the size of the BST 1. If root null then BST is empty
	 * and will return 0 2. Add the right, left child and the root
	 */
	public void size() {
		System.out.println("\n The size of the tree is: " + sizeAll(root));
	}

	public int sizeAll(Node root) {

		if (root == null)
			return 0;

		return sizeAll(root.left) + sizeAll(root.right) + 1;
	}

	/**
	 * Method to search if node is present in the tree 
	 * 1. Pass the root and the note to search 
	 * 2. If root is null return false 
	 * 3. If not return true 
	 * 4. We check the left or right if the node is present.
	 * 
	 * @param data - we pass the data to check if it is present in tree
	 */
	public void search(int data) {
		if (searchAll(root, data))
			System.out.println("Given " + data + " node is present in the tree ");
		else
			System.out.println(" Given " + data + " node is not present in the tree");
	}

	public boolean searchAll(Node root, int data) {

		if (root == null)
			return false;
		if (root.data == data)
			return true;
		else
			return searchAll(root.left, data) || searchAll(root.right, data);
	}
}
