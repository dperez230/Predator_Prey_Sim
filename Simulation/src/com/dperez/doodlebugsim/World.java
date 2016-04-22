package com.dperez.doodlebugsim;
import com.dperez.doodlebugsim.creatures.Organism;

public class World {
	//creates an array of arrays of a type organism and sets it equal to null
	private Organism[][] grid = null;
	public World() {
		//create a 20 X 20 grid of organisms
		grid = new Organism[20][20];
	}
	public Organism getCoordinates(int X, int Y) {
		if ((X >= 0) && (X < 20) && (X >= 0) && (X < 20)) {
			return grid[X][Y];
		}
		return null;
	}
	public void setCoordinates(int X, int Y, Organism AorD) {
		if ((X >= 0) && (X < 20) && (X >= 0) && (X < 20)) {
			grid[X][Y] = AorD;
		}
	}
	public void display() {
		for (int i = 0; i < 20; i++) {
			//System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
			System.out.print("|");
			for (int j = 0; j < 20; j ++) {
				if (grid[i][j] == null) {
					System.out.print(" |");
				}
				else if (grid[i][j].getType() == Simulation.DOODLEBUG) {
					System.out.print("X|");
				}
				else if (grid[i][j].getType() == Simulation.ANT) {
					System.out.print("o|");
				}
			}
			System.out.println();
		}
	}
	//resets moves for all cells;
	public void moveAorD() {
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
					if (grid[i][j] != null) {
						grid[i][j].SetMoves(false);
					}
			}
		}
		//if a cell is not null, or if there is an instance of a doodlebug in it, mark moves as true, and move the object in the cell.
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				if ((grid[i][j] != null) && (grid[i][j].getType() == Simulation.DOODLEBUG)) {
					if (! grid[i][j].GetMoves()) {
						grid[i][j].SetMoves(true); // Mark as moved
						grid[i][j].move();
					}
				}
			}
		}
		//If the cell is not empty, and there is a instance of an ant in it, mark moves as true and move the object in the cell.
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				if ((grid[i][j] != null) && (grid[i][j].getType() == Simulation.ANT)) {
					if (! grid[i][j].GetMoves()) {
						grid[i][j].SetMoves(true); // Mark as moved
						grid[i][j].move();
					}
				}
			}
		}
		//after everything has moved, and there is an instance of a doodlebug in a cell, check to see if it has starved, if it has, point to null.
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				if ((grid[i][j] != null) && (grid[i][j].getType() == Simulation.DOODLEBUG)) {
					if (grid[i][j].starve()) {
						grid[i][j] = null;
					}
				}
			}
		}
		//If the cell is not empty, and the object in the cell has moved, breed.
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				if ((grid[i][j] != null) && (grid[i][j].GetMoves())) {
					grid[i][j].breed();
				}
			}
		}
	}
}