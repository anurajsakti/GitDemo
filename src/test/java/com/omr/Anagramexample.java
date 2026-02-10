package com.omr;

import java.util.Arrays;

public class Anagramexample {
public static boolean isAnagram(String str1 , String str2) {
	//convert to lowercase to handle case insensititvity
	str1 = str1.toLowerCase();
	str2 = str2.toLowerCase();
	
	//if the length are different, they cannot be anagram//
	
	if (str1.length()!=str2.length()) {
		return false;
	}
	//convert to chararray and sort//
	
	char[] cs1 = str1.toCharArray();
	char[] cs2 = str2.toCharArray();
	Arrays.sort(cs1);
	Arrays.sort(cs2);
	//Compare sorted arrays
	return Arrays.equals(cs1, cs2);
}
public static void main(String[] args) {
	String word1 = "mug";
	String word2 = "gum";
	if (isAnagram(word1, word2)) {
	System.out.println(word1 + " and " + word2 + " are anagrams" );	
	
	}else {
		System.out.println(word1 + " and " + word2 + " NOT are anagrams" );		
	}
}
}

