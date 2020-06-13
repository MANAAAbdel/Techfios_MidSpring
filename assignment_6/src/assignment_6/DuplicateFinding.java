package assignment_6;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;



public class DuplicateFinding {

	public static void main(String[] args) {
		
		/// Ask The user for a sentence
		System.out.println("Please enter a sentence and we will find any duplicate characters :)");
		Scanner input = new Scanner (System.in);
		String sentence = input.nextLine();
		input.close();
		//Converting the sentence into array of characters 
		char[] sentenceArray =  sentence.toCharArray();
		
		// Creating a LinkedHashSet that will contain the duplicate characters
		Set <Character> duplicate = new LinkedHashSet<Character>();
		
		//Finding duplicates and adding them to Duplicate set
		for (int i=0; i<sentenceArray.length; i++) {
			for(int j=i+1; j<sentenceArray.length; j++) {
				if (sentenceArray[i]==sentenceArray[j]) 
					 duplicate.add(sentenceArray[i]);
			}
		}
		//Printing the set of duplicate
		System.out.println(duplicate);
	}

}
