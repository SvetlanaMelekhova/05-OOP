package by.htp.task07.text;

import java.util.ArrayList;
import java.util.List;

public class Sentence implements PartOfText {

	private List<PartOfText> sentence;

	public Sentence() {

		sentence = new ArrayList<PartOfText>();
	}

	public void addWord(Word word) {

		sentence.add(word);

	}

	public void addMark(Punctuation mark) {

		sentence.add(mark);
	}

	public String content() {
		String sentence = this.sentence.toString();
		return sentence;
	}

	public List<PartOfText> getSentence() {
		return sentence;
	}

	public void setSentence(List<PartOfText> sentence) {
		this.sentence = sentence;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sentence == null) ? 0 : sentence.hashCode());
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
		if (sentence == null) {
			if (other.sentence != null)
				return false;
		} else if (!sentence.equals(other.sentence))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sentence [sentence=" + sentence + "]";
	}

}
