import java.util.Scanner;

/*Write a program to count number of words in a sentence, and the number of sentences.

Where if the input is The dog wags his tail. I think he is happy.

The output should be: 10 words. 2 sentences.*/
public class Question_03 {
public static void main(String[] args) {
	
//	     Scanner sc=new Scanner(System.in);
	      String input = "The dog wags his tail. I think he is happy.";
	        int wordCount = countWords(input);
	        int sentenceCount = countSentences(input);

	        System.out.println(input);
	        System.out.println(wordCount + " words. " + sentenceCount + " sentences.");
	    }

	   
	    static int countWords(String input) {
	        String[] words = input.split("\\s+");
	        return words.length;
	    }
	    static int countSentences(String input) {
	        String[] sentences = input.split("[.!?]");
	        return sentences.length;
	    }
	}


