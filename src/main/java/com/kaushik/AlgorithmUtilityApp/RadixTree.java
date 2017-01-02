package com.kaushik.AlgorithmUtilityApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;

import com.kaushik.AlgorithmUtility.entities.RTEdge;
import com.kaushik.AlgorithmUtility.entities.RTNode;

public class RadixTree implements Tree {
	
	RTNode root;
	
	public static final Logger logger = Logger.getLogger(RadixTree.class);
	
	RadixTree (){
		root = new RTNode("");
		root.setVisible(false);
	}
	
	public RadixTree(List<String> inputList){
		List<RTNode> inputNodes = createNodesForInputList(inputList);
		populateTheTree(inputNodes);
	}

	private void populateTheTree(List<RTNode> inputNodes) {
		for(RTNode r: inputNodes){
			insertNodeIntoTheTree(r);
		}
		
	}
	
	public void insertNodeIntoTheTree(RTNode r){
		char[] letters = r.getValue().toCharArray();
		RTNode rootOfLastInsert = root;
		for (char letter: letters){
			rootOfLastInsert = insertCharacterIntoTheTree(rootOfLastInsert,letter);
		}
		rootOfLastInsert.setVisible(true);
		System.out.println("node value is "+rootOfLastInsert.getValue());
	}
	
	public RTNode insertCharacterIntoTheTree(RTNode rootOfLastInsert, char c){
		if (rootOfLastInsert.findMatchingEdge(c) == null){
			String destinationNodeValue = rootOfLastInsert.getValue() + c;
			RTNode destination = new RTNode(destinationNodeValue);
			rootOfLastInsert.addEdge(destination,c);
			System.out.println("added edge with weight "+c);
			rootOfLastInsert = destination;
		}
		else{
			RTEdge matchingEdge = rootOfLastInsert.findMatchingEdge(c);
			rootOfLastInsert = (RTNode)matchingEdge.getDestination();
		}
		return rootOfLastInsert;
	}

	public List<String> suggestionsForASubString(String subString){
		char[] letters = subString.toCharArray();
		RTNode pointer = root;
		for (char letter: letters){
			RTEdge edge = pointer.findMatchingEdge(letter);
			if (edge == null){
				return Collections.emptyList();
			}
			pointer = (RTNode)edge.getDestination();
		}
		return getAllStringsUnderANode(pointer);
	}
	
	private List<String> getAllStringsUnderANode(RTNode r){
		List<String> strings = new ArrayList<String>();
		if (r.getEdges().isEmpty()){
			if (r.isVisible()){
				strings.add(r.getValue());
				return strings;
			}
			else{
				return Collections.emptyList();
			}
		}
		else{
			if (r.isVisible()){
				strings.add(r.getValue());
			}
			for(RTEdge edge: r.getEdges()){
				strings.addAll(getAllStringsUnderANode(((RTNode)edge.getDestination())));
			}
			return strings;
		}
		
	}
	
	private List<RTNode> createNodesForInputList(List<String> inputList) {
		List<RTNode> stringsAddedToTheTree = new ArrayList<RTNode>();
		for(String s: inputList){
			RTNode r = new RTNode(s);
			stringsAddedToTheTree.add(r);
		}
		return stringsAddedToTheTree;
	}
}
