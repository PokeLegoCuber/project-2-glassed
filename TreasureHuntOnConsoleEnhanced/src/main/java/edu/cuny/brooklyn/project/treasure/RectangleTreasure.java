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
				int cellValue;
				if(i >= getBoundingBoxLength()/3 && i <= getBoundingBoxLength()*2/3)
					cellValue = setter.getCellValue();
				else
					cellValue = GameSettings.EMPTY_TREASURE_VALUE;
				treasure[i][j] = cellValue;
				setTotalValue(getTotalValue() + cellValue);
			}
		}		
	}
	
	public RectangleTreasure(int size) {
		this(size, () -> 2);
	}
	
	@Override
	public String getShapeName() {
		return "Rectangle";
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
		if (x < 0 || y < 0 || x >= size || y >= size) {
				// out of bound
			return false;
		} 
		else {
			return treasure[y][x] > 0;
		}
	}
}
