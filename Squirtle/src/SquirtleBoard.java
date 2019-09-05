public class SquirtleBoard extends Board {

	
	public SquirtleBoard() 
	{
		// Call the Board constructor to make an 8x4 Board
	 	super(4, 4);
	 	newGame(false);
	 	setTitle("PokemonCode Assignment 1");
	 	setInitialText("What will Squirtle do with Bulbasaur's flowers?");
	}
	

	
	@Override
	public void newGame(boolean repaint)
	{
		super.newGame(repaint);
		
		// Create a SquirtleThing at 0, 0
	 	SquirtleThing squirtle = new SquirtleThing();
	 	squirtle.setLocation(0, 0);
	 	add(squirtle);
	 	
	 	// Create a BulbasaurThing at 0, 4
	 	BulbasaurThing bulbasaur1 = new BulbasaurThing();
	 	bulbasaur1.setLocation(0, 0);
	 	add(bulbasaur1);
	 	
	 	// Create a BulbasaurThing at 0, 4
	 	BulbasaurThing bulbasaur2 = new BulbasaurThing();
	 	bulbasaur2.setLocation(1, 0);
	 	add(bulbasaur2);
	 	
	 	// Create a BulbasaurThing at 0, 4
	 	BulbasaurThing bulbasaur3 = new BulbasaurThing();
	 	bulbasaur3.setLocation(2, 0);
	 	add(bulbasaur3);
	 	
	 // Create a BulbasaurThing at 0, 4
	 	BulbasaurThing bulbasaur4 = new BulbasaurThing();
	  	bulbasaur4.setLocation(3, 0);
	 	add(bulbasaur4);
	}
} 
