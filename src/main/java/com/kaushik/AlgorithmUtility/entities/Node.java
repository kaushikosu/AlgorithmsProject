package com.kaushik.AlgorithmUtility.entities;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
	
	private int numberOfChildren;
	
	private List<T> children;
	private T parent;
	
	public T getParent() {
		return parent;
	}

	public void setParent(T parent) {
		this.parent = parent;
	}

	public int getNumberOfChildren() {
		return numberOfChildren;
	}

	public void setNumberOfChildren(int numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}
	
	protected void addChild(T n){
		children.add(n);
	}

	public Node(){
		children = new ArrayList<T>();
	}
}
