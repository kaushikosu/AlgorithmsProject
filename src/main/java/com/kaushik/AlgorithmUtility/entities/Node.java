package com.kaushik.AlgorithmUtility.entities;

public class Node {
	
	private int value;
	private String name;
	private Node leftChild;
	private Node rightChild;
	private Node parent;
	
	public Node(int value) {
		super();
		this.value = value;
	}
	public Node() {
		// TODO Auto-generated constructor stub
	}
	public Node getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}
	public Node getRightChild() {
		return rightChild;
	}
	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}
	public Node getParent() {
		return parent;
	}
	public void setParent(Node parent) {
		this.parent = parent;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
