package views;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import application.Main;
import controller.CompanyController;

public class MainView extends JPanel  {
	
	private static final int WINDOW_WIDTH = 1000;
    private static final int WINDOW_HEIGHT = 700;


	public MainView() {
		JPanel panelDatos = new JPanel();
		panelDatos.setLayout(null);
		JButton getNextBtn = new JButton("Consultar");
		getNextBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				getNextList();
			}
		});
		add(getNextBtn);

		JButton clearConsole = new JButton("Registrar Conductor");
		clearConsole.addActionListener(e -> openFrameD());
		add(clearConsole);

		JButton btnNewButton = new JButton("Registrar Vehiculo");
		btnNewButton.setBounds(19, 72, 200, 35);
		panelDatos.add(btnNewButton);
		btnNewButton.addActionListener(e -> openFrameV());
		add(btnNewButton);
		add(clearConsole);
		
	}
	private void openFrameD() {
		RegisterDriver rc = new RegisterDriver();
		Dimension windowSize = new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT);
		rc.setMinimumSize(windowSize);
		rc.setMaximumSize(windowSize);
		rc.setBounds(810, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
		//rc.setDefaultCloseOperation(rc.DISPOSE_ON_CLOSE);
		rc.setVisible(true);
	}
	private void openFrameV() {
		RegisterVehicle rc = new RegisterVehicle();
		Dimension windowSize = new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT);
		rc.setMinimumSize(windowSize);
		rc.setMaximumSize(windowSize);
		rc.setBounds(910, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
		//rc.setDefaultCloseOperation(rc.DISPOSE_ON_CLOSE);
		rc.setVisible(true);
	}

	private void getNextList() {
		CompanyController.getInstance().fetchNext();
	}

}
