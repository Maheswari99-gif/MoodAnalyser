package com.capgemini.moodAnalyser1;

public class MoodAnalyser {
	private String message;

	public MoodAnalyser(String message) {
		this.message=message;
	}
	public MoodAnalyser() {
		// TODO Auto-generated constructor stub
	}

public String analyseMood() {
	try {
	if(message.contains(("Sad"))) 
		return "SAD";
	
	else 
		return "HAPPY";
	}catch(NullPointerException e) {
		return "Happy";
	}
	}

public static void main(String[] args) {
	
}
}
