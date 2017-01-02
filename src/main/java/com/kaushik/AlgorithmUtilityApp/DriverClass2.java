package com.kaushik.AlgorithmUtilityApp;

import com.kaushik.AlgorithmUtility.entities.RTNode;

public class DriverClass2 {
	public static  void main(String [] args) {	
			RadixTree tree = new RadixTree();
			tree.insertNodeIntoTheTree(new RTNode("he"));
			tree.insertNodeIntoTheTree(new RTNode("hey"));
			tree.insertNodeIntoTheTree(new RTNode("help"));
			tree.insertNodeIntoTheTree(new RTNode("hell"));
			tree.insertNodeIntoTheTree(new RTNode("hello"));
			
			System.out.println(tree.suggestionsForASubString("hel"));
	}
}
