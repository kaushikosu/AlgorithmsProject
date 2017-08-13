package com.kaushik.algorithmutilityapp;


import com.kaushik.algorithmutility.entities.DAG;

public class DAGDriver {

	public static void main(String[] args){
		DAG<String> dag = new DAGFactory(5).createDefaultDag();
		dag.DFSUsingRecursion(dag.getVertices().get(0));
		dag.printAdjacencyList();
	}
}
