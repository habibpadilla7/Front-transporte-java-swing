package views;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import application.Main;
import controller.CompanyController;
import model.Company;

public class LoadView  extends JFrame {
	public JComboBox comboBox;
	private Object[] acumulador;
	public JTable table = new JTable();
	private static final int WINDOW_WIDTH = 450;
    private static final int WINDOW_HEIGHT = 250;
	
	public LoadView() {
		JPanel panelDatos = new JPanel();
		panelDatos.setLayout(null);
		comboBox = new JComboBox();
		
		comboBox.setBounds(19, 22, 250, 27);
		panelDatos.add(comboBox);
		ArrayList<Company> compan= CompanyController.getInstance().fetchNexts();
		try {
		   Thread.sleep(3*1000);
		}
		catch (Exception e) {
		   System.out.println(e);
		}
		
		DefaultComboBoxModel model = new DefaultComboBoxModel();
		model.addElement("Seleccione la empresa");
		for (Company employee : compan) {
			Object[] o = new Object[2];
			o[1] = employee.getName();;
			model.addElement(o[1]);
		}
		comboBox.setModel(model);
		
		
		JButton submit = new JButton("Crear nueva Empresa ");
		submit.setBounds(330, 45, 230, 27);
		panelDatos.add(submit);
		submit.addActionListener(e -> createNewCompany());
		
		JLabel lo=new JLabel("Ó");
		lo.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
		lo.setBounds(290,35,50,40);
		panelDatos.add(lo);
		
		submit.addActionListener(e -> createNewCompany());
		JButton ingemp = new JButton("Ingresar Empresa seleccionada");
		ingemp.setBounds(19, 72, 250, 27);
		panelDatos.add(ingemp);
		ingemp.addActionListener(e -> selectCompany());
		
		Container cp = getContentPane();
		cp.add(panelDatos, BorderLayout.CENTER);			 		
	}
	private void createNewCompany() {
		System.out.println("create");
		RegisterCompany rc = new RegisterCompany();
		Dimension windowSize = new Dimension(1000, 700);
		
		rc.setMinimumSize(windowSize);
		rc.setMaximumSize(windowSize);
		rc.setBounds(810, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
		
		//rc.setDefaultCloseOperation(jfi.DISPOSE_ON_CLOSE);
		rc.setVisible(true);
	}
	private void selectCompany() {
		Main.getMainInstance().visiblepantalla(comboBox.getSelectedIndex());
	}

}
