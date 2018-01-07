package Universe;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JOptionPane;

//Class that controls the flows of program and contain main method too
public class Controller implements ControllerInterface {		//implementing 'ControllerInterface' interface
	static Menu menu=new Menu();						//creating object of 'Menu' class
	static View view=new View();						//creating object of 'View' class
	static Instructions inst=new Instructions();		//creating object of 'Instructions' class
	static Credits cdt=new Credits();					//creating object of 'Credits' class
	static GamePane pane=new GamePane();				//creating object of 'GamePane' class
	static second s=new second();						//creating object of 'second' class
	
	public static void main(String args[]){				// main method
		callmenu(); // invoking callmenu method at the start of program
	}
	
	//function for showing main menu screen
	public static void callmenu(){
		pane.Bg.setVisible(false);
		inst.ImageLabel.setVisible(false);
		cdt.Label.setVisible(false);
		menu.BgImageLabel.setVisible(true);
		view.add(menu.BgImageLabel); 		//adding into Frame in View Class
		view.setFocusable(true);
		view.addKeyListener(new KeyListener() {  //to start game by pressing any key on menu screen
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				if(menu.BgImageLabel.isVisible()==true){
				callgamepane();
				}
			}
		});
		
		menu.BgImageLabel.repaint();
	}
	
	//function for showing instructions screen
	public static void callinstructions(){
		menu.BgImageLabel.setVisible(false);
		inst.ImageLabel.setVisible(true);
		view.add(inst.ImageLabel);			//adding into Frame in View Class
		inst.ImageLabel.repaint();
	}
	
	//function for showing credits screen
	public static void callcredits(){
		menu.BgImageLabel.setVisible(false);
		cdt.Label.setVisible(true);
		view.add(cdt.Label);				//adding into Frame in View Class
		cdt.Label.repaint();
	}
	
	//function for showing playfield of the game
	public static void callgamepane(){
		menu.BgImageLabel.setVisible(false);
		pane.Bg.setVisible(true);
		view.add(pane.Bg);					//adding panel in 'gamepane' class into Frame in View Class
		
		//adding keylistener to move userplanet from arrow keys using anonymos keylistener class
		view.addKeyListener(new KeyListener() {    
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
			}
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int code=e.getKeyCode();		//obtaing code upon pressing key
		//		view.setFocusable(true);
				if(code==KeyEvent.VK_UP){if(second.userplanet.getY() >= 00){second.userhieghtloc-=3;}}	//moving upward
				if(code==KeyEvent.VK_DOWN){if(second.userplanet.getY() <= 540){second.userhieghtloc+=3;}}	//moving downward
				if(code==KeyEvent.VK_RIGHT){if(second.userplanet.getX() <= 750){second.userwidthloc+=3;}}	//moving rightward
				if(code==KeyEvent.VK_LEFT){if(second.userplanet.getX() >= 00){second.userwidthloc-=3;}}		//moving leftward
				if(code==KeyEvent.VK_M){s.reset();callmenu();}		// exits from game
				System.out.println("=> x = "+ second.userplanet.getX()+"\t=> y = "+second.userplanet.getY());
				if (second.size >= 100) {		//Wining condition
					JOptionPane.showMessageDialog(null,
							"Congratulations!\n***You have crossed size of 100***\n*****You Won*****");
					
					s.reset();			//resets all the objects and everything on screen
					callmenu();				//show main menu screen
				}
				s.userplanet.setBounds(second.userwidthloc, second.userhieghtloc, 40, 40);		//changing location of user planet upon pressing keys
				pane.Bg.repaint();			//repaint method refresh all objects on screen
			}
		} );
		pane.p.repaint();
		pane.Bg.repaint();
	}
}