package edu.cuny.brooklyn.project.puzzler;

import java.util.Random;

public class PuzzlerSettings {
	public final static int UNSUPPORTED_PUZZLER = -1;
	public final static int MATH_PUZZLER = 100;
	public final static int MATH_PUZZLER_SQRT = 101;
	public final static int MATH_PUZZLER_PY = 102;
	public final static int MATH_PUZZLER_FACT = 103;
	private static int[] puzzlerTypes = {
			MATH_PUZZLER_SQRT,
			MATH_PUZZLER_PY,
			MATH_PUZZLER_FACT
	};
	
	private static Random rng = new Random();
	
	public static int getRandomPuzzlerType() {
		int typeIndex = rng.nextInt(puzzlerTypes.length);
		return puzzlerTypes[typeIndex]; 
	}
}
