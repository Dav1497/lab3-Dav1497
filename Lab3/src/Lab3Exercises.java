import javax.swing.JFrame;

import mypanelclass.MyPanelClass;

public class Lab3Exercises {
	
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("David Carrion Beniquez");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(500, 430);
		myFrame.setSize(500,500);
		MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
		myFrame.setVisible(true);
		System.out.println("Hello");
	}
}