package com.kaushik.AlgorithmUtilityApp;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

import com.kaushik.AlgorithmUtility.entities.BSTNode;
import com.kaushik.AlgorithmUtility.entities.GenericTreeNode;
import com.kaushik.AlgorithmUtility.entities.TreeProcessingException;

public class BinarySearchTree implements Tree {
		
	int noOfBSTNodes;
	
	BSTNode<Integer> root;
	
	List<BSTNode<Integer>> sortedList = new ArrayList<BSTNode<Integer>>();
	
	public static final Logger logger = Logger.getLogger(BinarySearchTree.class);
	
	public int getNoOfBSTNodes() {
		return noOfBSTNodes;
	}

	public BSTNode getRoot() {
		return root;
	}

	public void setRoot(BSTNode root) {
		this.root = root;
	}
	
	public BinarySearchTree(){
		root = null;
		noOfBSTNodes = 0;
	}
	
	public void buildBinarySearchTree(List<Integer> inputList){
		List<BSTNode> inputBSTNodes = createBSTNodesForInputList(inputList);
		setRootAndPopulateTheTree(inputBSTNodes);
	}
	
	private List<BSTNode> createBSTNodesForInputList(List<Integer> inputList){
		List<BSTNode> BSTNodeListForInput = new ArrayList<BSTNode>();
		for (int value:inputList){
			BSTNode n = new BSTNode();
			n.setValue(value);
			BSTNodeListForInput.add(n);
		}
		return BSTNodeListForInput;
	}
	
	private void setRootAndPopulateTheTree(List<BSTNode> inputBSTNodes){
		setRoot(inputBSTNodes.get(0));
		populateTheTree(getRoot(),inputBSTNodes.subList(1, inputBSTNodes.size()));
	}
	
	private void populateTheTree(BSTNode root,List<BSTNode> inputBSTNodes){
		for (BSTNode n: inputBSTNodes){
			insertBSTNode(root,n);
		}
	}
	
	public void insertBSTNode(BSTNode<Integer> root,BSTNode<Integer> n){
		incrementNumberOfNodes();
		if (n.getValue() < root.getValue()){
			 if (root.getLeftChild() == null){
				 root.setLeftChild(n);
				 n.setParent(root);
			 }
			 else{
				 insertBSTNode(root.getLeftChild(), n);
			 }
		}
		else if (n.getValue() > root.getValue()){
			if (root.getRightChild() == null){
				root.setRightChild(n);
				n.setParent(root);
			}
			else{
				insertBSTNode(root.getRightChild(), n);
			}
		}
	}
	
	private void incrementNumberOfNodes(){
		noOfBSTNodes += 1;
	}
	
	public BSTNode successorOf(BSTNode n) {
		BSTNode BSTNodeInTree = getReferenceToElement(root, n);

		if (BSTNodeInTree != null) {

			if (BSTNodeInTree.getRightChild() != null) {
				return minOfTreeRootedAt(BSTNodeInTree.getRightChild());
			}

			if (BSTNodeIsLeftChildOfParent(BSTNodeInTree)) {
				return BSTNodeInTree.getParent();
			}

			if (BSTNodeIsRightChildOfParent(BSTNodeInTree)) {
				return successorIfParentIsItsParentsLeftChild(BSTNodeInTree);
			}

		}
		return null;
	}
	
	public BSTNode minOfTreeRootedAt(BSTNode n){
		BSTNode leftChildOfN = n.getLeftChild();
		if (leftChildOfN == null){
			return n;
		}
		return minOfTreeRootedAt(leftChildOfN);
	}
	
	public void deleteBSTNode(BSTNode<Integer> n){
		GenericTreeNode<BSTNode<Integer>> BSTNodeInTree = getReferenceToElement(root, n);
		
	}
	
	private boolean BSTNodeIsLeftChildOfParent(BSTNode n){
		boolean isLeftChild = false;
		BSTNode parent = n.getParent();
		if (parent != null && parent.getLeftChild() == n){
			isLeftChild = true;
		}
		return isLeftChild;
	}
	
	private boolean BSTNodeIsRightChildOfParent(BSTNode n){
		boolean isRightChild = false;
		BSTNode parent = n.getParent();
		if (parent != null && parent.getRightChild() == n){
			isRightChild = true;
		}
		return isRightChild;
	}
	
	private BSTNode successorIfParentIsItsParentsLeftChild(BSTNode n){
		BSTNode parent = n.getParent();
		if (parent == null){
			return null;
		}
		BSTNode parentsParent = parent.getParent();
		if (parentsParent == null){
			return null;
		}
		while (parentsParent.getLeftChild() != parent){
				parent = parentsParent;
				parentsParent = parent.getParent();
		}
		return parentsParent;
	} 
	
	public BSTNode<Integer> getReferenceToElement(BSTNode<Integer> root,BSTNode<Integer> n){
		BSTNode<Integer> n1 = null;
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
	
	private List<Integer> toInteger(List<BSTNode<Integer>> sortedList){
		List<Integer> integerList = new ArrayList<Integer>();
		for(BSTNode<Integer> n: sortedList){
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
	
	public void performInOrderTreeWalk(BSTNode root){
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
