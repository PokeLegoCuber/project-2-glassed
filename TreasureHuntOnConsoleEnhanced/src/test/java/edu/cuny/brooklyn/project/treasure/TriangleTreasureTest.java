package edu.cuny.brooklyn.project.treasure;

import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleTreasureTest {

	@Test
	public void CircleTest() {
		int size = 10;
		boolean [] ifFit = new boolean [size];
		TriangleTreasure tT = new TriangleTreasure(size);
		for(int i = 0; i < size; i++) {
			ifFit[i] = tT.isTreasureCell(i, i);
		}
		boolean [] itFits = new boolean [size];
		for(int j = 0; j < size; j++) {
			itFits[j] = true; 
		}
		assertArrayEquals(itFits,ifFit);
	}

	@Test
	public void TriangleTest2() {
		int size = 100;
		boolean [] ifFit = new boolean [size + 1];
		TriangleTreasure tT = new TriangleTreasure(size);
		for(int i = 0; i <= size; i++) {
			ifFit[i] = tT.isTreasureCell(i, i);
		}
		
		boolean [] itFits = new boolean [size + 1];
		for(int j = 0; j < size; j++) {
			itFits[j] = true; 
		}
		itFits[size] = false;
		assertArrayEquals(itFits,ifFit);
	}

}
