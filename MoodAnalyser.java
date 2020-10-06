package com.capgemini.moodAnalyser1;

enum ExceptionCause{
	EMPTY,NULL;
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
				ExceptionCause causeOne = ExceptionCause.EMPTY;
				throw new MoodAnalyserException("Cannot have a message as " + causeOne);
			}
			return "HAPPY";
		}
		catch(NullPointerException e) {
			ExceptionCause causeTwo = ExceptionCause.NULL;
			throw new MoodAnalyserException("Cannot have a message as " + causeTwo);
		}
		
	}

}
