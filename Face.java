import org.code.neighborhood.*;
public class Face extends PainterPlus {
  public Face() {
    super(0, 0, "North", 145);
  }
  //This is the same as the previous move in command and allows the painter to move in to access a more centermost area in the grid. 
public void moveIn() {
    this.turnRight();
   this.move();
    this.turnRight();
    this.move();
    this.turnLeft();
  }
  //This command allows the painter to move twice in one command. I wrote this because move fast would case the painter to move too much. 
public void moveTwice() {
  this.move();
  this.move();
}
  //This command allows the painter to paint twice in black, which is the face color. 
public void paintTwice() {
  this.paint("black");
  this.move();
  this.paint("black");
  }
  //This command allows the painter to paint twice in yellow, which is the fill color. 
public void paintTwiceFill() {
    this.paint("yellow");
    this.move();
    this.paint("yellow");
  }
  //This command allows the painter to rotate 180 degrees so that it can move to a different part of the grid. 
public void rotateOneEighty() {
  this.turnRight();
  this.turnRight();
}
}
