import java.util.Random;
import java.util.Scanner;

public class igricaV1 {
  public static void main(String[] args) {  
    while(true){
    Scanner scanner = new Scanner(System.in);
    int playerPoints=0;
    int computerPoints=0;
    while (true) {
      String[] rps = {"r", "p", "s"};
      String computerMove = rps[new Random().nextInt(rps.length)];
      
      String playerMove;
     
      
      while(true) {
        System.out.println("Please enter your move (r, p, or s)");
        playerMove = scanner.nextLine();
        if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
          break;
        }
        System.out.println(playerMove + " is not a valid move.");
      }
      
      System.out.println("Computer played: " + computerMove);
      
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
            
            if(playerPoints==3) {
            	System.out.println("Player win the game");
            	break;
            }
            else if(computerPoints==3) {
            	System.out.println("Computer win the game");
            	break;
            }
          }
         
            
            System.out.println("Play again? (y/n)");
            String playagain=scanner.nextLine();
            if(!playagain.equals("y")) {

            	System.out.println("Thanks for playing");
            	break;
            
            }
          }
            
            
  
            }
          }
        