package controller;

import utility.Functions;

public class ArrayCharacterCount {

	public static void main(String[] args) {
		
		int totalCharacter;
		int totalVowel;
		int totalConsonant;
		int totalUpperCase;
		int totalLowerCase;
		int totalSpace;
		int totalEmbeddedWord;
		String searchWord = args[1].toString();
		
		
		if (args.length > 0) {
			
			System.out.println("Argument input: " + args[0]);
			
			totalCharacter = Functions.countTotalCharacters(args);
			totalVowel = Functions.countTotalVowels(args);
			totalConsonant = Functions.countTotalConsonants(args);
			totalUpperCase = Functions.countTotalUppercase(args);
			totalLowerCase = Functions.countTotalLowercase(args);
			totalSpace = Functions.countTotalInvisible(args);
			totalEmbeddedWord = Functions.countEmbeddedWord(args, searchWord);
			
			System.out.println("Total vowels: " + totalVowel);
			System.out.println("Total consonants: " + totalConsonant);
			System.out.println("Total UPPERCASE: " + totalUpperCase);
			System.out.println("Total lowercase: " + totalLowerCase);
			System.out.println("Total spaces: " + totalSpace);
			System.out.println("Total embedded word search for " +  searchWord + ": " + totalEmbeddedWord);
			System.out.println("TOTAL characters: " + totalCharacter);
			
			
		}
	}

}
