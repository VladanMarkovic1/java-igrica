import java.util.Random;
import java.util.Scanner;

public class igricaV2 {

    
    public static void main(String[] args) {
        igricaV2 gameObj= new igricaV2();
        gameObj.getUserMove();
        gameObj.getComputerMove();
      gameObj.checkResult( );
        
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
      String[] rps = {"r", "p", "s"};
       computerMove = rps[new Random().nextInt(rps.length)];
      System.out.println("Computer played: " + computerMove);
      return computerMove;
    }
    public void checkResult(String playerMove, String computerMove) {
    	
    	int playerPoints=0;
    	int computerPoints=0;
    	
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
          System.out.println("Player has " + playerPoints + " points");
          System.out.println("Computer has " + computerPoints + " points");
        
      

    }

    
}