package PlayPanel.WestPanel;

import java.awt.Dimension;

import javax.swing.JPanel;

import Graphics.GlobalGraphic;
import MainFrame.MainFrame;

public class WestPanel extends JPanel{
	public SpeedPanel speedPanel;
	public ItemPanel itemPanel;
	
	public WestPanel(){
		setBackground(GlobalGraphic.character);
		setPreferredSize(new Dimension(150,0));
		
		String itemPath=GlobalGraphic.path+"WestPanel/";
		String speedPath=GlobalGraphic.path+"WestPanel/";
		
		speedPanel = new SpeedPanel(speedPath,"SpeedPanel",130,150);
		itemPanel = new ItemPanel(itemPath,"ItemPanel",130,240);
		
		add(speedPanel);
		add(itemPanel);
	}

}
