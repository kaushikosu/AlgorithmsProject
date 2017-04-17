package com.kaushik.algorithmutilityapp;

import java.util.ArrayList;

import com.kaushik.algorithmutility.entities.GenericTreeNode;
import com.kaushik.algorithmutility.entities.TrieNode;

public class Trie {

	ArrayList<TrieNode> startingLetters = new ArrayList<TrieNode>();
	
	public void insertIntoTheTrie(String input){
		String [] inputChars = input.split("");
		int index = startingLetters.indexOf(inputChars[0]);
		if(index == -1) {
			if (inputChars.length == 1){
				TrieNode node = new TrieNode(inputChars[0],true);
				startingLetters.add(node);
			}
			else{
				TrieNode node = new TrieNode(inputChars[0],false);
				startingLetters.add(node);
				insertRemainingLettersIntoTheTrie(node,inputChars);
			}
		}
		else{
			TrieNode currentNode;
			currentNode = startingLetters.get(index);
			for (int i = 1; i < inputChars.length; i++){
				TrieNode node;
				if (i == inputChars.length-1){
					node = new TrieNode(inputChars[i], true);
				}else{
				node = new TrieNode(inputChars[i], false);
				}
				insertThisCharacterUnder(currentNode,node);
				currentNode = node;
			}
		}	
	}
	
	private void insertRemainingLettersIntoTheTrie(TrieNode root,String[] inputChars){
		for (int i = 1; i < inputChars.length; i++){
			TrieNode currentNode = startingLetters.get(startingLetters.indexOf(inputChars[0])); 
			if (i == inputChars.length-1){
				currentNode.addChild(new TrieNode(inputChars[i],true));
			}
			else{
				TrieNode newNode = new TrieNode(inputChars[i],false);
				currentNode.addChild(newNode);
				newNode.setParent(currentNode);
				currentNode = newNode;
			}
		}
	}
	
	private void insertThisCharacterUnder(TrieNode root,TrieNode node){
		for (TrieNode child: root.getChildren()){
			if (child == node){
				return;
			}
			else{
				root.addChild(node);
				node.setParent(root);
			}
		}
		
	}
	
	public ArrayList<String> getAllWordsWithASubString(String input){
		String[] inputChars = input.split("");
		return null;
	}
	
	private ArrayList<String> getStringsUnderARoot(TrieNode n){
		StringBuilder sb = new StringBuilder();
		TrieNode currentNode = n;
		return null;
	}
}
