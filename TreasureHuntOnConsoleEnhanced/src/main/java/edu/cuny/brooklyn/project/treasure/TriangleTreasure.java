package edu.cuny.brooklyn.project.treasure;

import edu.cuny.brooklyn.project.GameSettings;

public class TriangleTreasure extends Treasure {
	private int[][] treasure;
	private int size;
	
	public TriangleTreasure(int size, TreasureValueSetter setter) {
		this.size = size;
		treasure = new int[size][size];
		
		for (int i=0; i<treasure.length; i++) {
			for (int j=0; j<treasure[i].length; j++) {
				int cellValue = setter.getCellValue(i,j);
				treasure[i][j] = cellValue;
				setTotalValue(getTotalValue() + cellValue);
			}
		}		
	}
	
	public TriangleTreasure(int size) {//this needs to be fixed
		this(size, (x,y) -> GameSettings.DEFAULT_TREASURE_VALUE);/*{if 
		});*/
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
