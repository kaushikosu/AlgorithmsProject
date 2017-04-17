package com.kaushik.algorithmutility.entities;

public class GenericGraphEdge<T,X> {
	
	private T source;
	private T destination;
	private X edgeWeight;
	
	public T getSource() {
		return source;
	}
	public void setSource(T source) {
		this.source = source;
	}
	public T getDestination() {
		return destination;
	}
	public void setDestination(T destination) {
		this.destination = destination;
	}
	public X getEdgeWeight() {
		return edgeWeight;
	}
	public void setEdgeWeight(X edgeWeight) {
		this.edgeWeight = edgeWeight;
	}
	
	
	
	
}
