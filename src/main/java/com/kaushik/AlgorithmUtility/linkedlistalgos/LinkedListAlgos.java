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
	
	
	public void removeDups(LinkedlistNode<Integer> head){
		LinkedlistNode<Integer> p1 = head;
		LinkedlistNode<Integer> p2 = null;
		while(p1 != null){
			p2 = p1;
			while(p2 != null){
				if (p2.getNext() == null){
					break;
				}
				if (p2.getNext().getNext() == null){
					if (p2.getNext().getData().equals(p1.getData())){
						p2.setNext(null);
					}
				}
				else{
					if (p2.getNext().getData().equals(p1.getData())){
						p2.setNext(p2.getNext().getNext());
					}
				}
				p2 = p2.getNext();
			}
			p1 = p1.getNext();
		}
	}
	
	public void printLinkedList(LinkedlistNode<Integer> head){
		System.out.print("[");
		while(head != null){
			System.out.print(head.getData());
			head = head.getNext();
		}
		System.out.print("]");
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
