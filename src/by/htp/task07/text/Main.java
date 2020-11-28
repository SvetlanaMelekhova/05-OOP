package by.htp.task07.text;


public class Main {
	
	public static void main (String [] args) {
	
	Word word1 = new Word ("Mother");
	Word word2 = new Word ("father");
	Word word3 = new Word ("and");
	
	Punctuation punct = Punctuation.DOT;
	Punctuation punct1 = Punctuation.COMMA;
	
	//System.out.println(punct.getMark()) ;
	//System.out.println(punct1.content()) ;
	
	Sentence sentence1 = new Sentence();
	sentence1.addWord(word1);
	sentence1.addWord(word3);
	sentence1.addWord(word2);
	sentence1.addMark(punct);
	
	//System.out.println(sentence1.content());
	
	Sentence sentence2 = new Sentence ();
	sentence2.addWord(new Word ("Father"));
	sentence2.addWord(new Word ("and"));
	sentence2.addWord(new Word ("sister"));
	sentence2.addMark(punct);
	
	
	//System.out.println(sentence2.content());
	
	Text text = new Text("Family");
	
	text.addSentence(sentence1);
	text.addSentence(sentence2);
	
	System.out.println(text.content());
	
	
		
		
		
	}
	
}
