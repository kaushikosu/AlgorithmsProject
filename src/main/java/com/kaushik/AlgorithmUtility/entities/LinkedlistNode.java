package com.kaushik.AlgorithmUtility.entities;

public class LinkedlistNode<T> {

	LinkedlistNode<T> next;
	T data;
	public LinkedlistNode<T> getNext() {
		return next;
	}
	public void setNext(LinkedlistNode<T> next) {
		this.next = next;
	}
	public T getData() {
		return data;
	}
	public LinkedlistNode(T data) {
		this.data = data;
	}
	public void setData(T data) {
		this.data = data;
	}
}
