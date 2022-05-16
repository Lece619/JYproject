package mainView;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class ViewSizeTest extends JFrame{
	
	Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	int screenHeight = dimension.height*3/4;
	int screenWidth = dimension.height/2;
	
	public ViewSizeTest() {
		setTitle("테스트");
		setBounds(dimension.width-screenWidth,dimension.height-screenHeight,screenWidth,screenHeight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ViewSizeTest();
	}
}
