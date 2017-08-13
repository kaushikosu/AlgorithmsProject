package com.kaushik.algorithmutility.stringmanipulation;

public class ReverseWords {
    public String reverseWords(String s) {
        if (s == null){
            return s;
        }
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(words[words.length-1]);
        for(int i = words.length-2; i >= 0; i--){
        	if (words[i].length() >= 1){
                sb.append(" ");
                sb.append(words[i]);
            }
        }
        return sb.toString();
    }
    
    public static void main (String[] args){
    	System.out.println(new ReverseWords().reverseWords(" 1"));
    }
}