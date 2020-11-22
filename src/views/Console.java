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
		ArrayList<Company> companys = CompanyController.getInstance().getCompanys();
		Object[] columnNames = { "Placa", "Tipo Identificacion Empresa", "N° Identificacion Empresa", "Nombre Empresa", "Cantidad Conductores vinculados al vehiculo"};
		 model = new DefaultTableModel(new Object[0][0], columnNames);
		StringBuilder builder = new StringBuilder();
		for (Company company : companys) {
			//builder.append(company.toString());

			Object[] o = new Object[7];
			o[1] = company.getTypeIdentification();
			o[2] = company.getNumberIdentification();
			o[3] = company.getName();
			
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
