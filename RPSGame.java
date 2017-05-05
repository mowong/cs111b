import java.util.Random;

public class RPSGame {
	//ENUM
	
	static enum Moves {
		ROCK, 
		PAPER, 
		SCISSORS;
	};
	
	//instantiate randomNum
	Random randomNum =  new Random();
	
	
	//Declare Instance Data Variables 
	private int numOfComputerWins;
	private int numOfUserWins;
	private int numOfTies;
	private boolean computerWin;
	private boolean userWin;


	private Moves computerMove;
	private Moves userMove;

	
	//Constructor
	public RPSGame(){
		numOfComputerWins=0;
		numOfUserWins=0;
		numOfTies=0;
	}
	//Getter and Setters
	//Getters
	public int getNumOfComputerWins(){
		return numOfComputerWins;
	}
	public int getNumOfUserWins(){
		return numOfUserWins;
	}
	public int getNumOfTies(){
		return numOfTies;
	}
	//Setters
	public void setNumOfComputerWins(int numOfComputerWins){
		this.numOfComputerWins=numOfComputerWins;
	}
	public void setNumOfUserWins(int numOfUserWins){
		this.numOfUserWins=numOfUserWins;
	}
	public void setNumOfTies(int numOfTies){
		this.numOfTies=numOfTies;
	}
	public void setUserMove(Moves userMove){
		this.userMove = userMove;
	}
	//toString Method
	public String toString(){
		String s = "Number Of Computer Wins:" + numOfComputerWins + "\nNumber Of User Wins:" + numOfUserWins +
				"Number of Ties:" + numOfTies;
		return s;
	}
	//Class Specific Methods
	
	//generateComputerPlay
	
	public Moves generateComputerPlay(){
		int randomNumber = randomNum.nextInt(3);

		if (randomNumber == 0) {
		computerMove = Moves.ROCK;
		}else if (randomNumber == 1) {
		computerMove = Moves.PAPER;
		}else{
		computerMove = Moves.SCISSORS;
		}
		return computerMove;
	}
	
	//findWinner
	
	public String findWinner(){
		computerWin = false;
		userWin = false;
		//need to pull in userMove
//		Moves userMove = null;
		if (computerMove == Moves.ROCK && userMove == Moves.SCISSORS){
			computerWin = true;
		} else if (computerMove == Moves.PAPER && userMove == Moves.ROCK){
			computerWin = true;
		} else if (computerMove == Moves.SCISSORS && userMove == Moves.PAPER){
			computerWin = true;
		} else if (userMove == Moves.ROCK && computerMove == Moves.SCISSORS){
			userWin = true;
		} else if (userMove == Moves.PAPER && computerMove == Moves.ROCK){
			userWin = true;
		} else if (userMove == Moves.SCISSORS && computerMove == Moves.PAPER){
			userWin = true;
		}
		
		String s = "";
		if (computerWin == true){
			numOfComputerWins+=1;
			s = "Computer";
		} else if (userWin == true){
			numOfUserWins+=1;
			s = "User";
		}else {
			numOfTies+=1;
			s = "Tie";
		}
		return s;
	}
}
