package com.capgemini.moodAnalyser1;

enum ExceptionCause{
	ENTERED_EMPTY,ENTERED_NULL;
}
public class MoodAnalyser {
	private String message;
	public MoodAnalyser(String message) {
		this.message=message;
	}
	public MoodAnalyser() {
		// TODO Auto-generated constructor stub
	}
	public String analyseMood() throws MoodAnalyserException {
		try {
			if(message.contains(("I am Sad"))) {
				return "SAD";
			}
			else if(message.isBlank()) {
				ExceptionCause first = ExceptionCause.ENTERED_EMPTY;
				throw new MoodAnalyserException("Cannot have a message as " + first);
			}
			return "HAPPY";
		}
		catch(NullPointerException e) {
			ExceptionCause second = ExceptionCause.ENTERED_NULL;
			throw new MoodAnalyserException("Cannot have a message as " + second);
		}
		
	}

}
