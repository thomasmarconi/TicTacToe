public class DumbComp extends Computer
{
  DumbComp(int playerNum){
    super(playerNum);
  }

  public void TakeTurn(TicTacToe Game)
  {
    if(canIWinHere(Game) > 0)
      System.out.println("Computer Player "+playerNumber+" moves to win.");
    else if(canILoseHere(Game) > 0)
      System.out.println("Computer Player "+playerNumber+" moves to prevent losing.");
    else if(canIGoMiddle(Game) == true)
    {
      System.out.println("Computer Player "+playerNumber+" chooses middle.");
    }
    else //make random move
    {
      int value = randomMove(Game);
      System.out.println("Computer Player "+playerNumber+" randomly chooses position "+value+".");
    }
  }

}
