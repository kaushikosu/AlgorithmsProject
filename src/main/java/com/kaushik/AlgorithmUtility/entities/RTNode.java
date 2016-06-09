package com.kaushik.AlgorithmUtility.entities;

import java.util.Comparator;

public class RTNode extends Node<RTNode> implements Comparator<RTNode>{

	private String value;

	public RTNode(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public int compare(RTNode r1, RTNode r2){
		return Integer.valueOf(r1.getValue()) - Integer.valueOf(r2.getValue());
	}
	
	
}
