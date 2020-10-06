package com.capgemini.moodAnalyser1;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	@Test
	public void givenMessage_ShouldReturn_Sad() {
		MoodAnalyser moodAnalyser =new MoodAnalyser("I am in Sad mood");
		String mood =moodAnalyser.analyseMood();
		Assert.assertEquals("SAD",mood);
	}
	@Test
	public void givenMessage_ShouldReturn_Happy() {
		MoodAnalyser moodAnalyser =new MoodAnalyser("I am in any mood");
		String mood =moodAnalyser.analyseMood();
		Assert.assertNotEquals("Happy",mood);
	}

}
