package edu.cuny.brooklyn.project.treasure;

import edu.cuny.brooklyn.project.GameSettings;
import java.util.Random;

public class TreasureGenerator {
	public Treasure generate() {
		Random rand = new Random();
		int randnum = rand.nextInt(2);		
		switch(randnum) {
		case 0:
			return new SquareTreasure(GameSettings.DEFAULT_TREASURE_SIZE);
		case 1:
			return new RectangleTreasure(GameSettings.DEFAULT_TREASURE_SIZE);
		default:
			return new SquareTreasure(GameSettings.DEFAULT_TREASURE_SIZE);
		}
	}
}
