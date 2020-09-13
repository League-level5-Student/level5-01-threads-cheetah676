package _02_Advanced_Robot_Race;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	static Robot[] robotArray=new Robot[5];
	public static void main(String[]args) {
		robotArray[0]=new Robot();
		robotArray[1]=new Robot();
		robotArray[2]=new Robot();
		robotArray[3]=new Robot();
		robotArray[4]=new Robot();
		Thread rob0=new Thread(()->{
			robotArray[0].moveTo(50, 600);
			robotArray[0].setSpeed(1);
			robotArray[0].penDown();
			Random rand=new Random();
			int ran;
			while(checkIfWon()==false) {
				ran=rand.nextInt(3);
				robotArray[0].move(ran);
				System.out.println("hi");
			}	
		});
		Thread rob1=new Thread(()->{
			robotArray[1].moveTo(250, 600);
			robotArray[1].setSpeed(1);
			robotArray[1].penDown();
			Random rand=new Random();
			int ran;
			while(checkIfWon()==false) {
				ran=rand.nextInt(3);
				robotArray[1].move(ran);
			}	
		});
		Thread rob2=new Thread(()->{
			robotArray[2].moveTo(450, 600);
			robotArray[2].setSpeed(1);
			robotArray[2].penDown();
			Random rand=new Random();
			int ran;
			while(checkIfWon()==false) {
				ran=rand.nextInt(3);
				robotArray[2].move(ran);
			}	
		});
		Thread rob3=new Thread(()->{
			robotArray[3].moveTo(650, 600);
			robotArray[3].setSpeed(1);
			robotArray[3].penDown();
			Random rand=new Random();
			int ran;
			while(checkIfWon()==false) {
				ran=rand.nextInt(3);
				robotArray[3].move(ran);
			}	
		});
		Thread rob4=new Thread(()->{
			robotArray[4].moveTo(850, 600);
			robotArray[4].setSpeed(1);
			robotArray[4].penDown();
			Random rand=new Random();
			int ran;
			while(checkIfWon()==false) {
				ran=rand.nextInt(3);
				robotArray[4].move(ran);
			}	
		});
		rob0.start();
		rob1.start();
		rob2.start();
		rob3.start();
		rob4.start();
		}
	static boolean checkIfWon() {
		for(int i=0; i<robotArray.length; i++) {
		if(robotArray[i].getY()<100) {
			JOptionPane.showMessageDialog(null, "Robot "+i+" won the rase!");
			return true;
		}
	}
		return false;
	}
}

