package by.htp.task07.text;


public class Main {
	
	public static void main (String [] args) {
	
	Word word1 = new Word ("Mother");
	Word word2 = new Word ("father");
	Word word3 = new Word ("and");
	
	Punctuation punct = Punctuation.DOT;
	Punctuation punct1 = Punctuation.COMMA;
	
	//System.out.println(punct.getMark()) ;
	System.out.println(punct1.content()) ;
	
	
	
	}
}
