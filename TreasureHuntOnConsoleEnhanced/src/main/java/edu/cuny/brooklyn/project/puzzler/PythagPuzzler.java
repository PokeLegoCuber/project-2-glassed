package edu.cuny.brooklyn.project.puzzler;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PythagPuzzler extends MathPuzzler{
	private final static Logger LOGGER = LoggerFactory.getLogger(PythagPuzzler.class);
	
	private double answerValue;
	
	private Random rng;
	
	public PythagPuzzler() {
		
		rng = new Random();
		double a = 1 + rng.nextInt(10);
		double b = 1 + rng.nextInt(10);
		if (a <= 0) {
			LOGGER.warn("a = " + a + ", but expecting a number > 0. Use 2 instead ");
		}
		if (b <= 2) {
			LOGGER.warn("b = " + b + ", but expecting a number > 1. Use 2 instead ");			
		}
		String message;
		message = "Sqrt(" + a + "^2 + "+ b + "^2) = ?";
		message += " (Please answer to the nearest whole number)";
		answerValue = ((Math.pow(a,2) + Math.pow(b,2)));
		answerValue = Math.sqrt(answerValue);
		answerValue = (int)answerValue;//Converts to int but still retains the x.0 formatting
		String answer = Double.toString(answerValue);
		setMessage(message);
		setAnswer(answer);
	}
	

	public boolean isCorrect(String enteredAnswer) {
		double entered = Double.parseDouble(enteredAnswer);
		double expected = answerValue;
		if (entered == expected)
		{
			LOGGER.debug("Correct answer");
			return true;
		}
		else 
		{
			LOGGER.debug("Incorrect answer");
			return false;
		}
	}

}
