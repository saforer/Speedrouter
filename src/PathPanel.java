import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreeSelectionModel;


public class PathPanel extends JPanel {
	private JTree pathTree;
				
	public PathPanel() {
		setLayout(new BorderLayout(0, 0));
		
		pathTree = new JTree(getExamplePath());
		pathTree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		
		pathTree.addTreeSelectionListener(new TreeSelectionListener() {
		    public void valueChanged(TreeSelectionEvent e) {
		        Path node = (Path) pathTree.getLastSelectedPathComponent();

		    /* if nothing is selected */ 
		        if (node == null) return;

		    /* retrieve the node that was selected */
		        Path temp = node;
		        
		    /* React to the node selection. */
		        String tempName = temp.name;
		        UpdateWindowName(tempName);
		    }
		});
		
		JScrollPane treeScrollView = new JScrollPane(pathTree);
		add(treeScrollView);
	}
	
	public void UpdateWindowName(String inName) {
		JFrame topFrame = (JFrame)SwingUtilities.getWindowAncestor(this);
		topFrame.setTitle(inName);
	}
	
	
	public Path getExamplePath() {
		Path top = new Path("Wind Waker");
		Path temp;
		Path temp2;
		
		Path outset = new Path("Outset", top);
		top.AddChild(outset);
		
		temp = new Path("Start Game", outset);
		outset.AddChild(temp);

		temp = new Path("Tower Sidehop", outset);
		outset.AddChild(temp);

		temp = new Path("Grandma's House", outset);
		outset.AddChild(temp);

		temp = new Path("100 Rupees", outset);
		outset.AddChild(temp);

		temp = new Path("Savewarp", outset);
	
		outset.AddChild(temp);

		temp = new Path("Aryll for Telescope", outset);
		outset.AddChild(temp);

		temp = new Path("Zoom in on Postman", outset);
		outset.AddChild(temp);

		temp = new Path("Sidehop off Tower", outset);
		outset.AddChild(temp);

		temp = new Path("Orca's House", outset);
		outset.AddChild(temp);

		temp = new Path("Sword Training", outset);
		outset.AddChild(temp);

			temp2 = new Path("Phases 1-3", temp);
			temp.AddChild(temp2);
			
			temp2 = new Path("Phases 4-5", temp);
			temp.AddChild(temp2);

		temp = new Path("Exit Orca's House", outset);
		outset.AddChild(temp);

		temp = new Path("Enter FOF", outset);
		outset.AddChild(temp);

		temp = new Path("Save Tetra", outset);
		outset.AddChild(temp);

		temp = new Path("Shield", outset);
		outset.AddChild(temp);

		temp = new Path("Talk to Tetra", outset);
		outset.AddChild(temp);

		temp = new Path("Nico Rope game", outset);
		outset.AddChild(temp);

		temp = new Path("Spoils bag", outset);
		outset.AddChild(temp);

		temp = new Path("Savewarp", outset);
		outset.AddChild(temp);

		temp = new Path("Ladder to Tetra", outset);
		outset.AddChild(temp);
		
		
		return top;
	}
}


