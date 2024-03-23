import java.util.Random;
import java.util.Scanner;

public class MoreMethods {
	private static final int WINNING_SCORE = 3;
    private static int playerPoints = 0;
    private static int computerPoints = 0;
    
	public static void main(String[] args) {
		
		moreMethods gO2 = new moreMethods();
        while(true) {
       gO2.playGame();
        }
	
	}
	public void playGame() {
		 moreMethods gameObj= new moreMethods();
		 
	    while(playerPoints<WINNING_SCORE && computerPoints<WINNING_SCORE) {
	       String playerMove = gameObj.getUserMove();
	       String computerMove = gameObj.getComputerMove();
	       gameObj.checkResult(playerMove, computerMove);
	       gameObj.displayPoints();
	    gameObj.displayWinner();
	    break;
	    }
	    }

	public String getUserMove(){
	      Scanner scanner = new Scanner(System.in);
	     
	      String playerMove;
	      while(true) {
	        System.out.println("Please enter your move (r, p, or s)");
	        playerMove = scanner.nextLine();
	        if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
	          break;
	        }
	        System.out.println(playerMove + " is not a valid move.");
	      }
	      return playerMove;
	    }
	
	  public String getComputerMove(){
	        String computerMove;
	        while(true){
	      String[] rps = {"r", "p", "s"};
	       computerMove = rps[new Random().nextInt(rps.length)];
	      System.out.println("Computer played: " + computerMove);
	     
	        return computerMove;
	    }
	  }
	  
	    public void checkResult(String playerMove, String computerMove) {
	    	   
	    	if (playerMove.equals(computerMove)) {
	    	            System.out.println("The game was a tie!");
	    	          }

	    	          else if (playerMove.equals("r")) {
	    	            if (computerMove.equals("p")) {
	    	              System.out.println("Computer win!" );
	    	              computerPoints++;
	    	            } else if (computerMove.equals("s")) {
	    	              System.out.println("PLayer win!" );
	    	              playerPoints++;
	    	            }
	    	          }

	    	          else if (playerMove.equals("p")) {
	    	            if (computerMove.equals("r")) {
	    	              System.out.println("PLayer win!"  );
	    	              playerPoints++;
	    	            } else if (computerMove.equals("s")) {
	    	              System.out.println("Computer win!" );
	    	              computerPoints++;
	    	            }
	    	          }

	    	          else if (playerMove.equals("s")) {
	    	            if (computerMove.equals("p")) {
	    	              System.out.println("PLayer win!" );
	    	              playerPoints++;
	    	            } else if (computerMove.equals("r")) {
	    	              System.out.println("Computer win!");
	    	              playerPoints++;
	    	            }
	    	          }
	    	    }
	    
	    public void displayPoints(){
	        System.out.println("Player has " + playerPoints + " points");
	             System.out.println("Computer has " + computerPoints + " points");
	        }
	    
	    public void displayWinner() {
	    	
	        if (playerPoints == WINNING_SCORE) {
	                System.out.println("Player wins the game!");
	                
	            } else {
	                System.out.println("Computer wins the game!");
	                
	            }
	        
	    }
}
