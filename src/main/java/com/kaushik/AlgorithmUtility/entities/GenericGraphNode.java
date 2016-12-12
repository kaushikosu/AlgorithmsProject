package com.kaushik.AlgorithmUtility.entities;

import java.util.ArrayList;
import java.util.List;

public class GenericGraphNode<T> {
	
	
	private List<GenericGraphNode<T>> adjacencyList;
	
	public List<GenericGraphNode<T>> getAdjacencyList() {
		return adjacencyList;
	}

	public GenericGraphNode(){
		adjacencyList = new ArrayList<GenericGraphNode<T>>();
	}
	
	
	
}
