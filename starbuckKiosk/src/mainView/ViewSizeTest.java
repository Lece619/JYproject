package mainView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class ViewSizeTest extends JFrame{
	
	Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	int screenHeight = dimension.height*3/4;
	int screenWidth = screenHeight*3/4;
	
	public ViewSizeTest() {
		setTitle("테스트");
		setBounds(dimension.width-screenWidth,dimension.height-100-screenHeight,screenWidth,screenHeight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		makePanel(1);
		makePanel(1);
		makePanel(1);
		setVisible(true);
	}
	public void makePanel(int num) {
		JPanel newOne = new JPanel();
		newOne.setBackground(Color.cyan);
		setVisible(true);
		newOne.setBorder(new LineBorder(Color.blue,2));
		add(newOne);
	}
	
	public static void main(String[] args) {
		new ViewSizeTest();
	}
}
