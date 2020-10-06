package com.capgemini.moodAnalyser1;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
			MoodAnalyser moodObj = new MoodAnalyser("I am in Sad Mood");
			String mood = null;
			try {
				mood = moodObj.analyseMood();
			} 
			catch (MoodAnalyserException e) {
				e.printStackTrace();
			} 
			Assert.assertNotEquals("SAD", mood);
		}
		

	@Test
	public void givenMessage_WhenOtherThanSad_ShouldReturnHappy() {
			MoodAnalyser moodObj = new MoodAnalyser("I am in Any Mood");
			String mood = null;
			try {
				mood = moodObj.analyseMood();
			}
			catch (MoodAnalyserException e) {
				e.printStackTrace();
		} 
			Assert.assertEquals("HAPPY", mood); 
		}


	
	@Test
	public void givenMessage_WhenNull_ShouldThrowMoodAnalysisException() {
		try {
			MoodAnalyser moodObj = new MoodAnalyser(null);
			moodObj.analyseMood();
		}
		catch(MoodAnalyserException e) {
			System.out.println(e.getMessage());
			Assert.assertNotEquals("You can't have the message as NULL", e.getMessage());
		}
	}
	
	@Test
	public void givenMessage_WhenEmpty_ShouldThrowMoodAnalysisException() {
		try {
			MoodAnalyser moodObj = new MoodAnalyser("");
			moodObj.analyseMood();
		}
		catch(MoodAnalyserException e) {
			System.out.println(e.getMessage());
			Assert.assertNotEquals("You can't have the message as EMPTY", e.getMessage());
		}
	}
}
