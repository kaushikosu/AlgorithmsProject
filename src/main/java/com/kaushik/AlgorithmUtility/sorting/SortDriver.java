package com.kaushik.AlgorithmUtility.sorting;

import java.util.List;
import java.util.Arrays;

public class SortDriver {

	public static void main(String[] args){
		
		List<Integer> inputList = Arrays.asList(6,5,3,1,8,7,2,4,9);
		System.out.println(new Sorts().mergeSort(inputList));
	}
}
