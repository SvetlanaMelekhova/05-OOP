package by.htp.task07.text;

import java.util.ArrayList;
import java.util.List;


public class Text {
	
	private List <Sentence> sentences;
	private String title;
	
	public Text () {
		
		sentences = new ArrayList <Sentence>();
		
	}
	
	public Text (String title) {
		
		this.title = title;
		sentences = new ArrayList <Sentence>();
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Sentence> getSentenses() {
		return sentences;
	}

	public void setSentenses(List<Sentence> sentences) {
		this.sentences = sentences;
	}
	
	public void addSentence (Sentence sentence) {
		
		sentences.add(sentence);
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sentences == null) ? 0 : sentences.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Text other = (Text) obj;
		if (sentences == null) {
			if (other.sentences != null)
				return false;
		} else if (!sentences.equals(other.sentences))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Text [sentences=" + sentences + ", title=" + title + "]";
	}
	
	
	
	

}
