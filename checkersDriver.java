package checkersCode;
//import java.io.*;
import java.util.*;

public class checkersDriver {

public static void main(String[] args)
{
  //Primary objects we will use.
  checkerBoard checkerBoard = new checkerBoard();
  checkerPiece checkerPiece;
  Scanner scan = new Scanner(System.in);

  //Primary Variabless
  boolean gameIsRunning = true; //default is true
  boolean check;
  String response;
  //Intro
  System.out.println("Welcome to Checkers \n\n");



  //Run check to confirm user would like to play from checkerBoard game obj
  do{
    //Ask user if he/she would like to play.
    System.out.println("Hello user, would you like to play?(yes/no)");
    response = scan.nextLine();

    check = checkerBoard.askUserToStartGame(response);
  }while(check != true);

  //Begin game
  checkerBoard.printBoard();

  do
  {
    if(checkerBoard.checkIntent()) //checks user intent
    {
      System.out.println("Player One:");
      System.out.println("Enter movement coordinate: ");
      String firstCoordinate = scan.nextLine();
      System.out.println("Enter destination coordinate");
      String secondCoordinate = scan.nextLine();

      checkerBoard.updateBoardPlayerOne(firstCoordinate, secondCoordinate);

      System.out.println("Player Two:");
      System.out.println("Enter movement coordinate: ");
      firstCoordinate = scan.nextLine();
      System.out.println("Enter destination coordinate");
      secondCoordinate = scan.nextLine();

      checkerBoard.updateBoardPlayerTwo(firstCoordinate,secondCoordinate);
      System.out.println("Did you jump over a checkerPiece?");
      response = scan.nextLine();
      if(response.equalsIgnoreCase("yes"))
      {
        System.out.println("What coordinate?");
        String jumpCoordinate = scan.nextLine();
        checkerBoard.checkJump(response, jumpCoordinate);
      }

      checkerBoard.checkWin();

    }
    else{
      System.exit(1); //Error code
    }
  }while(gameIsRunning);



  //End game
  scan.close();
}

}
