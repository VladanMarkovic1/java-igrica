import java.util.Random;
import java.util.Scanner;

public class igricaV2 {

    public static void main(String[] args) {
        igricaV2 gameObj= new igricaV2();
        gameObj.inputData();
       gameObj.checkResult("", "");
        
    }
    

    public void inputData(){
        
        String[] rps = {"r", "p", "s"};
      String computerMove = rps[new Random().nextInt(rps.length)];
      
      String playerMove;
     
      
      while(true) {
        System.out.println("Please enter your move (r, p, or s)");
        Scanner scanner = new Scanner(System.in);
        playerMove = scanner.nextLine();
        if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
          break;
        }
        System.out.println(playerMove + " is not a valid move.");
      }
      
      System.out.println("Computer played: " + computerMove);
    }
    public void checkResult(String playerMove, String computerMove){

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