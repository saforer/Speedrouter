import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;


public class ResPanel extends JPanel {
	private JTable table;
	
	
	public ResPanel() {
		setLayout(new BorderLayout(0, 0));
		Object[][] data = {};
		Object[] names = {"Amount", "Resource"};
		
		table = new JTable(data, names);
		
		
		add(table, BorderLayout.CENTER);

	}
	
	public void UpdateTable(List<Resource> inResourceList) {
		Object[] names = {"Amount", "Resource"};
		DefaultTableModel tempModel = new DefaultTableModel(names, 0);
		
		for (int i = 0; i < inResourceList.size(); i++) {
			tempModel.addRow(new Object[] {inResourceList.get(i).amount, inResourceList.get(i).name});
		}
		
		table.setModel(tempModel);
		((AbstractTableModel)table.getModel()).fireTableDataChanged();
	}
}
