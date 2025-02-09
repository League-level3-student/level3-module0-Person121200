package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {

	// 1. make a main method
	public static void main(String[] args) {
		Robot[] rob = new Robot[5];
		Random rand = new Random();
		boolean raceFinished = false;
		for (int i = 0; i < rob.length; i++) {
			rob[i] = new Robot();
			rob[i].setSpeed(10);
			rob[i].setX(50 + i * 200);
			rob[i].setY(550);
			

		}

		while(raceFinished!= true) {
			for (int j = 0; j < rob.length; j++) {
				rob[j].move(rand.nextInt(49));
				if(rob[j].getY() <= 70) {
					raceFinished = true;

					for(int i = 0; i<rob.length; i++) {
						if(rob[i].getY()> 70) {
							rob[i].hide();


						}
					}
				}

			}
			

		}
	}


}

// 2. create an array of 5 robots.

// 3. use a for loop to initialize the robots.

// 4. make each robot start at the bottom of the screen, side by side, facing up

// 5. use another for loop to iterate through the array and make each robot move
// a random amount less than 50.

// 6. use a while loop to repeat step 5 until a robot has reached the top of the
// screen.

// 7. declare that robot the winner and throw it a party!

// 8. try different races with different amounts of robots.

// 9. make the robots race around a circular track.
