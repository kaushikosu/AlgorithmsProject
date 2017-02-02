package com.kaushik.AlgorithmUtility.linkedlistalgos;

import com.kaushik.AlgorithmUtility.entities.LinkedlistNode;

public class LinkedListAlgos {

	public LinkedlistNode<Integer> cloneAndReverse(LinkedlistNode<Integer> head){
		LinkedlistNode<Integer> newHead = null;
		while(head != null){
			LinkedlistNode<Integer> newNode = new LinkedlistNode<Integer>(head.getData());
			newNode.setNext(newHead);
			head = head.getNext();
			newHead = newNode;
		}
		return newHead;
	} 
	
	
	public void printLinkedList(LinkedlistNode<Integer> head){
		while(head != null){
			System.out.println(head.getData());
			head = head.getNext();
		}
	}
	
	public LinkedlistNode<Integer> constructLinkedListFromArray(int[] list){
		LinkedlistNode<Integer> head = null;
		LinkedlistNode<Integer> last = head;
		for (int i = 0; i < list.length; i++){
			LinkedlistNode<Integer> current = new LinkedlistNode<Integer>(list[i]);
			current.setNext(null); 
			if (i == 0 || last == null){
				head = current;
			}
			else{
				last.setNext(current);
			}
			last = current;
		}
		return head;
	}
}
