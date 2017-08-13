package com.kaushik.algorithmutility.entities;

public class DAG<T> extends GenericGraph<DAGNode<T>>{

	public void addVertex(DAGNode<T> node){
		vertices.add(node);
	}
	
	public boolean detectALoop(DAGNode<T> startVertex){
		boolean hasALoop = false;
		return hasALoop;
	}
	
	private int DfsTimingCounter = 0;
	
	public void DFSUsingRecursion(DAGNode<T> startVertex){
		startVertex.setDiscoveryTime(DfsTimingCounter);
		startVertex.setDiscovered(true);
		for(DAGNode<T> vertex : startVertex.getAdjacencyList()){
			if (vertex.isDiscovered()){
				continue;
			}
			vertex.setDiscoveryTime(++DfsTimingCounter);
			vertex.setDiscovered(true);
			DFSUsingRecursion(vertex);
		}
		startVertex.setFinishTime(DfsTimingCounter);
	}
	
	@Override
	public void printAdjacencyList(){
		for(DAGNode<T> vertex: vertices){
			System.out.println(vertex.toString() + " ---->" +vertex.getAdjacencyList());
		}
	}
	
}
