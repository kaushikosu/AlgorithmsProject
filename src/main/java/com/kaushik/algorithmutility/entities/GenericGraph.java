package com.kaushik.algorithmutility.entities;

import java.util.ArrayList;
import java.util.List;

public class GenericGraph<T extends GenericGraphNode<?,?>> {

	protected List<T> vertices = new ArrayList<T>();

	public List<T> getVertices() {
		return vertices;
	}

	public void setVertices(List<T> vertices) {
		this.vertices = vertices;
	}
	
	public void addVertex(T vertex){
		this.vertices.add(vertex);
	}
	
	public void printAdjacencyList(){
		for(T vertex: vertices){
			System.out.println(vertex.toString() + " ---->" +vertex.getAdjacencyList());
		}
	}
}
