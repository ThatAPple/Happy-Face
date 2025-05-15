import org.code.neighborhood.*;

public class Border extends PainterPlus {
  public Border() {
    super(0, 0, "North", 145);
  }
//This command allows the painter to create the border by telling it to paint black and move until it hits an obstacle. The painter will that turn right and repeat the process. 
  public void paint() {
    while(this.canMove()){
      paint("black");
      move();
    }
    
    turnRight();
    paint("black");

    while(this.canMove()){
      paint("black");
      move();
    }
    
    turnRight();
    paint("black");

    while(this.canMove()){
      paint("black");
      move();
    }
    
    turnRight();
    paint("black");
  }
  // This command allows the painter to move in a line so that it can create the next fill. 
  public void moveIn() {
    this.turnRight();
   this.move();
    this.turnRight();
    this.move();
    this.turnLeft();
  }
//This command allows the painter to know how many times it should paint and what color it should paint the individual squares in.
  public void paintNumber(int numTimes, String color){
    while(this.canMove()){
    this.move();
    this.paint();
    }
  }

  //This command tells the painter to move out so that it can access a different area of the grid. 
  public void moveOut() {
      this.turnRight();
      this.move();
      this.turnRight();
      this.move();
      this.move();
    }
  }
