import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Ball extends Rectangle{
	
	Random randomDirection;
	Random randomColor;
	
	int xVelocity;
	int yVelocity;
	int initialSpeed = 2;
	
	Ball(int x, int y, int width, int height){
		super(x, y, width, height);
		randomDirection = new Random();
		int randomXDerection = randomDirection.nextInt(2);
		if(randomXDerection == 0) {
			randomXDerection--;
		}
		setXDirection (randomXDerection*initialSpeed);
		int randomYDirection = randomDirection.nextInt(2);
		if(randomYDirection == 0) {
			randomYDirection--;
		}
		setYDirection(randomYDirection*initialSpeed);
		
	}
	
	public void setXDirection(int randomXDirection) {
		xVelocity = randomXDirection;
	} 
	
	public void setYDirection(int randomYDirection) {
		yVelocity = randomYDirection;
	}
	
	public void move() {
		x+=xVelocity;
		y+=yVelocity;
	}
	
	public void draw(Graphics g) {
		randomColor = new Random();
		//g.setColor(new Color(randomColor.nextFloat(),randomColor.nextFloat(),randomColor.nextFloat()));
		g.setColor(new Color(255, 0, 0));
		g.fillOval(x, y, height, width);
	}

}
