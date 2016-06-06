package com.kaushik.AlgorithmUtility.entities;

public class BSTNode extends Node<BSTNode>{
	
	private int value;
	private String name;
	private BSTNode leftChild;
	private BSTNode rightChild;
	private BSTNode parent;
	
	public BSTNode(int value) {
		super();
		this.value = value;
	}
	public BSTNode() {
		// TODO Auto-generated constructor stub
	}
	public BSTNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(BSTNode leftChild) {
		this.leftChild = leftChild;
	}
	public BSTNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(BSTNode rightChild) {
		this.rightChild = rightChild;
	}
	public BSTNode getParent() {
		return parent;
	}
	public void setParent(BSTNode parent) {
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
