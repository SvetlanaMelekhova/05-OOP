package by.htp.task07.text;

public enum Punctuation implements PartOfText {
	
	DOT("."),
	COMMA (","),
	QUESTIONMARK ("?"),
	EXCLAMATIONMARK ("!"),
	DASH ("-");
	
	private String mark;
	
	Punctuation (String mark) {
		this.mark = mark;
		
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	@Override
	public String content() {
		
		return mark.toString();
		
	}
	
	

}
