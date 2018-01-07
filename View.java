package Universe;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

//Main frame container class
public class View extends JFrame { 							// inheritance [JFrame is parent class]

	
	View(){	//constructor
		//setting the following attributes of frame
		setTitle("Stellar Crush");
		setBounds(00, 00, 800, 612);
		setVisible(true);
		setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setFocusable(true);
		

			}
}
