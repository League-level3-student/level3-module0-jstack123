package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
 //	1. make a main method

	  
		
//	public static void moveRobot(Robot r, int x,int y) {
//		Random random = new Random();
//		 int rNum = random.nextInt(50);
//	
//		 r.moveTo(x, y);
//			r.setSpeed(15);
//			r.move(rNum);
//			if(r.getY() < 100) {
//				race = false;
//			}
//	}
	 
	 public static void main(String[] args) {
		
		Thread[] threads = new Thread[5];

		
		for (int i = 0; i < threads.length; i++) {
			int y = 600;
			int x = i * (100) + 50; 
			int num = i + 1;
			threads[i] = new Thread(()->{
				boolean race = true;
				Robot r = new Robot();
				r.moveTo(x, y);
				r.setSpeed(15);
				while(race) {
					
				Random random = new Random();
				 int rNum = random.nextInt(50);
				 System.out.println(rNum);
				
					r.move(rNum);
					if(r.getY() < 100) {
						race = false;
						
						JOptionPane.showMessageDialog(null, "Robot " + num + " wins the race!!!");
						break;

					}
					
				}
				});
			
			threads[i].start();	
			
		}
	 
//		while(thread[1]) {
//			
//		}
		
	}
	 
//	public static void main(String[] args) {
//		Robot[] robots = new Robot[5];
//		boolean race = true;
//
//		 
//		for (int i = 0; i < robots.length; i++) {
//			robots[i] = new Robot();
//			robots[i].moveTo(i * (100) + 50, 500);
//		}
//			
//			while(race) {
//				for (int j = 0; j < robots.length; j++) {
//					
//					robots[j].setSpeed(50);
//					Random random = new Random();
//					 int rNum = random.nextInt(50);
//					 robots[j].turn(15);
//					robots[j].move(rNum);
//					if(robots[j].getY() < 100) {
//						race = false;
//						int num = j+1;
//						JOptionPane.showMessageDialog(null, "Robot " + num + " wins the race!!!");
//					}
//				}
//			}
//		
//		
//	} 
	
		//2. create an array of 5 robots.

		//3. use a for loop to initialize the robots.

			//4. make each robot start at the bottom of the screen, side by side, facing up
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
    	
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	
}
