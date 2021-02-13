public class GameManager{
	public static void main(String [] args){
		RoundOfPlay round = new RoundOfPlay();
		// #todo:   Make some some player
		//			create a game
		//			we need to write method to interact the players with the game
	}
}

class RoundOfPlay{
	// manage the interaction between the player and the game:
	public void PlayGame(){
		Player[] players = new Player[10];

		for (int i = 1 ; i<11 ; i++ ){
			new Player(i);
		}
	}
}

class Player{
	public Player(int aPlayerID){
		playerID = aPlayerID;
	}
	// 2 things we can have in a class are:
	// 1. Data Attributes
	// 2. Methods
	// 2 KINDS of data we can have in a Java Program:
	// primitive: string  int 
	// object references
	int playerID;
}

class Game{

}
