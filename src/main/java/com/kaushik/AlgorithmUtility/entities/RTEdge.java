package com.kaushik.algorithmutility.entities;

public class RTEdge extends GenericGraphEdge<RTNode,String> {
	
	public RTEdge(Character edgeWeight){
		super();
		this.setEdgeWeight(""+edgeWeight);
	}
	
	public boolean equals(Object o){
		if ((o instanceof RTEdge) && (this.getEdgeWeight() == ((RTEdge)o).getEdgeWeight())){
			return true;	
		}
		return false;
	}
	
	public int hashCode(){
		return this.getEdgeWeight().hashCode();
	}
	

}
