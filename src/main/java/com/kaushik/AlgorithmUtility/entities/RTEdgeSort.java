package com.kaushik.AlgorithmUtility.entities;

import java.util.Comparator;

public class RTEdgeSort implements Comparator<RTEdge>{

	public int compare(RTEdge e1, RTEdge e2) {
		return e1.getEdgeWeight().compareTo(e2.getEdgeWeight());
	}

}
