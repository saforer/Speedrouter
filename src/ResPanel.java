import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTable;


public class ResPanel extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public ResPanel() {
		setLayout(new BorderLayout(0, 0));
		
		table = new JTable();
		add(table, BorderLayout.CENTER);

	}

}
