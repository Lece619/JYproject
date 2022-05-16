package mainView;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class ViewSizeTest extends JFrame{
	
	Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	int screenHeight = dimension.height*3/4;
	int screenWidth = dimension.height/2;
	
	
}
