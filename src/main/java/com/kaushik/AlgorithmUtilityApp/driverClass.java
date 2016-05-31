package com.kaushik.AlgorithmUtilityApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.kaushik.AlgorithmUtility.entities.TreeProcessingException;

public class driverClass {

	public static void main(String[] args) {
		
		List<Integer> inputList = new ArrayList<Integer>(Arrays.asList(12,5,18,2,9,15,19,13,17));
		BinarySearchTree bst = new BinarySearchTree();
		bst.buildBinarySearchTree(inputList);
		try{
			System.out.println(bst.toList());
		}
		catch (TreeProcessingException e){
			System.out.println(e.getDetailedMessage());
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}

}
