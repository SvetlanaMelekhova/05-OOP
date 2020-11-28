package by.htp.task07.text;

import java.util.ArrayList;
import java.util.List;


public class Sentence implements PartOfText {
	
	private List <Word> words;
	
	public Sentence () {
		
		this.words = new ArrayList<Word>();
	}
	
	public void addWord (Word word) {
		
		words.add(word);
		
	}
	
	public void makeSentence () {
		System.out.print();
	}
	
	public List<Word> getWords() {
		return words;
	}
	
	public void setWords(List<Word> words) {
		this.words = words;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((words == null) ? 0 : words.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sentence other = (Sentence) obj;
		if (words == null) {
			if (other.words != null)
				return false;
		} else if (!words.equals(other.words))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sentence [words=" + words + "]";
	}

	@Override
	public String content() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
