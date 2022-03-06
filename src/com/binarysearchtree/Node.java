package com.binarysearchtree;

public class Node implements Comparable<Node> {

	int data;
	Node right;
	Node left;

	/**
	 * constructor
	 * 
	 * @param data - data in the node
	 */
	public Node(int data) {
		super();
		this.data = data;
	}

	/**
	 * We are overriding the compareTo method If the node is more that it will
	 * return 1 and if less than return -1
	 */
	@Override
	public int compareTo(Node node) {
		// TODO Auto-generated method stub

		if (this.data > node.data)
			return 1;
		else if (this.data < node.data)
			return -1;
		else
			return 0;
	}

}