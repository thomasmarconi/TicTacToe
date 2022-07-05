import java.util.Random;
public abstract class Computer extends Player{

  Computer(int playerNum){
    super(playerNum);
  }

  public int canIWinHere(TicTacToe Game)
  {
    if(Game.gameBoard[0][0] == playerPiece && Game.gameBoard[0][1] == playerPiece && updateGameBoard(Game,3))
        return 3;
    else if(Game.gameBoard[0][1] == playerPiece && Game.gameBoard[0][2] == playerPiece && updateGameBoard(Game,1))
        return 1;
    else if(Game.gameBoard[0][0] == playerPiece && Game.gameBoard[0][2] == playerPiece && updateGameBoard(Game,2))
        return 2;
    else if(Game.gameBoard[1][0] == playerPiece && Game.gameBoard[1][1] == playerPiece && updateGameBoard(Game,6))
        return 6;
    else if(Game.gameBoard[1][1] == playerPiece && Game.gameBoard[1][2] == playerPiece && updateGameBoard(Game,4))
        return 4;
    else if(Game.gameBoard[1][0] == playerPiece && Game.gameBoard[1][2] == playerPiece && updateGameBoard(Game,5))
        return 5;
    else if(Game.gameBoard[2][0] == playerPiece && Game.gameBoard[2][1] == playerPiece && updateGameBoard(Game,9))
        return 9;
    else if(Game.gameBoard[2][1] == playerPiece && Game.gameBoard[2][2] == playerPiece && updateGameBoard(Game,7))
        return 7;
    else if(Game.gameBoard[2][0] == playerPiece && Game.gameBoard[2][2] == playerPiece && updateGameBoard(Game,8))
        return 8;
    else if(Game.gameBoard[0][0] == playerPiece && Game.gameBoard[1][0] == playerPiece && updateGameBoard(Game,7))
        return 7;
    else if(Game.gameBoard[1][0] == playerPiece && Game.gameBoard[2][0] == playerPiece && updateGameBoard(Game,1))
        return 1;
    else if(Game.gameBoard[0][0] == playerPiece && Game.gameBoard[2][0] == playerPiece && updateGameBoard(Game,4))
        return 4;
    else if(Game.gameBoard[0][1] == playerPiece && Game.gameBoard[1][1] == playerPiece && updateGameBoard(Game,8))
        return 8;
    else if(Game.gameBoard[1][1] == playerPiece && Game.gameBoard[2][1] == playerPiece && updateGameBoard(Game,2))
        return 2;
    else if(Game.gameBoard[0][1] == playerPiece && Game.gameBoard[2][1] == playerPiece && updateGameBoard(Game,5))
        return 5;
    else if(Game.gameBoard[0][2] == playerPiece && Game.gameBoard[1][2] == playerPiece && updateGameBoard(Game,9))
        return 9;
    else if(Game.gameBoard[1][2] == playerPiece && Game.gameBoard[2][2] == playerPiece && updateGameBoard(Game,3))
        return 3;
    else if(Game.gameBoard[0][2] == playerPiece && Game.gameBoard[2][2] == playerPiece && updateGameBoard(Game,6))
        return 6;
    else if(Game.gameBoard[0][0] == playerPiece && Game.gameBoard[1][1] == playerPiece && updateGameBoard(Game,9))
        return 9;
    else if(Game.gameBoard[1][1] == playerPiece && Game.gameBoard[2][2] == playerPiece && updateGameBoard(Game,1))
        return 1;
    else if(Game.gameBoard[0][0] == playerPiece && Game.gameBoard[2][2] == playerPiece && updateGameBoard(Game,5))
        return 5;
    else if(Game.gameBoard[0][2] == playerPiece && Game.gameBoard[1][1] == playerPiece && updateGameBoard(Game,7))
        return 7;
    else if(Game.gameBoard[1][1] == playerPiece && Game.gameBoard[2][0] == playerPiece && updateGameBoard(Game,3))
        return 3;
    else if(Game.gameBoard[0][2] == playerPiece && Game.gameBoard[2][0] == playerPiece && updateGameBoard(Game,5))
        return 5;
    else
      return 0;
  }

  public int canILoseHere(TicTacToe Game)
  {
    if(Game.gameBoard[0][0] == opponentPiece && Game.gameBoard[0][1] == opponentPiece && updateGameBoard(Game,3))
        return 3;
    else if(Game.gameBoard[0][1] == opponentPiece && Game.gameBoard[0][2] == opponentPiece && updateGameBoard(Game,1))
        return 1;
    else if(Game.gameBoard[0][0] == opponentPiece && Game.gameBoard[0][2] == opponentPiece && updateGameBoard(Game,2))
        return 2;
    else if(Game.gameBoard[1][0] == opponentPiece && Game.gameBoard[1][1] == opponentPiece && updateGameBoard(Game,6))
        return 6;
    else if(Game.gameBoard[1][1] == opponentPiece && Game.gameBoard[1][2] == opponentPiece && updateGameBoard(Game,4))
        return 4;
    else if(Game.gameBoard[1][0] == opponentPiece && Game.gameBoard[1][2] == opponentPiece && updateGameBoard(Game,5))
        return 5;
    else if(Game.gameBoard[2][0] == opponentPiece && Game.gameBoard[2][1] == opponentPiece && updateGameBoard(Game,9))
        return 9;
    else if(Game.gameBoard[2][1] == opponentPiece && Game.gameBoard[2][2] == opponentPiece && updateGameBoard(Game,7))
        return 7;
    else if(Game.gameBoard[2][0] == opponentPiece && Game.gameBoard[2][2] == opponentPiece && updateGameBoard(Game,8))
        return 8;
    else if(Game.gameBoard[0][0] == opponentPiece && Game.gameBoard[1][0] == opponentPiece && updateGameBoard(Game,7))
        return 7;
    else if(Game.gameBoard[1][0] == opponentPiece && Game.gameBoard[2][0] == opponentPiece && updateGameBoard(Game,1))
        return 1;
    else if(Game.gameBoard[0][0] == opponentPiece && Game.gameBoard[2][0] == opponentPiece && updateGameBoard(Game,4))
        return 4;
    else if(Game.gameBoard[0][1] == opponentPiece && Game.gameBoard[1][1] == opponentPiece && updateGameBoard(Game,8))
        return 8;
    else if(Game.gameBoard[1][1] == opponentPiece && Game.gameBoard[2][1] == opponentPiece && updateGameBoard(Game,2))
        return 2;
    else if(Game.gameBoard[0][1] == opponentPiece && Game.gameBoard[2][1] == opponentPiece && updateGameBoard(Game,5))
        return 5;
    else if(Game.gameBoard[0][2] == opponentPiece && Game.gameBoard[1][2] == opponentPiece && updateGameBoard(Game,9))
        return 9;
    else if(Game.gameBoard[1][2] == opponentPiece && Game.gameBoard[2][2] == opponentPiece && updateGameBoard(Game,3))
        return 3;
    else if(Game.gameBoard[0][2] == opponentPiece && Game.gameBoard[2][2] == opponentPiece && updateGameBoard(Game,6))
        return 6;
    else if(Game.gameBoard[0][0] == opponentPiece && Game.gameBoard[1][1] == opponentPiece && updateGameBoard(Game,9))
        return 9;
    else if(Game.gameBoard[1][1] == opponentPiece && Game.gameBoard[2][2] == opponentPiece && updateGameBoard(Game,1))
        return 1;
    else if(Game.gameBoard[0][0] == opponentPiece && Game.gameBoard[2][2] == opponentPiece && updateGameBoard(Game,5))
        return 5;
    else if(Game.gameBoard[0][2] == opponentPiece && Game.gameBoard[1][1] == opponentPiece && updateGameBoard(Game,7))
        return 7;
    else if(Game.gameBoard[1][1] == opponentPiece && Game.gameBoard[2][0] == opponentPiece && updateGameBoard(Game,3))
        return 3;
    else if(Game.gameBoard[0][2] == opponentPiece && Game.gameBoard[2][0] == opponentPiece && updateGameBoard(Game,5))
        return 5;
    else
      return 0;
  }

  public boolean canIGoMiddle(TicTacToe Game)
  {
    if(Game.gameBoard[1][1] == ' ')
    {
      updateGameBoard(Game,5);
      return true;
    }
    else
      return false;
  }

  public int randomMove(TicTacToe Game)
  {
    Random rand = new Random();
    int value = 0;
    while(!updateGameBoard(Game,value))
    {
      value = rand.nextInt(1,10);
    }
    return value;
  }

/*  public boolean canIFork(TicTacToe Game)
  {
    //corner forks
    if(Game.gameBoard[0][0] == playerPiece && Game.gameBoard[2][2] == playerPiece && Game.gameBoard[2][0] != ' ')
      updateGameBoard(Game,3);
    else if(Game.gameBoard[0][0] == playerPiece && Game.gameBoard[2][2] == playerPiece && Game.gameBoard[0][2] != ' ')
      updateGameBoard(Game,7);
    else if(Game.gameBoard[0][2] == playerPiece && Game.gameBoard[2][0] == playerPiece && Game.gameBoard[0][0] != ' ')
      updateGameBoard(Game,9);
    else if(Game.gameBoard[0][2] == playerPiece && Game.gameBoard[2][0] == playerPiece && Game.gameBoard[2][2] != ' ')
      updateGameBoard(Game,1);

    //side forks
    else if(Game.gameBoard[0][1] == playerPiece && Game.gameBoard[1][0] == playerPiece && Game.gameBoard[0][0] != ' ')
      updateGameBoard(Game,1);
    else if(Game.gameBoard[0][1] == playerPiece && Game.gameBoard[1][2] == playerPiece && Game.gameBoard[0][2] != ' ')
      updateGameBoard(Game,3);
    else if(Game.gameBoard[1][0] == playerPiece && Game.gameBoard[2][1] == playerPiece && Game.gameBoard[2][0] != ' ')
      updateGameBoard(Game,7);
    else if(Game.gameBoard[2][1] == playerPiece && Game.gameBoard[1][2] == playerPiece && Game.gameBoard[2][2] != ' ')
      updateGameBoard(Game,9);

    //triangle forks
    if(Game.gameBoard[0][0] == playerPiece && Game.gameBoard[1][0] == playerPiece && Game.gameBoard[0][0] != ' ')
      updateGameBoard(Game,1);

  }

  public boolean canIBlockFork(TicTacToe Game)
  {

  }

  public boolean opponentWentCorner(TicTacToe Game)
  {

  }

  public boolean emptyCorner(TicTacToe Game)
  {

  }

  public boolean emptySide(TicTacToe Game)
  {

  }*/
}
