package com.kaushik.algorithmutility.entities;

public class BSTNode<T> extends GenericTreeNode<BSTNode<T>,T>{
	
	private String name;
	private BSTNode<T> leftChild;
	private BSTNode<T> rightChild;
	private BSTNode<T> parent;
	
	public BSTNode(T value) {
		super(value);
	}
	public BSTNode() {
		// TODO Auto-generated constructor stub
	}
	public BSTNode<T> getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(BSTNode<T> leftChild) {
		this.leftChild = leftChild;
	}
	public BSTNode<T> getRightChild() {
		return rightChild;
	}
	public void setRightChild(BSTNode<T> rightChild) {
		this.rightChild = rightChild;
	}
	public BSTNode<T> getParent() {
		return parent;
	}
	public void setParent(BSTNode<T> parent) {
		this.parent = parent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
