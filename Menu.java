package Universe;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

//Class for showing MainMenu Screen
public class Menu {
	public static JLabel BgImageLabel;			//creating JLabel's object
Menu(){				//Constructor
	ImageIcon icon = new ImageIcon("C:\\Users\\Sheraz Ahmed\\Downloads\\backgroundimage.jpg"); 		//setting background image
	//setting attributes
	BgImageLabel= new JLabel();
	BgImageLabel.setIcon(icon);
	BgImageLabel.setBounds(0,0,800,612);
	BgImageLabel.setLayout(null);
	BgImageLabel.setVisible(false);
	
	
	//creating Label
	JLabel l = new JLabel("               Stellar Crush");
	//setting attributes
	l.setBounds(110, 20, 500, 50);
	l.setFont(new Font("Comic Sans MS", 00, 36));
	l.setForeground(new Color(1,87,155));
	l.setVisible(true);
	BgImageLabel.add(l);		//adding into BgImageLabel
	
	//creating textfield
	JTextField l1 = new JTextField("	               Main Menu");
	//setting attributes
	l1.setBounds(0, 100, 800, 50);
	l1.setFont(new Font("Comic Sans MS", 00, 30));
	l1.setBackground(new Color(1, 87, 155));
	l1.setForeground(Color.white);
	l1.setEditable(false);
	l1.setVisible(true);
	BgImageLabel.add(l1);				//adding into BgImagelabel

	//creating Buttons on mainmenu
	JButton start=new JButton("Start Game");
	JButton Help=new JButton("Help");
	JButton Credits=new JButton("Credits");
	JButton Quit=new JButton("Quit");
	
	//setting attributes
	start.setBounds(320, 230, 150, 50);
	start.setBackground(new Color(1, 87, 155));
	start.setVisible(true);
	start.setForeground(Color.white);
	start.setFont(new Font("Comic Sans MS", 00, 20));
	start.addActionListener(new ActionListener() {			//adding listener through anonymous actionlistener class
		public void actionPerformed(ActionEvent arg0) {
			Controller.callgamepane();
		}
	});
	BgImageLabel.add(start);

	Help.setBounds(320, 300, 150, 50);
	Help.setForeground(Color.WHITE);
	Help.setBackground(new Color(1, 87, 155));
	Help.setVisible(true);
	Help.setFont(new Font("Comic Sans MS", 00, 20));
	BgImageLabel.add(Help);
	Help.addActionListener(new ActionListener() {		//adding listener through anonymous actionlistener class
		public void actionPerformed(ActionEvent arg0) {
			Controller.callinstructions();
		}
	});

	Credits.setBounds(320, 370, 150, 50);
	Credits.setBackground(new Color(1, 87, 155));
	Credits.setVisible(true);
	Credits.setForeground(Color.white);
	Credits.setFont(new Font("Comic Sans MS", 00, 20));
	BgImageLabel.add(Credits);
	Credits.addActionListener(new ActionListener() {			//adding listener through anonymous actionlistener class
		public void actionPerformed(ActionEvent arg0) {
			Controller.callcredits();
		}
	});

	Quit.setBounds(320, 440, 150, 50);
	Quit.setBackground(new Color(1, 87, 155));
	Quit.setVisible(true);
	Quit.setForeground(Color.white);
	Quit.setFont(new Font("Comic Sans MS", 00, 20));
	BgImageLabel.add(Quit);
	Quit.addActionListener(new ActionListener() {				//adding listener through anonymous actionlistener class
		public void actionPerformed(ActionEvent arg0) {
		System.exit(0);
		}
	});
}
}