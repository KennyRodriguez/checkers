package checkersCode;
//import java.io.*;
import java.util.*;
public class checkerBoard {

  String board = "8  |h| |h| |h| |h\n"+
                 "7 h| |h| |h| |h| \n"+
                 "6  |h| |h| |h| |h\n"+
                 "5  | | | | | | | \n"+
                 "4  | | | | | | | \n"+
                 "3 r| |r| |r| |r| \n"+
                 "2  |r| |r| |r| |r\n"+
                 "1 r| |r| |r| |r| \n"+
                 "  A B C D E F G H ";
        //Actual Board we will be playing on.
  StringBuilder updateBoard = new StringBuilder(""+board);

  checkerBoard()
  {
    super();
    //empty constructor **for now?
  }

  void printBoard()
  {
    System.out.println(this.board);
    //printing board.
  }

  boolean checkIntent()
  {
   //Allows for scanning in.

    String confirmation; //Makes sure user wants to continue playing
    Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to continue? (Yes or No)");
        confirmation = scan.nextLine();

        if(confirmation.equalsIgnoreCase("Yes"))
        {
          return true; //scan is closed in driver.
        }
        else if(confirmation.equalsIgnoreCase("No"))
        {
          scan.close();
          System.out.println("Goodbye \n");
          System.exit(0);
        }
        else{
            System.out.println("Final chance: Would you like to continue?");
            confirmation = scan.nextLine();
            if(confirmation.equalsIgnoreCase("Yes"))
            {
              return true;
            }
        }
        scan.close();
        return false;

  }
  boolean askUserToStartGame(String response){
    //Checks to see if user would like to play.
    if(response.equalsIgnoreCase("Yes"))
      {
      System.out.println("Great!");
      return true;
      }
    else if(response.equalsIgnoreCase("No"))
      {
      System.out.println("Goodbye!");
      System.exit(0);
      //Ends code, returns 0 for error-checking.
      }
      else
      {
      System.out.println("Try again");
      }
      return false;
    }

  void updateBoardPlayerOne(String originPoint, String destinationPoint){

    //Identify xPos , yPos
    int xPos = 0;
    char check = originPoint.charAt(0);

    switch(check){
    case 'a':
            xPos = 1;
            break;
    case 'b':
            xPos = 2;
            break;
    case 'c':
            xPos = 3;
            break;
    case 'd':
            xPos = 4;
            break;
    case 'e':
            xPos = 5;
            break;
    case 'f':
            xPos = 6;
            break;
    case 'g':
            xPos = 7;
            break;
    case 'h':
            xPos = 8;
            break;


  }

  check = originPoint.charAt(1);
  int yPos = check - '0';

  //


  int xPosTwo = 0;
  check = destinationPoint.charAt(0);

  switch(check){
  case 'a':
          xPosTwo = 1;
          break;
  case 'b':
          xPosTwo = 2;
          break;
  case 'c':
          xPosTwo = 3;
          break;
  case 'd':
          xPosTwo = 4;
          break;
  case 'e':
          xPosTwo = 5;
          break;
  case 'f':
          xPosTwo = 6;
          break;
  case 'g':
          xPosTwo = 7;
          break;
  case 'h':
          xPosTwo = 8;
          break;


}

check = destinationPoint.charAt(1);
int yPosTwo = check - '0';

  //each one away from xPos is +1 up
switch(xPos)
    {
      case 1:
            break;
      case 2:
            xPos+=1;
            break;
      case 3:
            xPos +=2;
            break;
      case 4:
            xPos +=3;
            break;
      case 5:
            xPos +=4;
            break;
      case 6:
            xPos+=5;
            break;
      case 7:
            xPos +=6;
            break;
      case 8:
            xPos +=7;
            break;
      }
      switch(xPosTwo)
          {
            case 1:
                  break;
            case 2:
                  xPosTwo +=1;
                  break;
            case 3:
                  xPosTwo +=2;
                  break;
            case 4:
                  xPosTwo +=3;
                  break;
            case 5:
                  xPosTwo +=4;
                  break;
            case 6:
                  xPosTwo +=5;
                  break;
            case 7:
                  xPosTwo +=6;
                  break;
            case 8:
                  xPosTwo +=7;
                  break;
            }
    //Origin Point
    int loc = ((18 * yPos) + (18-xPos)) - 1;
    loc = board.length() - loc;

    System.out.println(xPos);

    this.updateBoard.setCharAt(loc, ' ');

    //Destination Point
    int locTwo  = ((18 * yPosTwo) + (18-xPosTwo)) - 1;
    locTwo = board.length() - locTwo;
    this.updateBoard.setCharAt(locTwo, 'r');

    System.out.println(updateBoard);

  }

void updateBoardPlayerTwo(String originPoint, String destinationPoint){

    //Identify xPos , yPos
    int xPos = 0;
    char check = originPoint.charAt(0);

    switch(check){
    case 'a':
            xPos = 1;
            break;
    case 'b':
            xPos = 2;
            break;
    case 'c':
            xPos = 3;
            break;
    case 'd':
            xPos = 4;
            break;
    case 'e':
            xPos = 5;
            break;
    case 'f':
            xPos = 6;
            break;
    case 'g':
            xPos = 7;
            break;
    case 'h':
            xPos = 8;
            break;


  }

  check = originPoint.charAt(1);
  int yPos = check - '0';

  //


  int xPosTwo = 0;
  check = destinationPoint.charAt(0);

  switch(check){
  case 'a':
          xPosTwo = 1;
          break;
  case 'b':
          xPosTwo = 2;
          break;
  case 'c':
          xPosTwo = 3;
          break;
  case 'd':
          xPosTwo = 4;
          break;
  case 'e':
          xPosTwo = 5;
          break;
  case 'f':
          xPosTwo = 6;
          break;
  case 'g':
          xPosTwo = 7;
          break;
  case 'h':
          xPosTwo = 8;
          break;


}

check = destinationPoint.charAt(1);
int yPosTwo = check - '0';

  //each one away from xPos is +1 up
switch(xPos)
    {
      case 1:
            break;
      case 2:
            xPos+=1;
            break;
      case 3:
            xPos +=2;
            break;
      case 4:
            xPos +=3;
            break;
      case 5:
            xPos +=4;
            break;
      case 6:
            xPos+=5;
            break;
      case 7:
            xPos +=6;
            break;
      case 8:
            xPos +=7;
            break;
      }
      switch(xPosTwo)
          {
            case 1:
                  break;
            case 2:
                  xPosTwo +=1;
                  break;
            case 3:
                  xPosTwo +=2;
                  break;
            case 4:
                  xPosTwo +=3;
                  break;
            case 5:
                  xPosTwo +=4;
                  break;
            case 6:
                  xPosTwo +=5;
                  break;
            case 7:
                  xPosTwo +=6;
                  break;
            case 8:
                  xPosTwo +=7;
                  break;
            }
    //Origin Point
    int loc = ((18 * yPos) + (18-xPos)) - 1;
    loc = board.length() - loc;

    System.out.println(xPos);

    this.updateBoard.setCharAt(loc, ' ');

    //Destination Point
    int locTwo  = ((18 * yPosTwo) + (18-xPosTwo)) - 1;
    locTwo= board.length() - locTwo;
    this.updateBoard.setCharAt(locTwo, 'h');

    System.out.println(updateBoard);

    //System.out.printl


  }


  void checkJump(String response, String jumpCoordinate)
  {
    //Identify xPos , yPos
    int xPos = 0;
    char check = jumpCoordinate.charAt(0);

    switch(check){
    case 'a':
            xPos = 1;
            break;
    case 'b':
            xPos = 2;
            break;
    case 'c':
            xPos = 3;
            break;
    case 'd':
            xPos = 4;
            break;
    case 'e':
            xPos = 5;
            break;
    case 'f':
            xPos = 6;
            break;
    case 'g':
            xPos = 7;
            break;
    case 'h':
            xPos = 8;
            break;


  }
  switch(xPos)
      {
        case 1:
              break;
        case 2:
              xPos+=1;
              break;
        case 3:
              xPos +=2;
              break;
        case 4:
              xPos +=3;
              break;
        case 5:
              xPos +=4;
              break;
        case 6:
              xPos+=5;
              break;
        case 7:
              xPos +=6;
              break;
        case 8:
              xPos +=7;
              break;
        }
  check = jumpCoordinate.charAt(1);


  int yPos = check - '0';
  int loc = ((18 * yPos) + (18-xPos)) - 1;
  loc = board.length() - loc;

  if(this.updateBoard.charAt(loc) == 'r' || this.updateBoard.charAt(loc) == 'h')
  {
    this.updateBoard.setCharAt(loc, ' ');
  }

  System.out.println(this.updateBoard);

}

void checkWin()
{
  boolean check = this.updateBoard.toString().contains("r");

  if(check == false)
  {
    System.out.println("You won!");
    System.exit(2);
  }
  else{
    check = this.updateBoard.toString().contains("h");
    if(check == false){
        System.out.println("You won!");
        System.exit(2);
    }
  }
}




  }
