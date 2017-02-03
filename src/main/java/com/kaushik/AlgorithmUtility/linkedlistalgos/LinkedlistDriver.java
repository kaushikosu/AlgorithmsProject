package com.kaushik.AlgorithmUtility.linkedlistalgos;

import com.kaushik.AlgorithmUtility.entities.LinkedlistNode;

public class LinkedlistDriver {
		
	public static void main(String [] args){
		LinkedListAlgos algos = new LinkedListAlgos();
		int [] arr = {1};
		LinkedlistNode<Integer> head = algos.constructLinkedListFromArray(arr);
		algos.removeMiddleNode(head);
		algos.printLinkedList(head);
	}
}
