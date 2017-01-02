package com.kaushik.AlgorithmUtility.entities;

public class GenericGraphEdge<T,X> {

	
	private GenericGraphNode<X> source;
	private GenericGraphNode<X> destination;
	private T edgeWeight;
	
	public GenericGraphNode<X> getSource() {
		return source;
	}
	public void setSource(GenericGraphNode<X> source) {
		this.source = source;
	}
	public GenericGraphNode<X> getDestination() {
		return destination;
	}
	public void setDestination(GenericGraphNode<X> destination) {
		this.destination = destination;
	}
	public T getEdgeWeight() {
		return edgeWeight;
	}
	public void setEdgeWeight(T edgeWeight) {
		this.edgeWeight = edgeWeight;
	}
	
	
	
	
	
}
