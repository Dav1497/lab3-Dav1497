import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("David Carrion Beniquez");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();
		int width=(int)screenSize.getWidth()/2;
		int height= (int)screenSize.getHeight()/2;
		myFrame.setLocation(width-100,height-100 );
		myFrame.setSize(200, 200);
		myFrame.setVisible(true);
		//hola
	}
}