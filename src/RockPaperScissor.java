import java.util.Arrays;
import java.util.Scanner;

/*
 * Rock / Paper / Scissors

 * 1. User makes a choice

 * 2. Computer makes a random choice

 * 3. A compare function will determine who wins

 * About the game:

 * Paper > Rock

 * Rock > Scissors

 * Scissors > Paper

 * If User chooses Scissors and Computer chooses Rock, Computer wins.
 * If User chooses Paper and Computer chooses Rock, User wins.
 * If User chooses Paper and Computer chooses Scissors, Computer wins.
 * Its a draw if both Computer and User make same choice.
**/

public class RockPaperScissor{
	private char userInput;
	private int computerInput; //It's a random input
	
	public char getUserInput() {
		return userInput;
	}
	
	public void setuserInput( char input ) {
		this.userInput = input;
	}
	
	public int getCompInput(){
		return computerInput;
	}
	
	/* Below method sets a random number among 0,1,2 w.r.t P,S,R */
	public void setCompInput() {
		double randomNumber;
		randomNumber = Math.floor(Math.random()*3); // output is restricted to only 0, 1, 2
		this.computerInput = (int)randomNumber;
	}
	
	private boolean isValidUserInput(char userInput) {
		if( userInput == 'p' || userInput == 'r' || userInput == 's'){
			return true;
		}
		else {
			return false;
		}
	}
	
	public String findWinner(){
		String result;
		char userInput = this.getUserInput();
		int compInput = this.getCompInput();
		
		String combination = userInput + Integer.toString(compInput);
		int index = Arrays.asList( winningSet ).indexOf( combination );
		
		if( index == -1 ) {
			result = "tie";
		}
		return result;
	}
	
	public String translateUserInput(char userInput) {
		String outStr;
		switch( userInput ) {
		case 'p':
			outStr = "Paper";
			break;
		case 'r':
			outStr = "Rock";
			break;
		case 's':
			outStr = "Scissor";
			break;
		default:
			outStr = "";
		}
		return outStr;
	}
	
	public String translateCompInput(int compInput) {
		String outStr;
		switch( compInput ) {
		case 0:
			outStr = "Paper";
			break;
		case 1:
			outStr = "Rock";
			break;
		case 2:
			outStr = "Scissor";
			break;
		default:
			outStr = "";
		}
		return outStr;
	}
	
	public void printResult(String winner) {
		if( winner != null ) {
			if( winner.toLowerCase().compareTo("tie") == 0 ) {
				System.out.println("It's tie. You and computer both have selected " + translateUserInput(this.getUserInput()));
			}
			else if( winner.toLowerCase().compareTo("user") == 0 ) {
				System.out.println("You won the match. Your's " + translateUserInput(this.getUserInput()) + " beat computer's " + translateCompInput(this.getCompInput()));
			}
			else if( winner.toLowerCase().compareTo("comp") == 0 ) {
				System.out.println("Computer won the match. Your's " + translateUserInput(this.getUserInput()) + " lost to computer's " + translateCompInput(this.getCompInput()));
			}
		}
	}
	
	public static void main(String[] args){
		String continueFlag;
		do {
			char uInp;
			Scanner scanner = new Scanner(System.in);
			RockPaperScissor game = new RockPaperScissor();
			
			/* get and set User input here */
			do {
				System.out.print("Please enter your choice (R/P/S) :");
				uInp = Character.toLowerCase(scanner.next().charAt(0));
			}
			while( !game.isValidUserInput(uInp));
			game.setuserInput(uInp);
			
			/* Set Computer random input here */
			game.setCompInput();
			String winner = game.findWinner();
			game.printResult( winner );
			System.out.print("Enter any key to continue or Enter 'exit' to Exit:");
			continueFlag = scanner.next();
		}
		while( !continueFlag.equals("exit"));
	}
}