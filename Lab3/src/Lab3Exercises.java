import javax.swing.JFrame;

import mypanelclass.MyPanelClass;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("David Carrion Beniquez");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(900, 430);
		myFrame.setSize(200, 200);
		MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
		myFrame.setVisible(true);
	}
}