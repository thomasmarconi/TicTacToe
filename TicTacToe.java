import java.util.Scanner;

public class TicTacToe{
  //main starts
  public static void main(String[] args)
  {
    Player p1, p2;
    TicTacToe Game = new TicTacToe();
    /*if(args.length > 3 || (args.length == 3 && !args[2].equals("-a")))
    {
      System.out.println("Usage:  java TicTacToe [-c [1|2] [-a]]");
      return;
    }
    else */if(args.length == 0)
    //two human players
    {
      p1 = new Human(1);
      p2 = new Human(2);
    }
    else if(args[0].equals("-c") && args.length == 1)
    //two computer players
    {
      p1 = new DumbComp(1);
      p2 = new DumbComp(2);
    }
    else if(args[0].equals("-c") && args[1].equals("1"))
    //computer player 1, human player 2
    {
      /*if(args.length == 3)
        p1 = new AdvComp(1);
      else*/
        p1 = new DumbComp(1);
      p2 = new Human(2);
    }
    else if(args[0].equals("-c") && args[1].equals("2"))
    //human player 1, computer player 2
    {
      p1 = new Human(1);
      /*if(args.length == 3)
        p2 = new AdvComp(2);
      else*/
        p2 = new DumbComp(2);
    }
    else{
      System.out.println("Usage:  java TicTacToe [-c [1|2] ]");
      return;
    }
    while(Game.GameFinished() == 0)
    {
      Game.PrintBoard();
      p1.TakeTurn(Game);
      Game.PrintBoard();
      if(Game.GameFinished() == 0)
        p2.TakeTurn(Game);
    }
    Game.Finish();
  }//main ends

  //TicTacToe class data
  public static char[][] gameBoard = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};

  //TicTacToe class methods
  private static int GameFinished()
  //return 1 if player 1 wins, return 2 if player 2 wins, 0 otherwise
  {
    if(gameBoard[0][0] == 'X' && gameBoard[0][1] == 'X' && gameBoard[0][2] == 'X')
      return 1;
    else if(gameBoard[1][0] == 'X' && gameBoard[1][1] == 'X' && gameBoard[1][2] == 'X')
      return 1;
    else if(gameBoard[2][0] == 'X' && gameBoard[2][1] == 'X' && gameBoard[2][2] == 'X')
      return 1;
    else if(gameBoard[0][0] == 'X' && gameBoard[1][0] == 'X' && gameBoard[2][0] == 'X')
      return 1;
    else if(gameBoard[0][1] == 'X' && gameBoard[1][1] == 'X' && gameBoard[2][1] == 'X')
      return 1;
    else if(gameBoard[0][2] == 'X' && gameBoard[1][2] == 'X' && gameBoard[2][2] == 'X')
      return 1;
    else if(gameBoard[0][0] == 'X' && gameBoard[1][1] == 'X' && gameBoard[2][2] == 'X')
      return 1;
    else if(gameBoard[0][2] == 'X' && gameBoard[1][1] == 'X' && gameBoard[2][0] == 'X')
      return 1;
    else if(gameBoard[0][0] == 'O' && gameBoard[0][1] == 'O' && gameBoard[0][2] == 'O')
      return 2;
    else if(gameBoard[1][0] == 'O' && gameBoard[1][1] == 'O' && gameBoard[1][2] == 'O')
      return 2;
    else if(gameBoard[2][0] == 'O' && gameBoard[2][1] == 'O' && gameBoard[2][2] == 'O')
      return 2;
    else if(gameBoard[0][0] == 'O' && gameBoard[1][0] == 'O' && gameBoard[2][0] == 'O')
      return 2;
    else if(gameBoard[0][1] == 'O' && gameBoard[1][1] == 'O' && gameBoard[2][1] == 'O')
      return 2;
    else if(gameBoard[0][2] == 'O' && gameBoard[1][2] == 'O' && gameBoard[2][2] == 'O')
      return 2;
    else if(gameBoard[0][0] == 'O' && gameBoard[1][1] == 'O' && gameBoard[2][2] == 'O')
      return 2;
    else if(gameBoard[0][2] == 'O' && gameBoard[1][1] == 'O' && gameBoard[2][0] == 'O')
      return 2;
    else if(gameBoard[0][0] != ' ' && gameBoard[0][1] != ' ' && gameBoard[0][2] != ' '
         && gameBoard[1][0] != ' ' && gameBoard[1][1] != ' ' && gameBoard[1][2] != ' '
         && gameBoard[2][0] != ' ' && gameBoard[2][1] != ' ' && gameBoard[2][2] != ' ')
      return -1;
    else
      return 0;
  }

  private static void PrintBoard()
  {
    System.out.println("Game Board:\t\t\tPositions: ");
    System.out.println(" " + gameBoard[0][0] + " | " + gameBoard[0][1] + " | " + gameBoard[0][2] + " \t\t\t 1 | 2 | 3 ");
    System.out.println("-----------\t\t\t-----------");
    System.out.println(" " + gameBoard[1][0] + " | " + gameBoard[1][1] + " | " + gameBoard[1][2] + " \t\t\t 4 | 5 | 6 ");
    System.out.println("-----------\t\t\t-----------");
    System.out.println(" " + gameBoard[2][0] + " | " + gameBoard[2][1] + " | " + gameBoard[2][2] + " \t\t\t 7 | 8 | 9 ");
    System.out.println();
  }

  public static void Finish()
  {
    System.out.println("\n\nFinal Game Board:");
    PrintBoard();
    if(GameFinished() == 1)
      System.out.println("Player 1 wins!");
    else if(GameFinished() == 2)
      System.out.println("Player 2 wins!");
    else if(GameFinished() == -1)
      System.out.println("It was a draw!");
  }



}
