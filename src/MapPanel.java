import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;


public class MapPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public MapPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);

	}

}
