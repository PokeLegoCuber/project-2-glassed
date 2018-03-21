package edu.cuny.brooklyn.project.treasure;

import edu.cuny.brooklyn.project.GameSettings;

public class CircleTreasure extends Treasure {
	private int[][] treasure;
	private int size;
	
	public CircleTreasure(int size, TreasureValueSetter setter) {
		this.size = size;
		treasure = new int[size][size];
		
		for (int i=0; i<treasure.length; i++) {
			for (int j=0; j<treasure[i].length; j++) {
				int cellValue;
				if(inCircle(i, j))
					cellValue = setter.getCellValue();
				else
					cellValue = GameSettings.EMPTY_TREASURE_VALUE;
				treasure[i][j] = cellValue;
				setTotalValue(getTotalValue() + cellValue);
			}
		}		
	}
	
	private boolean inCircle(int y, int x) {
		double r = (getBoundingBoxWidth() / 2) * 0.9;
		double yy = (y - r) * (y - r);
		double expectXR = Math.sqrt(r * r - yy) + r;
		double expectXL = -Math.sqrt(r * r - yy) + r;
		
		if(x >= expectXL && x <= expectXR)
			return true;
		else
			return false;
	}
	
	public CircleTreasure(int size) {
		this(size, () -> 3);
	}
	
	@Override
	public String getShapeName() {
		return "Circle";
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
