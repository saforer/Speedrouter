import java.awt.*;

import javax.swing.*;
import javax.swing.tree.*;


public class PathPanel extends JPanel {
	
	public PathPanel() {
		setLayout(new BorderLayout(0, 0));
		
		DefaultMutableTreeNode top = new DefaultMutableTreeNode("SOTN Total");
		JTree tree = new JTree(top);
		add(tree, BorderLayout.CENTER);
		
		FillTree(top);
	}

	private void FillTree(DefaultMutableTreeNode treeTop){
		DefaultMutableTreeNode pathFolder = null;
		DefaultMutableTreeNode pathUnit = null;
		
		pathFolder = new DefaultMutableTreeNode("Chapel");
		treeTop.add(pathFolder);
		
			pathUnit = new DefaultMutableTreeNode("ChapelPt1");
			pathFolder.add(pathUnit);
			
			pathUnit = new DefaultMutableTreeNode("ChapelPt2");
			pathFolder.add(pathUnit);
			
			pathUnit = new DefaultMutableTreeNode("ChapelPt3");
			pathFolder.add(pathUnit);
		
		
		pathFolder = new DefaultMutableTreeNode("Hippogriff");
		treeTop.add(pathFolder);
		
			pathUnit = new DefaultMutableTreeNode("HippogriffPt1");
			pathFolder.add(pathUnit);
			
			pathUnit = new DefaultMutableTreeNode("HippogriffPt2");
			pathFolder.add(pathUnit);
			
			pathUnit = new DefaultMutableTreeNode("HippogriffPt3");
			pathFolder.add(pathUnit);
		
	}
}
