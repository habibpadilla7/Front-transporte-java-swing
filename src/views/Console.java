package views;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import model.Company;
import controller.CompanyController;


import java.awt.*;
import java.util.ArrayList;

public class Console extends JPanel {
	JTextArea textPane;
	DefaultTableModel model;

	public JTable table = new JTable();

	public Console() {
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(600, 400));
		add(scrollPane);
		

		
	}

	public void updateConsole() {
		ArrayList<Company> employees = CompanyController.getInstance().getCompanys();
		Object[] columnNames = { "Deptno", "Empno", "Name","Hiredate","Job","Management","Salary"};
		 model = new DefaultTableModel(new Object[0][0], columnNames);
		StringBuilder builder = new StringBuilder();
		for (Company employee : employees) {
			//builder.append(employee.toString());

			Object[] o = new Object[7];
			o[0] = employee.getAddress();
			o[1] = employee.getCity();
			o[2] = employee.getName();
			model.addRow(o);

			

			//builder.append("\n");
		}

		//textPane.setText(builder.toString());
		table.setModel(model);
	}

	public void clear() {
		model.setRowCount(0);
		CompanyController.getInstance().restart();
	}
}
