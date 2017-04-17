package com.kaushik.algorithmutility.entities;

import java.util.ArrayList;
import java.util.List;

public class GenericGraphNode<T,X> extends UniqueEntity{
	
	private X value;
	
	private List<T> adjacencyList;
	
	public List<T> getAdjacencyList() {
		return adjacencyList;
	}

	public GenericGraphNode(){
		adjacencyList = new ArrayList<T>();
	}

	public X getValue() {
		return value;
	}

	public void setValue(X value) {
		this.value = value;
	}
	
	public void addNodeToAdjacencyList(T node){
		adjacencyList.add(node);
	}
	
	public void removeNodeFromAdjacencyList(T node){
		adjacencyList.remove(node);
	}

	public GenericGraphNode(X value) {
		super();
		this.value = value;
		adjacencyList = new ArrayList<T>();
	}
	
	public String toString(){
		return value.toString();
	}
	
	
}
