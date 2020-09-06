package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot blue = new Robot(400, 400);
		Robot yellow = new Robot(500, 500);
		Robot black = new Robot(600, 400);
		Robot green = new Robot(700, 500);
		Robot red = new Robot(800, 400);
		Thread blueThread = new Thread(() -> {
			blue.setSpeed(10);
			blue.penDown();
			blue.setPenWidth(5);
			blue.setPenColor(Color.blue);
			for (int i = 0; i < 360; i++) {
				blue.move(2);
				blue.turn(1);
			}
			//blue.hide();
		});

		Thread yellowThread = new Thread(() -> {
			yellow.setSpeed(10);
			yellow.penDown();
			yellow.setPenWidth(5);
			yellow.setPenColor(Color.yellow);
			for (int i = 0; i < 360; i++) {
				yellow.move(2);
				yellow.turn(1);
			}
			//yellow.hide();
		});

		Thread blackThread = new Thread(() -> {
			black.setSpeed(10);
			black.penDown();
			black.setPenWidth(5);
			black.setPenColor(Color.black);
			for (int i = 0; i < 360; i++) {
				black.move(2);
				black.turn(1);
			}
			//black.hide();
		});

		Thread greenThread = new Thread(() -> {
			green.setSpeed(10);
			green.penDown();
			green.setPenWidth(5);
			green.setPenColor(Color.green);
			for (int i = 0; i < 360; i++) {
				green.move(2);
				green.turn(1);
			}
			//green.hide();
		});

		Thread redThread = new Thread(() -> {
			red.setSpeed(10);
			red.penDown();
			red.setPenWidth(5);
			red.setPenColor(Color.red);
			for (int i = 0; i < 360; i++) {
				red.move(2);
				red.turn(1);
			}
			//red.hide();
		});

		blueThread.start();
		yellowThread.start();
		blackThread.start();
		greenThread.start();
		redThread.start();
	}
}
