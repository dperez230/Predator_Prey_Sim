package com.dperez.doodlebugsim.creatures;
import com.dperez.doodlebugsim.World;

public abstract class Organism {
	protected int X;
	protected int Y;
	protected boolean moves;
	protected int breedSteps;
	protected World world;
	//No argument constructor, sets everything to a default value
	public Organism() {
		world = null;
		moves = false;
		breedSteps = 0;
		X = 0;
		Y = 0;
	}
	//Explicit value constructor, sets the world, and it's X and Y coordinate( positions in the grid)
	public Organism(World world, int X, int Y) {
		(this).world = world;
		(this).X = X;
		(this).Y = Y;
		breedSteps = 0;
		moves = false;
		world.setCoordinates(X, Y, (this));
	}
	
	public abstract void breed();
	public abstract void move();
	public abstract boolean starve();
	public abstract int getType();
	
	public boolean GetMoves() {
		return this.moves;
	}
	
	public void SetMoves(boolean moves) {
		this.moves = moves;
	}
}