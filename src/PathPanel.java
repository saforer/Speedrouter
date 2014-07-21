import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;


public class PathPanel extends JPanel {
	public String nodeName = null;
	
	public PathPanel() {
		setLayout(new BorderLayout(0, 0));
		
		DefaultMutableTreeNode top = new DefaultMutableTreeNode("Total Path");
		JTree tree = new JTree(top);
		add(tree, BorderLayout.CENTER);
		
		tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		
		tree.addTreeSelectionListener(new TreeSelectionListener() {
		    public void valueChanged(TreeSelectionEvent e) {
		        DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();

		    /* if nothing is selected */ 
		        if (node == null) return;

		    /* retrieve the node that was selected */ 
		        Object nodeInfo = node.getUserObject();
		        
		        SetSelectedNode(node);
		    }
		});
		
		FillTree(top);
	}
	
	private void SetSelectedNode(DefaultMutableTreeNode node) {
		nodeName = node.toString();
	}
	
	public String getActiveNode() {
		return nodeName;
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
