package com.kaushik.AlgorithmUtility.linkedlistalgos;

import com.kaushik.AlgorithmUtility.entities.LinkedlistNode;

public class LinkedlistDriver {
		
	public static void main(String [] args){
		LinkedListAlgos algos = new LinkedListAlgos();
		int [] arr = {};
		LinkedlistNode<Integer> head = algos.constructLinkedListFromArray(arr);
		algos.printLinkedList(head);
		algos.printLinkedList(algos.cloneAndReverse(head));
	}
}
