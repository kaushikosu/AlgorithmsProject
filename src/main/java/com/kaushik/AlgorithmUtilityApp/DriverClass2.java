package com.kaushik.AlgorithmUtilityApp;

import com.kaushik.AlgorithmUtility.entities.RTNode;

public class DriverClass2 {
	public static  void main(String [] args) {
			RTNode rtNode = new RTNode("15");
			RTNode rtNode2 = new RTNode("12");	
			RadixTree tree = new RadixTree();
			tree.insertNodeIntoTheTree(rtNode);
			tree.insertNodeIntoTheTree(rtNode2);
	}
}
