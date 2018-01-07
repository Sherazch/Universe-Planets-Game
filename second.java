package Universe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.util.Timer;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//this class provides the whole logic for moving objects in playfield
public class second extends JLabel implements Runnable {		//inherits Jlabel and implementing Runnable interface for thread
	public static Thread t;									//object of thread
	public static Rectangle planet[] = new Rectangle[11];	//array of object of rectangle for meteors/planets of length 11
	public static Rectangle userplanet;						//object of rectangle for user planet
	public static int hieghtloc = 100;
	public static int x[] = { 190, 250, 310, 370, 430, 490, 550, 610, 670, 720,770 };	//array of x-axis of meteors/planets
	public static int y[] = { 90, 530, 90, 530, 90, 530, 90, 530, 90, 530,90 };			//array of y-axis of meteors/planets
	public static int userwidthloc = 50, userhieghtloc = 45, size = 40,wow=30;
	public static Graphics gs;			//object of graphics for drawing shapes

	second() {		// constructor
		t = new Thread(this);		// thread has been applied on this class
		t.start();		// starting thread
		//initializing all rectangle objects by setting location and size
		userplanet = new Rectangle(userwidthloc, userhieghtloc, size, size);
		planet[0] = new Rectangle(x[0], y[0], 30, 30);
		planet[1] = new Rectangle(x[1], y[1], 30, 30);
		planet[2] = new Rectangle(x[2], y[2], 30, 30);
		planet[3] = new Rectangle(x[3], y[3], 30, 30);
		planet[4] = new Rectangle(x[4], y[4], 30, 30);
		planet[5] = new Rectangle(x[5], y[5], 30, 30);
		planet[6] = new Rectangle(x[6], y[6], 30, 30);
		planet[7] = new Rectangle(x[7], y[7], 30, 30);
		planet[8] = new Rectangle(x[8], y[8], 30, 30);
		planet[9] = new Rectangle(x[9], y[9], 30, 30);
		planet[10] = new Rectangle(x[10], y[10], 30, 30);
	}
	
//method to draw planets
	public void paintComponent(Graphics g) {
// in this method all the planet objects are getting colors and rectangular objects trnsfers into oval/ellipses
		super.paintComponent(g);
		// User's Planet
		g.setColor(Color.orange);
		g.fillOval(userwidthloc, userhieghtloc, size, size);
		// Planet#2
		g.setColor(Color.gray);
		g.fillOval(x[0], y[0], 30, 30);
		// Planet#3
		g.setColor(Color.magenta);
		g.fillOval(x[1], y[1], 30, 30);
		// Planet#4
		g.setColor(Color.white);
		g.fillOval(x[2], y[2], 30, 30);
		// Planet#5
		g.setColor(Color.green);
		g.fillOval(x[3], y[3], 30, 30);
		// Planet#6
		g.setColor(Color.yellow);
		g.fillOval(x[4], y[4], 30, 30);
		// Planet#7
		g.setColor(Color.red);
		g.fillOval(x[5], y[5], 30, 30);
		// Planet#8
		g.setColor(Color.pink);
		g.fillOval(x[6], y[6], 30, 30);
		// planet#9
		g.setColor(Color.blue);
		g.fillOval(x[7], y[7], 30, 30);
		// planet#10
		g.setColor(Color.cyan);
		g.fillOval(x[8], y[8], 30, 30);
		// planet#11
		g.setColor(Color.red);
		g.fillOval(x[9], y[9], 30, 30);
		// planet#12
		g.setColor(Color.green);
		g.fillOval(x[10], y[10], 30, 30);
	}
	@Override
	public void run() {						//run method starts the thread, all concurrent things are occuring inside this method
		// TODO Auto-generated method stub
		int inc = 2, inc1 = 2;
		//moving meteors/planets in the game play field
		while (true) {
			for (int i = 0; i < 11; i++) {
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 9) {
					if (y[i] == 540) {
						inc1 = -2;
					} else if (y[i] == 70) {
						inc1 = 2;
					}
					y[i] += inc1;
				}
				if (i == 0 || i == 2 || i == 4 || i == 6 || i == 8 || i==10) {
					if (y[i] == 540) {
						inc = -2;
					} else if (y[i] == 70) {
						inc = 2;
					}
					y[i] += inc;
				}
								repaint();
				try {
					Thread.sleep(1);			//pause thread for 1 milliseconds
				} catch (Exception e) {
				}
				if (userplanet.contains(x[i], y[i])) {
					size += 5;
					System.out.println("Touching eachother");			//check
					userplanet.setSize(size, size);
					y[i] += 70;		//relocating meteors after collision
					repaint();
				}
			}
		}
	}
	// reset method for reseting all objects
public static void reset(){
	t.stop();
	userhieghtloc=45;userwidthloc=50;size=40;
	x[0]=130;
	for(int i=0;i<11;i++){
	y[i] = 100;
	x[i]+=40;
	planet[i].setBounds(x[i], y[i], 30, 30);			//reset location of all meteors/planets
	t.resume();
	//repaint();
	}
	//reset location and size of user planet
	userplanet.setBounds(userwidthloc	, userhieghtloc, size, size);	
	//repaint();
}	
}