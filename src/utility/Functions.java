package utility;

public class Functions {
	
	public static int countTotalCharacters(String[] arrayContent)
	{
		int totalChar = 0;
		
		totalChar = arrayContent[0].length();
		
		return totalChar;
	}
	
	public static int countTotalVowels(String[] arrayContent)
	{
		String contentsOfArray = arrayContent[0].toString(); 
		String lowercaseArray = contentsOfArray.toLowerCase();
		char vowel[] = {'a','e','i','o','u'};
		int vowelCount = 0;
		
		for(int contentCounter = 0; contentCounter < contentsOfArray.length(); contentCounter++){
			for(int vowelContent = 0; vowelContent < vowel.length; vowelContent++){
				if(lowercaseArray.charAt(contentCounter) == vowel[vowelContent]){
					vowelCount++;
				}
			}
		}
		return vowelCount;
	}
	
	public static int countTotalConsonants(String[] arrayContent)
	{
		String contentsOfArray = arrayContent[0].toString();
		String lowercaseArray = contentsOfArray.toLowerCase();
		char consonant[] = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
		int consonantCount = 0;
		for(int contentCounter = 0; contentCounter < contentsOfArray.length(); contentCounter++){
			for(int consonantContent = 0; consonantContent < consonant.length; consonantContent++){
				if(lowercaseArray.charAt(contentCounter) == consonant[consonantContent]){
					consonantCount++;
				}
			
			}
		}
		return consonantCount;
	}
	
	public static int countTotalUppercase(String[] arrayContent)
	{
		int upperCaseCounter = 0;
		int arrayLength = arrayContent[0].length();
		char contentsOfArray[] = arrayContent[0].toCharArray();
		
		for(int counter = 0; counter < arrayLength; counter++){
			
			if(Character.isUpperCase(contentsOfArray[counter])){
				upperCaseCounter++;
			}
		}
		
		return upperCaseCounter;
	}
	
	public static int countTotalLowercase(String[] arrayContent)
	{
		int lowerCaseCounter = 0;
		int arrayLength = arrayContent[0].length();
		char contentsOfArray[] = arrayContent[0].toCharArray();
		
		for(int counter = 0; counter < arrayLength; counter++){
			
			if(Character.isLowerCase(contentsOfArray[counter])){
				lowerCaseCounter++;
			}
		}
		
		return lowerCaseCounter;
	}
	
	public static int countTotalInvisible(String[] arrayContent)
	{
		int invisibleCounter = 0;
		int arrayLength = arrayContent[0].length();
		char contentsOfArray[] = arrayContent[0].toCharArray();
		
		for(int counter = 0; counter < arrayLength; counter++){
			
			if(Character.isSpaceChar(contentsOfArray[counter])){
				invisibleCounter++;
			}
		}
		
		return invisibleCounter;
	}
	
	public static int countEmbeddedWord(String[] arrayContent, String searchWord)
	{
		int embeddedWordCounter = 0;
		String contentsOfArray = arrayContent[0].toString();
		int substringCounter1 = 0;
		int substringCounter2 = 2;
		
		if(substringCounter1 < contentsOfArray.length()){
			for(;substringCounter1 < contentsOfArray.length(); substringCounter1++){
				if(substringCounter2 > contentsOfArray.length()){
					break;
				}
				else{
					if(contentsOfArray.substring(substringCounter1, substringCounter2).equals(searchWord)){
						embeddedWordCounter++;
					}
					substringCounter2++;
				}
			}
		}
		
		return embeddedWordCounter;
	}
	
}
