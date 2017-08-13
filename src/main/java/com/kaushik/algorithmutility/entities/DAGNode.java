package com.kaushik.algorithmutility.entities;

public class DAGNode<T> extends GenericGraphNode<DAGNode<T>,T>{

	private DAGNode<T> parent;
	
	private int discoveryTime;
	
	private boolean discovered = false;
	
	public boolean isDiscovered() {
		return discovered;
	}

	public void setDiscovered(boolean discovered) {
		this.discovered = discovered;
	}

	public DAGNode(T value) {
		super(value);
	}
	
	public DAGNode(){
		
	}

	private int finishTime;

	public DAGNode<T> getParent() {
		return parent;
	}

	public void setParent(DAGNode<T> parent) {
		this.parent = parent;
	}

	public int getDiscoveryTime() {
		return discoveryTime;
	}

	public void setDiscoveryTime(int discoveryTime) {
		this.discoveryTime = discoveryTime;
	}

	public int getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(int finishTime) {
		this.finishTime = finishTime;
	}
	
	@Override
	public String toString(){
		return getValue().toString() +"  Start Time: "+ getDiscoveryTime() + " Finish Time: "+ getFinishTime();
	}
	
	
}
