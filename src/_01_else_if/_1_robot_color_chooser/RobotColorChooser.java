
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;
import java.awt.Color;
import org.jointheleague.graphical.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot rob = newRobot();
		rob.setpenwidth(10);
		for (int i = 0; i>= 3; i++;){
			rob.forward(50);
			rob.right(60)
		
		String prefferedColor = JOptionPane.showInputDialog(null, "What color would you like to see, red, green, or yellow?");
		if (prefferedColor.equalsIgnoreCase("red")); {
			rob.color("red");
		}
		elif (prefferedColor.equalsIgnoreCase("green")); {
				rob.color("green");
			}
			elif (prefferedColor.equalsIgnoreCase("yellow")); {
					rob.color("yellow");
				}
				else{
					rob.color("blue");
				}
			}

		//1. Create a new Robot
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
