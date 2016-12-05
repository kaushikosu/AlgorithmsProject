package com.kaushik.AlgorithmUtility.entities;

public class BSTNode<T> extends GenericTreeNode<BSTNode<T>>{
	
	private T value;
	private String name;
	private BSTNode<T> leftChild;
	private BSTNode<T> rightChild;
	private BSTNode<T> parent;
	
	public BSTNode(T value) {
		super();
		this.value = value;
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
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
