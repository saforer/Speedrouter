import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;


public class ResPanel extends JPanel {
	private JTable table;
	private Object[][] data = {{1,"Test"},{2,"Testing"}};
	
	public ResPanel() {
		setLayout(new BorderLayout(0, 0));
		
		Object[] names = {"Amount", "Resource"};
		
		table = new JTable(data, names);
		
		
		add(table, BorderLayout.CENTER);

	}
	
	public void UpdateTable(List<Resource> inResourceList) {		
		data = ListToObject(inResourceList);
		 ((AbstractTableModel) table.getModel()).fireTableDataChanged();
	}
	
	private Object[][] ListToObject(List<Resource> inResources) {
		Object[][] temp = new Object[2][inResources.size() + 1];
		
		for (int i = 0; i < inResources.size(); i++) {			
			temp[0][i] = inResources.get(i).amount;
			temp[1][i] = inResources.get(i).name;
		}
		
		return temp;
	}
}
