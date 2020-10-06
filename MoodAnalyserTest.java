package com.capgemini.moodAnalyser1;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	@Test
	public void givenMessage_ShouldReturn_Sad() {
		MoodAnalyser moodAnalyser =new MoodAnalyser();
		String mood =moodAnalyser.analyseMood("I am in Sad mood");
		Assert.assertEquals("SAD",mood);
	}
	@Test
	public void givenMessage_ShouldReturn_Happy() {
		MoodAnalyser moodAnalyser =new MoodAnalyser();
		String mood =moodAnalyser.analyseMood("I am in any mood");
		Assert.assertNotEquals("Happy",mood);
	}

}
