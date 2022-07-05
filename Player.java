import java.util.Scanner;
public abstract class Player{

  char playerPiece;
  char opponentPiece;
  int playerNumber;

  Player(int playerNum){
    playerNumber = playerNum;
    if(playerNumber==1)
      {playerPiece = 'X';opponentPiece = 'O';}
    else
      {playerPiece = 'O';opponentPiece = 'X';}
  }

  public abstract void TakeTurn(TicTacToe Game);

  public boolean updateGameBoard(TicTacToe Game, int position)
  {
    if(position == 1)
    {
      if(Game.gameBoard[0][0] == ' ')
        {Game.gameBoard[0][0] = playerPiece; return true;}
      else
        return false;
    }
    else if (position == 2)
    {
      if(Game.gameBoard[0][1] == ' ')
        {Game.gameBoard[0][1] = playerPiece; return true;}
      else
        return false;
    }
    else if (position == 3)
    {
      if(Game.gameBoard[0][2] == ' ')
        {Game.gameBoard[0][2] = playerPiece; return true;}
      else
        return false;
    }
    else if (position == 4)
    {
      if(Game.gameBoard[1][0] == ' ')
        {Game.gameBoard[1][0] = playerPiece; return true;}
      else
        return false;
    }
    else if (position == 5)
    {
      if(Game.gameBoard[1][1] == ' ')
        {Game.gameBoard[1][1] = playerPiece; return true;}
      else
        return false;
    }
    else if (position == 6)
    {
      if(Game.gameBoard[1][2] == ' ')
        {Game.gameBoard[1][2] = playerPiece; return true;}
      else
        return false;
    }
    else if (position == 7)
    {
      if(Game.gameBoard[2][0] == ' ')
        {Game.gameBoard[2][0] = playerPiece; return true;}
      else
        return false;
    }
    else if (position == 8)
    {
      if(Game.gameBoard[2][1] == ' ')
        {Game.gameBoard[2][1] = playerPiece; return true;}
      else
        return false;
    }
    else if (position == 9)
    {
      if(Game.gameBoard[2][2] == ' ')
        {Game.gameBoard[2][2] = playerPiece; return true;}
      else
        return false;
    }
    else
      return false;
  }


}
