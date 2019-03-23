//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot bob = new Robot();
		bob.setPenWidth(10);
		bob.setSpeed(1000);
		bob.hide();
		bob.penDown();
		//3. Ask the user what color they would like the robot to draw
		boolean run = true;
		while (run == true) {
		String color = JOptionPane.showInputDialog("what color do you wish the robot to draw");
		//5. Use an if/else statement to set the pen color that the user requested
		if (color.equalsIgnoreCase("red")) {
			bob.setPenColor(Color.red);
		}else if (color.equalsIgnoreCase("blue")) {
			bob.setPenColor(Color.blue);
		}else if (color.equalsIgnoreCase("red")) {
			bob.setPenColor(Color.red);
		}else if (color.equalsIgnoreCase("green")) {
			bob.setPenColor(Color.green);
		}else if (color.equalsIgnoreCase("orange")) {
			bob.setPenColor(Color.orange);
		}else if (color.equalsIgnoreCase("black")) {
			bob.setPenColor(Color.BLACK);
		}else if (color.equalsIgnoreCase("pink")) {
			bob.setPenColor(Color.PINK);
		}else if (color.equals(null)) {
			bob.setRandomPenColor();
		}
		bob.move(50);
		bob.turn(45);
		}
        //6. If the user doesn’t enter anything, choose a random color
		
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)


	}
}
