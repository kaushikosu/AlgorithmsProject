package com.kaushik.algorithmutilityapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.kaushik.algorithmutility.entities.BSTNode;
import com.kaushik.algorithmutility.entities.RTNode;
import com.kaushik.algorithmutility.entities.TreeProcessingException;

public class driverClass {

	public static void main(String[] args) {
		
		List<Integer> inputList = new ArrayList<Integer>(Arrays.asList(12,5,18,2,9,15,19,13,17));
		BinarySearchTree bst = new BinarySearchTree();
		bst.buildBinarySearchTree(inputList);
		BSTNode n = new BSTNode(12);
		System.out.println("successor of two is "+ bst.successorOf(n).getValue());
		
		
		RTNode n1 = new RTNode("a");
		RTNode n2 = new RTNode("b");
		
		//System.out.println("comparator on n1 and n2 is "+ n1n2);
		try{
		
		}
		catch (TreeProcessingException e){
			System.out.println(e.getDetailedMessage());
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}

}
