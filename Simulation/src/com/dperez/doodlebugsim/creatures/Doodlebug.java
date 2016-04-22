package com.dperez.doodlebugsim.creatures;
import java.util.Random;

import com.dperez.doodlebugsim.Simulation;
import com.dperez.doodlebugsim.World;

public class Doodlebug extends Organism {
	protected int starve;
	public Doodlebug() {
		super();
		starve = 0;
	}
	public Doodlebug(World world, int X, int Y) {
		super(world, X, Y);
		starve = 0;
	}
	public void move() {
		//Deal with starve somewhere here or ... not sure.
		int oldX = X;
		int oldY = Y;
		Random randomGenerator = new Random();
		int movement = randomGenerator.nextInt(4);
		if (X == 0 && Y == 0) {
			 if ((world.getCoordinates(X + 1, Y) != null) && (world.getCoordinates(X + 1, Y).getType() == Simulation.ANT)
					&& (world.getCoordinates(X + 1, Y).getType() != Simulation.DOODLEBUG)) {
				X++;
			}
			else if ((world.getCoordinates(X, Y + 1) != null) && (world.getCoordinates(X, Y + 1).getType() == Simulation.ANT)
					&& (world.getCoordinates(X, Y + 1).getType() != Simulation.DOODLEBUG)) {
				Y++;
			}
			else if (world.getCoordinates(X + 1, Y) == null) {
				X++;
			}
			else if (world.getCoordinates(X, Y + 1) == null) {
				Y++;
			}
		}
		else if (X == 0 && Y == 19) {
			if ((world.getCoordinates(X + 1, Y) != null) && (world.getCoordinates(X + 1, Y).getType() == Simulation.ANT)
					&& (world.getCoordinates(X + 1, Y).getType() != Simulation.DOODLEBUG)) {
				X++;
			}
			else if ((world.getCoordinates(X, Y - 1) != null) && (world.getCoordinates(X, Y - 1).getType() == Simulation.ANT)
					&& (world.getCoordinates(X, Y - 1).getType() != Simulation.DOODLEBUG)) {
				Y--;
			}
			else if (world.getCoordinates(X + 1, Y) == null) {
				X++;
			}
			else if (world.getCoordinates(X, Y - 1) == null) {
				Y--;
			}
		}
		else if (X == 19 && Y == 0) {
			if ((world.getCoordinates(X - 1, Y) != null) && (world.getCoordinates(X - 1, Y).getType() == Simulation.ANT)
					&& (world.getCoordinates(X - 1, Y).getType() != Simulation.DOODLEBUG)) {
				X--;
			}
			else if ((world.getCoordinates(X, Y + 1) != null) && (world.getCoordinates(X, Y + 1).getType() == Simulation.ANT)
					&& (world.getCoordinates(X, Y + 1).getType() != Simulation.DOODLEBUG)) {
				Y++;
			}
			else if (world.getCoordinates(X - 1, Y) == null) {
				X--;
			}
			else if (world.getCoordinates(X, Y + 1) == null) {
				Y++;
			}
		}
		else if (X == 19 && Y == 19) {
			if ((world.getCoordinates(X - 1, Y) != null) && (world.getCoordinates(X - 1, Y).getType() == Simulation.ANT)
					&& (world.getCoordinates(X - 1, Y).getType() != Simulation.DOODLEBUG)) {
				X--;
			}
			else if ((world.getCoordinates(X, Y - 1) != null) && (world.getCoordinates(X, Y - 1).getType() == Simulation.ANT)
					&& (world.getCoordinates(X, Y - 1).getType() != Simulation.DOODLEBUG)) {
				Y--;
			}
			else if (world.getCoordinates(X - 1, Y) == null) {
				X--;
			}
			else if (world.getCoordinates(X, Y - 1) == null) {
				Y--;
			}
		}
		else if (X == 0) {
			if ((world.getCoordinates(X + 1, Y) != null) && (world.getCoordinates(X + 1, Y).getType() == Simulation.ANT)
					&& (world.getCoordinates(X + 1, Y).getType() != Simulation.DOODLEBUG)) {
				X++;
			}
			else if ((world.getCoordinates(X, Y + 1) != null) && (world.getCoordinates(X, Y + 1).getType() == Simulation.ANT)
					&& (world.getCoordinates(X, Y + 1).getType() != Simulation.DOODLEBUG)) {
				Y++;
			}
			else if ((world.getCoordinates(X, Y - 1) != null) && (world.getCoordinates(X, Y - 1).getType() == Simulation.ANT)
					&& (world.getCoordinates(X, Y - 1).getType() != Simulation.DOODLEBUG)) {
				Y--;
			}
			else if (world.getCoordinates(X + 1, Y) == null) {
				X++;
			}
			else if (world.getCoordinates(X, Y + 1) == null) {
				Y++;
			}
			else if (world.getCoordinates(X, Y - 1) == null) {
				Y--;
			}
		}
		else if (X == 19) {
			if ((world.getCoordinates(X - 1, Y) != null) && (world.getCoordinates(X - 1, Y).getType() == Simulation.ANT)
					&& (world.getCoordinates(X - 1, Y).getType() != Simulation.DOODLEBUG)) {
				X--;
			}
			else if ((world.getCoordinates(X, Y + 1) != null) && (world.getCoordinates(X, Y + 1).getType() == Simulation.ANT)
					&& (world.getCoordinates(X, Y + 1).getType() != Simulation.DOODLEBUG)) {
				Y++;
			}
			else if ((world.getCoordinates(X, Y - 1) != null) && (world.getCoordinates(X, Y - 1).getType() == Simulation.ANT)
					&& (world.getCoordinates(X, Y - 1).getType() != Simulation.DOODLEBUG)) {
				Y--;
			}
			else if (world.getCoordinates(X - 1, Y) == null) {
				X--;
			}
			else if (world.getCoordinates(X, Y + 1) == null) {
				Y++;
			}
			else if (world.getCoordinates(X, Y - 1) == null) {
				Y--;
			}
		}
		else if (Y == 0) {
			if ((world.getCoordinates(X, Y + 1) != null) && (world.getCoordinates(X, Y + 1).getType() == Simulation.ANT)
					&& (world.getCoordinates(X, Y + 1).getType() != Simulation.DOODLEBUG)) {
				Y++;
			}
			else if ((world.getCoordinates(X - 1, Y) != null) && (world.getCoordinates(X - 1, Y).getType() == Simulation.ANT)
					&& (world.getCoordinates(X - 1, Y).getType() != Simulation.DOODLEBUG)) {
				X--;
			}
			else if ((world.getCoordinates(X + 1, Y) != null) && (world.getCoordinates(X + 1, Y).getType() == Simulation.ANT)
					&& (world.getCoordinates(X + 1, Y).getType() != Simulation.DOODLEBUG)) {
				X++;
			}
			else if (world.getCoordinates(X, Y + 1) == null) {
				Y++;
			}
			else if (world.getCoordinates(X - 1, Y) == null) {
				X--;
			}
			else if (world.getCoordinates(X + 1, Y) == null) {
				X++;
			}
		}
		else if (Y == 19) {
			if ((world.getCoordinates(X, Y - 1) != null) && (world.getCoordinates(X, Y - 1).getType() == Simulation.ANT)
					&& (world.getCoordinates(X, Y - 1).getType() != Simulation.DOODLEBUG)) {
				Y--;
			}
			else if ((world.getCoordinates(X - 1, Y) != null) && (world.getCoordinates(X - 1, Y).getType() == Simulation.ANT)
					&& (world.getCoordinates(X - 1, Y).getType() != Simulation.DOODLEBUG)) {
				X--;
			}
			else if ((world.getCoordinates(X + 1, Y) != null) && (world.getCoordinates(X + 1, Y).getType() == Simulation.ANT)
					&& (world.getCoordinates(X + 1, Y).getType() != Simulation.DOODLEBUG)) {
				X++;
			}
			else if (world.getCoordinates(X, Y - 1) == null) {
				Y--;
			}
			else if (world.getCoordinates(X - 1, Y) == null) {
				X--;
			}
			else if (world.getCoordinates(X + 1, Y) == null) {
				X++;
			}
		}
		else if ((world.getCoordinates(X + 1, Y) != null) && (world.getCoordinates(X + 1, Y).getType() == Simulation.ANT)
				&& (world.getCoordinates(X + 1, Y).getType() != Simulation.DOODLEBUG)) {
			X++;
		}
		else if ((world.getCoordinates(X - 1, Y) != null) && (world.getCoordinates(X - 1, Y).getType() == Simulation.ANT)
				&& (world.getCoordinates(X - 1, Y).getType() != Simulation.DOODLEBUG)) {
			X--;
		}
		else if ((world.getCoordinates(X, Y + 1) != null) && (world.getCoordinates(X, Y + 1).getType() == Simulation.ANT)
				&& (world.getCoordinates(X, Y + 1).getType() != Simulation.DOODLEBUG)) {
			Y++;
		}
		else if ((world.getCoordinates(X, Y - 1) != null) && (world.getCoordinates(X, Y - 1).getType() == Simulation.ANT)
				&& (world.getCoordinates(X, Y - 1).getType() != Simulation.DOODLEBUG)) {
			Y--;
		}
		else {
			if (movement <= 0) {
				if (world.getCoordinates(X + 1, Y) == null || world.getCoordinates(X + 1, Y).getType() != Simulation.DOODLEBUG) {
					X++;
				}
			}
			else if (movement <= 1) {
				if (world.getCoordinates(X - 1, Y) == null || world.getCoordinates(X - 1, Y).getType() != Simulation.DOODLEBUG) {
					X--;
				}
			}
			else if (movement <= 2) {
				if (world.getCoordinates(X, Y + 1) == null || world.getCoordinates(X, Y + 1).getType() != Simulation.DOODLEBUG) {
					Y++;
				}
			}
			else if (movement <= 3) {
				if (world.getCoordinates(X, Y - 1) == null || world.getCoordinates(X, Y - 1).getType() != Simulation.DOODLEBUG) {
					Y--;
				}
			}
			//if all else fails...
			else {
				starve++;
				return;
			}
			
		}
		if (world.getCoordinates(X, Y) != null && world.getCoordinates(X, Y).getType() == Simulation.ANT) {
			starve = 0;
			breedSteps++;
		}
		else {
			starve++;
			breedSteps++;
		}
		world.setCoordinates(X, Y, (this));
		world.setCoordinates(oldX, oldY, null);

	}
	
	public boolean starve() {
		if (starve == Simulation.DOODLESTARVE) {
			return true;
		}
		return false;
	}
	public void breed() {
		if ((this).breedSteps == Simulation.DOODLEBREED) {
			Random randomGenerator = new Random();
			int offspring = randomGenerator.nextInt(4);
			if (offspring <= 0) {
				if (Y == 19) {
					return;
				}
				Y++;
				int newY = Y;
				Y--;
				if (world.getCoordinates(X, newY) == null || (world.getCoordinates(X, newY).getType() == Simulation.ANT) 
						&& world.getCoordinates(X, newY).getType() != Simulation.DOODLEBUG) {
					new Doodlebug((this).world, X, newY);
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
				if (world.getCoordinates(X, newY) == null || (world.getCoordinates(X, newY).getType() == Simulation.ANT)
						&& world.getCoordinates(X, newY).getType() != Simulation.DOODLEBUG) {
					new Doodlebug((this).world, X, newY);
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
				if (world.getCoordinates(newX, Y) == null || (world.getCoordinates(newX, Y).getType() == Simulation.ANT)
						&& world.getCoordinates(newX, Y).getType() != Simulation.DOODLEBUG) {
					new Doodlebug((this).world, newX, Y);
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
				if (world.getCoordinates(newX, Y) == null || (world.getCoordinates(newX, Y).getType() == Simulation.ANT)
						&& world.getCoordinates(newX, Y).getType() != Simulation.DOODLEBUG) {
					new Doodlebug((this).world, newX, Y);
					breedSteps = 0;
				}
			}
		}
	}
	public int getType() {
		return 1;
	}
}