package com.dperez.doodlebugsim.creatures;
import java.util.Random;

import com.dperez.doodlebugsim.Simulation;
import com.dperez.doodlebugsim.World;

public class Ant extends Organism {
	public Ant() {
		super();
	}
	public Ant(World world, int X, int Y) {
		super(world, X, Y);
	}
	public void move() {
		int oldX = X;
		int oldY = Y;
		Random randomGenerator = new Random();
		int movement = randomGenerator.nextInt(4);
		if (movement <= 0) {
			if (Y == 19) {
				return;
			}
			if (Y + 1 < 20) {
				Y++;
			}
			if (world.getCoordinates(X, Y) == null || (world.getCoordinates(X, Y).getType() != Simulation.DOODLEBUG
					&& world.getCoordinates(X, Y).getType() != Simulation.ANT)) {
				world.setCoordinates(X, Y, (this));
				world.setCoordinates(X, oldY, null);
				breedSteps++;
			}
			else {
				Y--;
			}
		}
		else if (movement <= 1) {
			if (Y == 0) {
				return;
			}
			if (Y - 1 >= 0) {
				Y--;
			}
			if (world.getCoordinates(X, Y) == null || (world.getCoordinates(X, Y).getType() != Simulation.DOODLEBUG
					&& world.getCoordinates(X, Y).getType() != Simulation.ANT)) {
				world.setCoordinates(X, Y, (this));
				world.setCoordinates(X, oldY, null);
				breedSteps++;
			}
			else {
				Y++;
			}
		}
		else if (movement <= 2) {
			if (X == 19) {
				return;
			}
			if (X + 1 < 20) {
				X++;
			}
			if (world.getCoordinates(X, Y) == null || (world.getCoordinates(X, Y).getType() != Simulation.DOODLEBUG
					&& world.getCoordinates(X, Y).getType() != Simulation.ANT)) {
				world.setCoordinates(X, Y, (this));
				world.setCoordinates(oldX, Y, null);
				breedSteps++;
			}
			else {
				X--;
			}
		}
		else if (movement <= 4) {
			if (X == 0) {
				return;
			}
			if (X - 1 >= 0) {
				X--;
			}
			if (world.getCoordinates(X, Y) == null || (world.getCoordinates(X, Y).getType() != Simulation.DOODLEBUG
					&& world.getCoordinates(X, Y).getType() != Simulation.ANT)) {
				world.setCoordinates(X, Y, (this));
				world.setCoordinates(oldX, Y, null);
				breedSteps++;
			}
			else {
				X++;
			}
		}
	}
	public void breed() {
		if ((this).breedSteps == Simulation.ANTBREED) {
			breedSteps = 0;
			Random randomGenerator = new Random();
			int offspring = randomGenerator.nextInt(4);
			if (offspring <= 0) {
				if (Y == 19) {
					return;
				}
				Y++;
				int newY = Y;
				Y--;
				if (world.getCoordinates(X, newY) == null) {
					new Ant((this).world, X, newY);
					breedSteps = 0;
				}
			}
			else if (offspring <= 1) {
				if (Y == 0) {
					return;
				}
				Y--;
				int newY = Y;
				Y++;
				if (world.getCoordinates(X, newY) == null) {
					new Ant((this).world, X, newY);
					breedSteps = 0;
				}
			}
			else if (offspring <= 2) {
				if (X == 19) {
					return;
				}
				X++;
				int newX = X;
				X--;
				if (world.getCoordinates(newX, Y) == null) {
					new Ant((this).world, newX, Y);
					breedSteps = 0;
				}
			}
			else if (offspring <= 4) {
				if (X == 0) {
					return;
				}
				X--;
				int newX = X;
				X++;
				if (world.getCoordinates(newX, Y) == null) {
					new Ant((this).world, newX, Y);
					breedSteps = 0;
				}
			}
		}
	}
	public boolean starve() {
		return false;
	}
	public int getType() {
		return 2;
	}
}