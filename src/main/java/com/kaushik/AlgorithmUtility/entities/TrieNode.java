package com.kaushik.AlgorithmUtility.entities;

import java.util.Comparator;

public class TrieNode extends GenericTreeNode<TrieNode>{
	
	private boolean endingLetter;
	
	private String letter;

	public boolean isEndingLetter() {
		return endingLetter;
	}

	public void setEndingLetter(boolean endingLetter) {
		this.endingLetter = endingLetter;
	}

	public String getLetter() {
		return letter;
	}

	public void setLetter(String letter) {
		this.letter = letter;
	}
	
	public TrieNode(String letter,boolean endingletter){
		this.letter = letter;
		this.endingLetter = endingLetter;
	}
	
	public boolean equals(Object o){
		if (o instanceof TrieNode){
			return ((TrieNode) o).getLetter() == this.getLetter();
		}
		return false;
	}

}
