package com.kaushik.algorithmutility.linkedlistalgos;

import com.kaushik.algorithmutility.entities.LinkedlistNode;

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
						LinkedlistNode<Integer> p3 = p2.getNext();
						while(p3.getData() == p1.getData()){
							p3 = p3.getNext();
							if (p3 == null){
								break;
							}
						}
						p2.setNext(p3);
					}
				}
				p2 = p2.getNext();
			}
			p1 = p1.getNext();
		}
	}
	
	public void removeMiddleNode(LinkedlistNode<Integer> head){
		LinkedlistNode<Integer> p1 = head;
		LinkedlistNode<Integer> prevP1 = null;
		LinkedlistNode<Integer> p2 = null;
		if (head.getNext() != null){
			p2 = p1.getNext();
			if (p2.getNext() == null){
				p1.setNext(null);
				return;
			}
		}
		else{
			return;
		}
		while(p2.getNext()!= null && p2.getNext().getNext() != null){
			prevP1 = p1;
			p1 = p1.getNext();
			p2 = p2.getNext().getNext();
		}
		if (p2.getNext() == null){
			prevP1.setNext(prevP1.getNext().getNext());
		}
		else if (p2.getNext().getNext() == null){
			p1.setNext(p1.getNext().getNext());
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
