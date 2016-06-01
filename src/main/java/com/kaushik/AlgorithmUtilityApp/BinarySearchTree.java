package com.kaushik.AlgorithmUtilityApp;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

import com.kaushik.AlgorithmUtility.entities.Node;
import com.kaushik.AlgorithmUtility.entities.TreeProcessingException;

public class BinarySearchTree implements Tree {
		
	int noOfNodes;
	
	Node root;
	
	List<Node> sortedList = new ArrayList<Node>();
	
	public static final Logger logger = Logger.getLogger(BinarySearchTree.class);
	
	public int getNoOfNodes() {
		return noOfNodes;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	public BinarySearchTree(){
		root = null;
		noOfNodes = 0;
	}
	
	public void buildBinarySearchTree(List<Integer> inputList){
		List<Node> inputNodes = createNodesForInputList(inputList);
		setRootAndPopulateTheTree(inputNodes);
	}
	
	private List<Node> createNodesForInputList(List<Integer> inputList){
		List<Node> nodeListForInput = new ArrayList<Node>();
		for (int value:inputList){
			Node n = new Node();
			n.setValue(value);
			nodeListForInput.add(n);
		}
		return nodeListForInput;
	}
	
	private void setRootAndPopulateTheTree(List<Node> inputNodes){
		setRoot(inputNodes.get(0));
		populateTheTree(getRoot(),inputNodes.subList(1, inputNodes.size()));
	}
	
	private void populateTheTree(Node root,List<Node> inputNodes){
		for (Node n: inputNodes){
			insertNode(root,n);
		}
	}
	
	public void insertNode(Node root,Node n){
		if (n.getValue() < root.getValue()){
			 if (root.getLeftChild() == null){
				 root.setLeftChild(n);
				 n.setParent(root);
			 }
			 else{
				 insertNode(root.getLeftChild(), n);
			 }
		}
		else if (n.getValue() > root.getValue()){
			if (root.getRightChild() == null){
				root.setRightChild(n);
				n.setParent(root);
			}
			else{
				insertNode(root.getRightChild(), n);
			}
		}
	}
	
	public Node successorOf(Node n){
		Node nodeInTree = getReferenceToElement(root, n);
		
		if (nodeInTree != null){
			
			if (nodeInTree.getRightChild() != null){
				return nodeInTree.getRightChild();
			}
			
			
			if (nodeIsLeftChildOfParent(nodeInTree)){
				return nodeInTree.getParent();
			}
			
			if (nodeIsRightChildOfParent(nodeInTree)){
				return successorIfParentIsItsParentsLeftChild(nodeInTree);
			}
			
			
		}
		return null;
	}
	
	private boolean nodeIsLeftChildOfParent(Node n){
		boolean isLeftChild = false;
		Node parent = n.getParent();
		if (parent != null && parent.getLeftChild() == n){
			isLeftChild = true;
		}
		return isLeftChild;
	}
	
	private boolean nodeIsRightChildOfParent(Node n){
		boolean isRightChild = false;
		Node parent = n.getParent();
		if (parent != null && parent.getRightChild() == n){
			isRightChild = true;
		}
		return isRightChild;
	}
	
	private Node successorIfParentIsItsParentsLeftChild(Node n){
		Node parent = n.getParent();
		if (parent == null){
			return null;
		}
		Node parentsParent = parent.getParent();
		if (parentsParent == null){
			return null;
		}
		while (parentsParent.getLeftChild() != parent){
				parent = parentsParent;
				parentsParent = parent.getParent();
		}
		return parentsParent;
	} 
	
	public Node getReferenceToElement(Node root,Node n){
		Node n1 = null;
		if (n.getValue() < root.getValue()){
			root = root.getLeftChild();
			if (root == null){
				return null;
			}
			n1 = getReferenceToElement(root, n);
		}
		else if (n.getValue() > root.getValue()){
			root = root.getRightChild();
			if (root == null){
				return null;
			}
			n1 = getReferenceToElement(root, n);
		}
		else{
			n1 = root;
		}
		return n1;
	}
	
	private List<Integer> toInteger(List<Node> sortedList){
		List<Integer> integerList = new ArrayList<Integer>();
		for(Node n: sortedList){
			integerList.add(n.getValue());
		}
		return integerList;
	}
	
	public List<Integer> toList() throws Exception{
		if (root == null){
			throw new TreeProcessingException("The tree has not been initialized");
		}
		performInOrderTreeWalk(getRoot());
		return toInteger(sortedList);
	}
	
	public void performInOrderTreeWalk(Node root){
		if (root.getLeftChild() == null && root.getRightChild() == null){
			sortedList.add(root);
		}
		if (root.getLeftChild() != null){
			if (root.getRightChild() != null){
				performInOrderTreeWalk(root.getLeftChild());
				sortedList.add(root);
				performInOrderTreeWalk(root.getRightChild());
			}
			if (root.getRightChild() == null){
				performInOrderTreeWalk(root.getLeftChild());
				sortedList.add(root);
			}
		}
		else if (root.getLeftChild() == null){
			if (root.getRightChild() != null){
				sortedList.add(root);
				performInOrderTreeWalk(root.getRightChild());
			}
		}
	}
}
