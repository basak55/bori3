package com.bori.service;

public class calculateAccuracyService {
	
	public double calculateAccuracy(String sentence, String inputText) {
		int length = sentence.length();
		int matchingChars = 0;
		
		for (int i = 0; i<length; i++) {
			if (Character.toLowerCase(sentence.charAt(i)) == Character.toLowerCase(inputText.charAt(i))) {
				matchingChars++;
			}
		}
		return (double) matchingChars / length *100;
	}

}
