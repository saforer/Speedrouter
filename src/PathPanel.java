import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;


public class PathPanel extends JPanel {
	public PathPanel() {
		setLayout(new BorderLayout(0, 0));
		
		DefaultMutableTreeNode top = new DefaultMutableTreeNode("SOTN Total");
		
		FillTree(top);
		
		JTree tree = new JTree(top);
		add(tree, BorderLayout.CENTER);
		
		//Shouldn't this line go "What is the parent of this panel... The MainFrame (JFrame) is the parent of this panel!"
		JFrame topFrame = (JFrame)this.getParent();
		
		//"So I can now set the title OF that main frame to be equal to "Test"
		topFrame.setTitle("Test");
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
