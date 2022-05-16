package mainView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import com.sun.xml.internal.ws.api.server.Container;
//그리드 뷁 레이아웃 오바야...
public class ViewSizeTest extends JFrame{
	
	Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	int screenHeight = dimension.height*3/4;
	int screenWidth = screenHeight*3/4;
	GridBagLayout grid = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	JPanel myPanel = new JPanel();
	
	public ViewSizeTest() {
		setTitle("테스트");
		setBounds(dimension.width-screenWidth,dimension.height-100-screenHeight,screenWidth,screenHeight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLayout(grid);
		setLayout(new BorderLayout());
		myPanel.setBounds(dimension.width-screenWidth,dimension.height-100-screenHeight,screenWidth,screenHeight);
		myPanel.setPreferredSize(new Dimension(screenWidth,screenHeight));
		myPanel.setLayout(grid);
		
		makeGridPanel(makePanel(1), 0, 0, 1, 1);
		makeGridPanel(makePanel(1), 1, 0, 1, 1);
		makeGridPanel(makePanel(1), 0, 1, 1, 1);
		makeGridPanel(makePanel(1), 1, 1, 1, 1);
		makeGridPanel(makePanel(1), 0, 2, 1, 1);
		makeGridPanel(makePanel(1), 1, 2, 1, 1);
		java.awt.Container mo = getContentPane();
		System.out.println(mo.getWidth()+"  "+mo.getHeight());
		System.out.println(myPanel.getWidth()+" "+myPanel.getHeight());
		System.out.println(getWidth()+" "+getHeight());
		myPanel.setVisible(true);
		add(myPanel);
		setVisible(true);
	}
	public JPanel makePanel(int num) {
		JPanel newOne = new JPanel();
		newOne.setPreferredSize(new Dimension(myPanel.getWidth()/2,myPanel.getHeight()/3));
		newOne.setBackground(Color.cyan);
		newOne.setVisible(true);
		newOne.setBorder(new LineBorder(Color.blue,2));
		myPanel.add(newOne);
		newOne.setPreferredSize(new Dimension(myPanel.getWidth()/2,myPanel.getHeight()/3));
		System.out.println("생성 높 넓"+newOne.getWidth());
		return newOne;
	}
	
	public void makeGridPanel(JPanel panel,int x,int y,int width, int height) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = width;
		gbc.gridheight = height;
		gbc.fill = GridBagConstraints.BOTH;
		grid.setConstraints(panel, gbc);
	}
	
	public static void main(String[] args) {
		new ViewSizeTest();
	}
}
