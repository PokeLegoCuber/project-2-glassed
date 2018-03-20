package edu.cuny.brooklyn.project.puzzler;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FactPuzzler extends MathPuzzler {
	private final static Logger LOGGER = LoggerFactory.getLogger(FactPuzzler.class);
	
	private double answerValue;
	private Random rng;
	
	public FactPuzzler(int minNumber, int maxNumber) {
		rng = new Random();
		if (minNumber <= 0) {
			LOGGER.warn("minNumber = " + minNumber + ", but expecting a number > 0. Use 2 instead ");
		}
		if (maxNumber <= 2) {
			LOGGER.warn("maxNumber = " + maxNumber + ", but expecting a number > 1. Use 2 instead ");			
		}
		int num = minNumber + rng.nextInt(maxNumber - minNumber + 1);
		String message = "Factorial(" + num + ") = ?";
		answerValue = fact(num);
		String answer = Double.toString(answerValue);
		setMessage(message);
		setAnswer(answer);
	}
	

	public boolean isCorrect(String enteredAnswer) {
		return Integer.parseInt(enteredAnswer) == answerValue;
	}
	
	private double fact(int num) {
		return num <= 0 ? 1 : fact(num - 1) * num;
	}

}
