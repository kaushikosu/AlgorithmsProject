package com.kaushik.AlgorithmUtility.entities;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class RTNode extends GenericTreeNode<String> implements Comparator<RTNode>,Comparable<RTNode>{

	private String value;
	
	private boolean visible;
	
	private List<RTEdge> edges;

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public RTNode(String value) {
		super();
		this.value = value;
		this.edges = new LinkedList<RTEdge>();
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public List<RTEdge> getEdges() {
		return edges;
	}

	public void addEdge(RTEdge edge) {
		edges.add(edge);
	}
	
	public boolean doesEdgeWeightExist(Character edgeWeight){
		return edges.contains(new RTEdge(edgeWeight));
	}
	
	public void addEdge(RTNode destination,Character edgeWeight){
		RTEdge edge = new RTEdge(edgeWeight);
		edge.setSource(this);
		edge.setDestination(destination);
		edges.add(edge);
	}
	
	public RTEdge findMatchingEdge(Character edgeWeight){
		int indexOfTheElement = edges.indexOf(new RTEdge(edgeWeight));
		if (indexOfTheElement >=0 ){
			return edges.get(indexOfTheElement);
		}
		return null;
	}
	
	public int compare(RTNode r1, RTNode r2){
		return Integer.valueOf(r1.getValue()) - Integer.valueOf(r2.getValue());
	}

	public int compareTo(RTNode o) {
		return this.getValue().compareToIgnoreCase(o.getValue());
	}
	
	
}
