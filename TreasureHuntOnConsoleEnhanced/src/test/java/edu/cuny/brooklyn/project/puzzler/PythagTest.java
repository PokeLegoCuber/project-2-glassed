package edu.cuny.brooklyn.project.puzzler;

import static org.junit.Assert.*;

import org.junit.Test;

public class PythagTest {

	@Test
	public void test() {
		PythagPuzzler pP = new PythagPuzzler();
		assertFalse(pP.isCorrect("0"));
//There is no way the hypotenuse can be 0, 
		//because the class uses random can't be sure, 
		//but as long as it does not equal to 0 the class is good
	}

}
