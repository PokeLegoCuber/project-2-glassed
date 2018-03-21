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
			if(rT.getValueAt(i,i) > 0)
				ifFit[i] = true;
			else
				ifFit[i] = false;
		}
		boolean [] itFits = new boolean [size];
		for(int j = 0; j < size; j++) {
			itFits[j] = rT.isTreasureCell(j, j); 
		}
		assertArrayEquals(itFits,ifFit);
	}
	
	@Test
	public void RectangleTest2() {
		int size = 100;
		boolean [] ifFit = new boolean [size];
		RectangleTreasure rT = new RectangleTreasure(size);
		for(int i = 0; i < size; i++) {
			if(rT.getValueAt(i,i) > 0)
				ifFit[i] = true;
			else
				ifFit[i] = false;
		}
		boolean [] itFits = new boolean [size];
		for(int j = 0; j < size; j++) {
			itFits[j] = rT.isTreasureCell(j, j); 
		}
		assertArrayEquals(itFits,ifFit);
	}

}
