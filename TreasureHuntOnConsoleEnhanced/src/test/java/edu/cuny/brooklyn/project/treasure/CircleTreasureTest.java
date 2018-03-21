package edu.cuny.brooklyn.project.treasure;

import static org.junit.Assert.*;
import org.junit.Test;

public class CircleTreasureTest {

	@Test
	public void CircleTest() {
		int size = 10;
		CircleTreasure cT1 = new CircleTreasure(size);
		CircleTreasure cT2 = new CircleTreasure(size);
		assertEquals(cT1.getValueAt(1, 1),cT2.getValueAt(1, 1));
	}
}
