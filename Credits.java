package Universe;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

//Class for credits screen
public class Credits {	
	public static JLabel Label;		//object of JLabel
	
Credits(){		//Constructor
	ImageIcon icon = new ImageIcon("C:\\Users\\Sheraz Ahmed\\Downloads\\backgroundimage.jpg");	//setting background image
	//setting attributes of JLabel
	Label= new JLabel();
	Label.setIcon(icon);
	Label.setBounds(0,0,800,612);
	Label.setLayout(null);
	Label.setVisible(false);
	
	//another Label
	JLabel l = new JLabel("               Stellar Crush");		//JLabel's object
	//setting attributes
	l.setBounds(110, 20, 500, 50);
	l.setFont(new Font("Comic Sans MS", 00, 36));
	l.setForeground(new Color(1,87,155));
	l.setVisible(true);
	Label.add(l); //adding JLabel l into Label
	
	//creating JTextField
	JTextField l1 = new JTextField("	                Credits");		//JTextField's object
	//setting attributes
	l1.setBounds(0, 100, 800, 50);
	l1.setFont(new Font("Comic Sans MS", 00, 30));
	l1.setBackground(new Color(1, 87, 155));
	l1.setForeground(Color.white);
	l1.setEditable(false);
	l1.setVisible(true);
	Label.add(l1);		//adding jtextfield li into Label
	
	//another Label
	JLabel l3 = new JLabel();		//JLabel's object
	//setting attributes
	l3.setVisible(true);
	l3.setBounds(80, 230, 650, 40);
	l3.setFont(new Font("Comic Sans MS", 00, 30));
	l3.setText("O --> Copyrights reserved by 'Henry Gallowey'");
	l3.setForeground(Color.WHITE);
	Label.add(l3);		//adding jlabel l3 into Label
	
	//creating Button
	JButton jb=new JButton("Back");		//JButton's object
	//setting attributes
	jb.setFont(new Font("Comic Sans MS",00,20));
	jb.setBounds(100, 500, 100, 40);
	jb.setBackground(new Color(1,87,155));
	jb.setForeground(Color.WHITE);
	Label.add(jb);		//adding button jb into Label
	jb.addActionListener(new ActionListener() {			//adding listener to button through anonymos class
		public void actionPerformed(ActionEvent arg0) {
			Controller.callmenu();	//invoking calllmenu function in Controller class
		}
	});
}		//end of constructor
}
