package com.dperez.doodlebugsim;
import java.util.Random;
import java.util.Scanner;

import com.dperez.doodlebugsim.creatures.Ant;
import com.dperez.doodlebugsim.creatures.Doodlebug;

public class Simulation {
	public static final int DOODLEBUG = 1;
	public static final int ANT = 2;
	public static final int ANTBREED = 3;
	public static final int DOODLEBREED = 8;
	public static final int DOODLESTARVE = 3;
	
	public static void main(String[] args) {
	
		World farm = new World();
		Random randomGenerator = new Random();
		Scanner scanner = new Scanner(System.in);
		String s = "";
		//Create world for the first time
		for (int i = 0; i < 100; i++) {
			int X = randomGenerator.nextInt(20);
			int Y = randomGenerator.nextInt(20);
			if (farm.getCoordinates(X, Y) == null) {
				new Ant(farm, X, Y);
			}
			else {
				i--;
			}
		}
		for (int i = 0; i < 5; i++) {
			int X = randomGenerator.nextInt(20);
			int Y = randomGenerator.nextInt(20);
			if (farm.getCoordinates(X, Y) == null) {
				new Doodlebug(farm, X, Y);
			}
			else {
				i--;
			}
		}
		while (s.length() == 0) {
			farm.display();
			farm.moveAorD();
			System.out.println();
			System.out.println("Hit enter for another step, or type 'Q' to quit the Simulation: ");
			s = scanner.nextLine();
		}
		
		scanner.close();
		return;
	}	
}