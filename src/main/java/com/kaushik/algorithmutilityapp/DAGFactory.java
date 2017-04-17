package com.kaushik.algorithmutilityapp;

import java.util.Random;
import java.util.List;
import com.kaushik.algorithmutility.entities.DAG;
import com.kaushik.algorithmutility.entities.DAGNode;

public class DAGFactory {

	public DAGFactory(int vertexSize) {
		this.vertexSize = vertexSize;
	}
	
	public DAGFactory(){}

	private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final char[] CHARACTERS = ALPHABET.toCharArray(); 
	private static final int DEFAULT_DAG_VERTEX_SET_SIZE = 100;
	private Random rand = new Random();
	private int vertexSize = DEFAULT_DAG_VERTEX_SET_SIZE;
	
	public DAG<String> createDefaultDag(){
		DAG<String> dag = new DAG<String>();
		addADefaultNumberOfVertices(dag);
		createEdgesBetweenVertices(dag);
		return dag;
	}

	private void addADefaultNumberOfVertices(DAG<String> dag) {
		for (int i = 0; i < vertexSize; i++){
			DAGNode<String> newVertex = new DAGNode<String>(""+CHARACTERS[rand.nextInt(ALPHABET.length())]); 
			dag.addVertex(newVertex);
		}
	}
	
	private void createEdgesBetweenVertices(DAG<String> dag){
		List<DAGNode<String>> vertices = dag.getVertices();
		for(DAGNode<String> vertex: vertices){
			int numberOfEdges = rand.nextInt(vertices.size()-1)+1;
			for (int i = 0; i < numberOfEdges; i++){
				DAGNode<String> randomVertex = vertices.get(rand.nextInt(vertices.size()));
				if (vertex != randomVertex && !vertex.getAdjacencyList().contains(randomVertex)){
					vertex.addNodeToAdjacencyList(randomVertex);
				}
			}
			
		}
	}
	
}
