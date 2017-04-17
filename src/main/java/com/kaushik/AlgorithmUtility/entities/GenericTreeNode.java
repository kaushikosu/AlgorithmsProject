package com.kaushik.algorithmutility.entities;

import java.util.ArrayList;
import java.util.List;

public class GenericTreeNode<T,X> extends GenericGraphNode<T,X>{
	
	public GenericTreeNode() {
		this.children =  new ArrayList<T>();
	}
	
	public GenericTreeNode(X value){
		super(value);
		this.children =  new ArrayList<T>();
	}

	private List<T> children;
	private T parent;
	
	private T data;
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public T getParent() {
		return parent;
	}

	public void setParent(T parent) {
		this.parent = parent;
	}

	public int getNumberOfChildren() {
		return children.size();
	}
	
	public void addChild(T n){
		children.add(n);
	}
	
	public List<T> getChildren(){
		return children;
	}
}
