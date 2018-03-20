package edu.cuny.brooklyn.project.treasure;

import static org.junit.Assert.*;
import org.junit.Test;

public class RectangleTreasureTest {

	@Test
	public void RectangleTest() {
		int size = 10;
		boolean [] ifFit = new boolean [size];
		RectangleTreasure rT = new RectangleTreasure(size);
		for(int i = 0; i < size; i++) {
			ifFit[i] = rT.isTreasureCell(i, i);
		}
		boolean [] itFits = new boolean [size];
		for(int j = 0; j < size; j++) {
			itFits[j] = true; 
		}
		assertArrayEquals(itFits,ifFit);
	}

	@Test
	public void RectangleTest2() {
		int size = 100;
		boolean [] ifFit = new boolean [size + 1];
		RectangleTreasure rT = new RectangleTreasure(size);
		for(int i = 0; i <= size; i++) {
			ifFit[i] = rT.isTreasureCell(i, i);
		}
		
		boolean [] itFits = new boolean [size + 1];
		for(int j = 0; j < size; j++) {
			itFits[j] = true; 
		}
		itFits[size] = false;
		assertArrayEquals(itFits,ifFit);
	}

}
