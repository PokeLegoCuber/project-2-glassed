package edu.cuny.brooklyn.project.treasure;

import edu.cuny.brooklyn.project.GameSettings;

public class RectangleTreasure extends Treasure {
	private int[][] treasure;
	private int size;
	
	public RectangleTreasure(int size, TreasureValueSetter setter) {
		this.size = size;
		treasure = new int[size][size];
		for (int i=0; i<treasure.length; i++) {
			for (int j=0; j<treasure[i].length; j++) {
				int cellValue = setter.getCellValue();
				treasure[i][j] = cellValue;
				setTotalValue(getTotalValue() + cellValue);
			}
		}		
	}
	
	public RectangleTreasure(int size) {
		this(size, () -> GameSettings.DEFAULT_TREASURE_VALUE);
	}

	@Override
	public int getValueAt(int x, int y) {
		return treasure[y][x];
	}

	@Override
	public int getBoundingBoxWidth() {
		return size;
	}

	@Override
	public int getBoundingBoxLength() {
		return size;
	}

	@Override
	public boolean isTreasureCell(int x, int y) {
		return treasure[y][x] > 0;
	}
	

}
