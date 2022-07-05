import java.util.Scanner;
public class Human extends Player{

  Human(int playerNum){
    super(playerNum);
  }

  public void TakeTurn(TicTacToe Game)
  {
    Scanner scan = new Scanner(System.in);
    boolean cont = true;
    while(cont){
      System.out.print("Player " + playerNumber + ", please enter a move? (1-9):");
      int position = scan.nextInt();
      if(position < 1 || position > 9)
        System.out.println("Invalid Choice");
      else if(updateGameBoard(Game,position) == false)
        System.out.println("Invalid Choice");
      else
      {
        updateGameBoard(Game,position);
        cont = false;
      }
    }
  }

}
