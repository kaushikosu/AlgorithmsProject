package com.kaushik.AlgorithmUtility.entities;

import java.util.ArrayList;
import java.util.List;

public class GenericTreeNode<T> {
	
	
	
	public GenericTreeNode() {
		super();
		this.children =  new ArrayList<GenericTreeNode<T>>();
	}

	private List<GenericTreeNode<T>> children;
	private T data;
	
	public T getParent() {
		return data;
	}

	public void setParent(T parent) {
		this.data = parent;
	}

	public int getNumberOfChildren() {
		return children.size();
	}
	
	public void addChild(GenericTreeNode<T> n){
		children.add(n);
	}
	
	public List<GenericTreeNode<T>> getChildren(){
		return children;
	}
}
