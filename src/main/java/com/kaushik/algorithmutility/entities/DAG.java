package com.kaushik.algorithmutility.entities;

public class DAG<T> extends GenericGraph<DAGNode<T>>{

	public void addVertex(DAGNode<T> node){
		vertices.add(node);
	}
	
}
