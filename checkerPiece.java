package checkersCode;

public class checkerPiece{
  //All pieces have an origin and destination point
  String originPoint;
  String destinationPoint;
  int xPos;
  int yPos;
  checkerBoard checkerBoard = new checkerBoard();

  checkerPiece(String originPoint, String destinationPoint)
  {
    super();
    this.originPoint = originPoint;
    this.destinationPoint = destinationPoint;
  }

void move(String originPoint, String destinationPoint){
    //Identify xPos , yPos
    xPos = 0;
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

  check = destinationPoint.charAt(1);
  yPos = check - '0';

  checkerBoard.updateBoard(xPos, yPos);


}






  }




}
