package com.kaushik.AlgorithmUtility.entities;

import java.util.ArrayList;
import java.util.List;

public class GenericTreeNode<T> {
	
	public GenericTreeNode() {
		super();
		this.children =  new ArrayList<GenericTreeNode<T>>();
	}

	private List<GenericTreeNode<T>> children;
	private GenericTreeNode<T> parent;
	
	private T data;
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public GenericTreeNode<T> getParent() {
		return parent;
	}

	public void setParent(GenericTreeNode<T> parent) {
		this.parent = parent;
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
