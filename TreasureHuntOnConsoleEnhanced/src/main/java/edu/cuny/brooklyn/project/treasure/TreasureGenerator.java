package edu.cuny.brooklyn.project.treasure;

import edu.cuny.brooklyn.project.GameSettings;
import java.util.Random;

public class TreasureGenerator {
	public Treasure generate() {
		Random rand = new Random();
		int randnum = rand.nextInt(4);
		Random rand = new Random();
		int  randsize = rand.nextInt(10) + 1;
		switch(randnum) {
		case 0:
			return new SquareTreasure(randsize);
		case 1:
			return new RectangleTreasure(randsize);
		case 2:
			return new CircleTreasure(randsize);
		case 3:
			return new TriangleTreasure(randsize);
		default:
			return new SquareTreasure(randsize);
		}
	}
}
