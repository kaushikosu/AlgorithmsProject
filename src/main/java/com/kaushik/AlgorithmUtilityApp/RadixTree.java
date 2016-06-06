package com.kaushik.AlgorithmUtilityApp;

import java.util.List;

import org.apache.log4j.Logger;
import com.kaushik.AlgorithmUtility.entities.RTNode;

public class RadixTree implements Tree {
	
	RTNode root;
	
	public static final Logger logger = Logger.getLogger(RadixTree.class);
	
	RadixTree (){
		root = null;
	}
	
	public void RadixTree(List<RTNode> inputList){
		List<RTNode> inputNodes = createNodesForInputList(inputList);
		setRootAndPopulateTheTree(inputNodes);
	}

	private void setRootAndPopulateTheTree(List<RTNode> inputNodes) {
		// TODO Auto-generated method stub
		
	}

	private List<RTNode> createNodesForInputList(List<RTNode> inputList) {
		// TODO Auto-generated method stub
		return null;
	}
}
