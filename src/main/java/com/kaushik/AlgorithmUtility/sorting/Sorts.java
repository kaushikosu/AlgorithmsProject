package com.kaushik.algorithmutility.sorting;

import java.util.ArrayList;
import java.util.List;


public class Sorts {

	
	public ArrayList<Integer> quickSort(ArrayList<Integer> inputList){
		
		
		
		return null;
	}
	
	public List<Integer> mergeSort(List<Integer> inputList){
		
		int sizeOfInputList = inputList.size(); 
		
		if (sizeOfInputList == 1){
			return inputList;
		}
		else {
			List<Integer> part1;
			List<Integer> part2;
			List<Integer> sortedPart1;
			List<Integer> sortedPart2;
			part1 = inputList.subList(0, sizeOfInputList/2);
			part2 = inputList.subList(sizeOfInputList/2, sizeOfInputList);
			sortedPart1 = mergeSort(part1);
			sortedPart2 = mergeSort(part2);
			return merge(sortedPart1,sortedPart2);
		}
	}
	
	private List<Integer> merge(List<Integer> part1, List<Integer> part2){
		List<Integer> returnList = new ArrayList<Integer>();
			
		int minimum = part1.get(0);
		int i = 0;
		int j= 0;
		
		while (i < part1.size() || j < part2.size()){
				if(i == part1.size() & j!= part2.size()){
					returnList.addAll(part2.subList(j, part2.size()));
					return returnList;
				} 
				if (i != part1.size() & j == part2.size()){
					returnList.addAll(part1.subList(i, part1.size()));
					return returnList;
				}
				if (part2.get(j).intValue() <= part1.get(i).intValue()){
					minimum = part2.get(j);
					returnList.add(minimum);
					j++;
				}
				else {
					minimum = part1.get(i);
					returnList.add(minimum);
					i++;
				}
		}
		return returnList;
	}
	
}
