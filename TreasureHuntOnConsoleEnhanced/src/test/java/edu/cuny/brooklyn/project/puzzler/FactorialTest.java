package edu.cuny.brooklyn.project.puzzler;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void FactTest() {
		int min = 1;
		int max = 5;
		boolean isCor = false;
		FactPuzzler fP = new FactPuzzler(min,max);
		String [] correctAnswers = {"1", "2", "6", "24","120","720"};
		for(int i = 0; i<correctAnswers.length;i++) {
		if(fP.isCorrect(correctAnswers[i])) {
			isCor = true;
		}
		}
		assertTrue(isCor);
	}
}
