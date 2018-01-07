package Universe;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

//Class for Instructions Screen
public class Instructions {
	public static JLabel ImageLabel;		//object of JLabel
	
Instructions(){		//Constructor
	ImageIcon icon = new ImageIcon("C:\\Users\\Sheraz Ahmed\\Downloads\\backgroundimage.jpg"); // setting background image 
	//setting attributes of label
	ImageLabel= new JLabel();
	ImageLabel.setIcon(icon);
	ImageLabel.setBounds(0,0,800,612);
	ImageLabel.setLayout(null);
	ImageLabel.setVisible(false);
	
	//another JLabel
	JLabel l = new JLabel("               Stellar Crush");
	//setting attributes
	l.setBounds(110, 20, 500, 50);
	l.setFont(new Font("Comic Sans MS", 00, 36));
	l.setForeground(new Color(1,87,155));
	l.setVisible(true);
	ImageLabel.add(l);		//adding into ImageLabel

	//creating JTextField
	JTextField l1 = new JTextField("	            Instructions");
	//setting attributes
	l1.setBounds(00, 100, 800, 50);
	l1.setEditable(false);
	l1.setFont(new Font("Comic Sans MS", 00, 30));
	l1.setBackground(new Color(1,87,155));
	l1.setForeground(Color.WHITE);
	l1.setVisible(true);
	l1.repaint();
	ImageLabel.add(l1);		//adding into Imagelabel

	//creating JLabel objects for showing instruction steps
	JLabel l2 = new JLabel();
	JLabel l3 = new JLabel();
	JLabel l4 = new JLabel();
	JLabel l5 = new JLabel();
	JLabel l6 = new JLabel();
	
	//setting attributes
	l2.setVisible(true);
	l2.setBounds(80, 180, 500, 40);
	l2.setFont(new Font("Comic Sans MS", 00, 20));
	l2.setText("1 --> Start the game from Main Menu.");
	l2.setForeground(Color.WHITE);
	
	l3.setVisible(true);
	l3.setBounds(80, 230, 500, 40);
	l3.setFont(new Font("Comic Sans MS", 00, 20));
	l3.setText("2 --> Use arrows to move your planet.");
	l3.setForeground(Color.WHITE);
	
	l4.setVisible(true);
	l4.setBounds(80, 280, 500, 40);
	l4.setFont(new Font("Comic Sans MS", 00, 20));
	l4.setText("3 --> Avoid to collide with other planets.");
	l4.setForeground(Color.WHITE);
	
	l5.setVisible(true);
	l5.setBounds(80, 330, 550, 40);
	l5.setFont(new Font("Comic Sans MS", 00, 20));
	l5.setText("\n4 --> You will win if you reach finish position.");
	l5.setForeground(Color.WHITE);
	
	l6.setVisible(true);
	l6.setBounds(80, 380, 500, 40);
	l6.setFont(new Font("Comic Sans MS", 00, 20));
	l6.setText("\n5 --> You quit game by pressing quit button.");
	l6.setForeground(Color.WHITE);
	
	//adding into ImageLabel
	ImageLabel.add(l2);
	ImageLabel.add(l3);
	ImageLabel.add(l4);
	ImageLabel.add(l5);
	ImageLabel.add(l6);
	
	//creating button
	JButton jb=new JButton("Back");
	//setting attributes
	jb.setFont(new Font("Comic Sans MS",00,20));
	jb.setBounds(100, 500, 100, 40);
	jb.setBackground(new Color(1,87,155));
	jb.setForeground(Color.WHITE);
	ImageLabel.add(jb);		//adding into ImageLabel
	jb.addActionListener(new ActionListener() {			//adding listener through anonymos Actionlistener class
		public void actionPerformed(ActionEvent arg0) {
			Controller.callmenu();
		}
	});
	ImageLabel.repaint();

}
}