import org.code.neighborhood.*;
public class PainterPlus extends Painter {
public int x;
public int y;
public String direction; 
//This command spawns in the painter at a designated coordinate with the amount of paint that one would choose to have. 
public PainterPlus(int xPos, int yPos, String dir, int paintquant){
  x=xPos;
  y=yPos;
  direction=dir;

  setPaint(paintquant);
}
  //This command turns the painter right by having three turn left rotations. 
public void turnRight(){
   turnLeft();
   turnLeft();
   turnLeft();
  
}
 //this command allows the painter to move until it hits an obstacle. 
  public void moveFast(){
    while (this.canMove()) {
      this.move();
    }
  }
  //This command allows the painter to move while it has paint. 
  public void paintToEmpty(String color) {
    while (this.hasPaint() && this.canMove()){
      this.paint(color);
      this.move();
      
    }
  }
}
