package com.kaushik.AlgorithmUtility.linkedlistalgos;

import com.kaushik.AlgorithmUtility.entities.LinkedlistNode;

public class LinkedlistDriver {
		
	public static void main(String [] args){
		LinkedListAlgos algos = new LinkedListAlgos();
		int [] arr = {1,2,3,1,2,1,1,1,1,1,5,0,1,6};
		LinkedlistNode<Integer> head = algos.constructLinkedListFromArray(arr);
		algos.printLinkedList(head);
		algos.removeDups(head);
		algos.printLinkedList(head);
	}
}
