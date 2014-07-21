import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.border.EmptyBorder;


public class MainFrame extends JFrame {

	private JPanel contentPane;

	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JSplitPane splitPane = new JSplitPane();
		contentPane.add(splitPane, BorderLayout.CENTER);
		
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setLeftComponent(splitPane_1);
		
		JPanel pathPanel = new PathPanel();
		splitPane_1.setLeftComponent(pathPanel);
		
		JPanel resPanel = new ResPanel();
		splitPane_1.setRightComponent(resPanel);
		
		JPanel mapPanel = new MapPanel();
		splitPane.setRightComponent(mapPanel);
		
		if (((PathPanel) pathPanel).getActiveNode() == null) {
			this.setName("Speedrouter");
		} else {
			this.setName(((PathPanel) pathPanel).getActiveNode());
		}
		
		
		}

}
