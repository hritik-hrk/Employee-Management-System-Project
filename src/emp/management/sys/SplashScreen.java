package emp.management.sys;

import java.awt.Image;

import javax.swing.*;

public class SplashScreen extends JFrame{
	
	SplashScreen() {
		//take the icons on the Jframe 
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.gif"));
		
		//store it into other var i2 to give size
		Image i2 = i1.getImage().getScaledInstance(1200,600,Image.SCALE_DEFAULT);
		
		//pass it to the other 
		ImageIcon i3 = new ImageIcon(i2);
		
		//Jlabel is used to print the text, image on the Jframe
		JLabel image = new JLabel(i3);
		
		//give the length and width 
		image.setBounds(0,0,1200,600);
		
		//using add() add image/text to Jframe
		add(image);
		
		
		
		setSize(1200, 600);//length and width of UI Frame
		setLocation(130,80);;
		setLayout(null);
		setVisible(true);//To see the UI 
	
		
		try {
			Thread.sleep(5000);
			setVisible(false);
			new Login();
	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new SplashScreen();
	}

}
