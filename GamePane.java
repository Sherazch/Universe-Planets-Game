package Universe;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.*;
import java.awt.geom.Ellipse2D.Double;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//this class sets the playfield of the game 
public class GamePane{
	
	public static second Bg=new second();				//creating object of 'second' class
	public static JButton jb=new JButton("Quit");		//creating object of JButton
	public static JPanel p=new JPanel();				//creating object of JPanel
	
	
	GamePane(){			//constructor
		ImageIcon icon = new ImageIcon("C:\\Users\\Sheraz Ahmed\\Downloads\\unnamed.jpg");		//setting background image 
		//setting attributes of JPanel 
//		p.setBounds(00,00,800,612);
//		p.setVisible(false);
//		p.setLayout(null);
//		
		
		
		//setting attributes of JLabel in 'second' class through its object Bg
		Bg.setIcon(icon);
		Bg.setBounds(0,0,800,612);
		Bg.setLayout(null);
		Bg.setVisible(true);
		//p.add(Bg);						////adding Jlabel in 'second' class to JPanel through its object Bg
		
		JLabel l33 = new JLabel();		//creating object of JLabel
		//setting attributes
		l33.setVisible(true);
		l33.setBounds(0, 0, 120, 35);
		l33.setFont(new Font("Comic Sans MS", 00, 18));
		l33.setText("**START**");
		l33.setForeground(Color.GREEN);
		Bg.add(l33);				//adding label into Jlabel in 'second' class through its object Bg
		
		//setting attributes of quit button in play field
		jb.setFont(new Font("Comic Sans MS",00,20));
		jb.setBounds(00, 542, 100, 40);
		jb.setBackground(new Color(1,87,155));
		jb.setForeground(Color.WHITE);
		jb.setVisible(true);
		Bg.add(jb);										//adding button to Jlabel in 'second' class through its object Bg
		jb.addActionListener(new ActionListener() {			//adding listener to button using anonymos actionlistener class
			public void actionPerformed(ActionEvent arg0) {
				Bg.reset();			//invoking reset function in second class
				Bg.repaint();
				Controller.callmenu();	//invoking callmenu function in controller class
			}
		});
	}
}