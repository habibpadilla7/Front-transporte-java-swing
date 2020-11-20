package views;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

import controller.VehicleController;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import services.ServiceGenerator;
import repository.RestEndPoint;

import model.Driver;
import model.Vehicle;
import views.RegisterDriver;


public class RegisterDriver extends JFrame {
	
	private JTextField ndi;
	private JTextField tnombre;
    private JTextField tdireccion;
    private JTextField tciudad;
	private JTextField tdepartamento;
	private JTextField tpais;	
	private JTextField ttelefono;
	private JComboBox cvehi,tdi;
	private DefaultComboBoxModel modelvh;
	private JLabel ltdi;
	private JLabel lndi;
	
	
	public RegisterDriver() {
		super("Registrar Conductor");

		JPanel panelDatos = new JPanel();
		panelDatos.setLayout(null);
		JLabel lvehiculo =new JLabel("vehiculo");
		lvehiculo.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		lvehiculo.setBounds(50,450,250,40);
		 panelDatos.add(lvehiculo);
		cvehi= new JComboBox();
		cvehi.setBounds(350, 450, 250, 40);
		panelDatos.add(cvehi);
		ArrayList<Vehicle> veh= VehicleController.getInstance().fetchNexts();
		try {
			   Thread.sleep(3*1000);
		}
		catch (Exception e) {
			   System.out.println(e);
		}
		modelvh = new DefaultComboBoxModel();
		modelvh.addElement("Seleccione el vehiculo");
			System.out.println("que paso aqui");
		for (Vehicle pruebo : veh) {
				
			System.out.println(pruebo.getPlaque());
			Object[] o = new Object[2];
			o[0] = pruebo.getPlaque();
			o[1] = pruebo.getPlaque();
			modelvh.addElement(o[1]);
		}
		cvehi.setModel(modelvh);
			

		ltdi=new JLabel("Tipo de identificacion");
		ltdi.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		ltdi.setBounds(50,50,250,40);
		panelDatos.add(ltdi);
		DefaultComboBoxModel modelI = new DefaultComboBoxModel();
		modelI.addElement("Seleccione Tipo Identificacion");
		modelI.addElement("Cedula");
		modelI.addElement("Cedula de Extranjeria");
		modelI.addElement("Nit");
		tdi = new JComboBox(modelI);
		tdi.setBounds(350, 50, 250, 40);
		 
		panelDatos.add(tdi);
		 
		 lndi=new  JLabel("Numero de identificacion");
		 lndi.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 lndi.setBounds(50,100,250,40);
		 panelDatos.add(lndi);
		 ndi = new JTextField();
		 ndi.setBounds(350, 100, 250, 40);
		 panelDatos.add(ndi);
		 
		 JLabel lnombre=new JLabel("Nombre");
		 lnombre.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 lnombre.setBounds(50,150,250,40);
		 panelDatos.add(lnombre);
		 tnombre = new JTextField();
		 tnombre.setBounds(350, 150, 250, 40);
		 panelDatos.add(tnombre);
		 
		 JLabel ldireccion=new JLabel("direccion");
		 ldireccion.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 ldireccion.setBounds(50,200,250,40);
		 panelDatos.add(ldireccion);
	     tdireccion = new JTextField();
	     tdireccion.setBounds(350, 200, 250, 40);
		 panelDatos.add(tdireccion);
		 
		 JLabel lciudad=new JLabel("ciudad");
		 lciudad.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 lciudad.setBounds(50,250,250,40);
		 panelDatos.add(lciudad);
	     tciudad = new JTextField();
	     tciudad.setBounds(350, 250, 250, 40);
		 panelDatos.add(tciudad);
		 
		 JLabel ldepartamento =new JLabel("departamento");
		 ldepartamento.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 ldepartamento.setBounds(50,300,250,40);
		 panelDatos.add(ldepartamento);
		 tdepartamento = new JTextField();
		 tdepartamento.setBounds(350, 300, 250, 40);
		 panelDatos.add(tdepartamento);
		 
		 JLabel lpais=new JLabel("pais");
		 lpais.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 lpais.setBounds(50,350,250,40);
		 panelDatos.add(lpais);
		 tpais = new JTextField();
		 tpais.setBounds(350, 350, 250, 40);
		 panelDatos.add(tpais);
		 
		 JLabel ltelefono =new JLabel("telefono");
		 ltelefono.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 ltelefono.setBounds(50,400,250,40);
		 panelDatos.add(ltelefono);
		 ttelefono = new JTextField();
		 ttelefono.setBounds(350, 400, 250, 40);
		 panelDatos.add(ttelefono);
		 Container cp = getContentPane();
		 cp.add(panelDatos, BorderLayout.CENTER);			 
		 
		 JPanel panelBotones = new JPanel();
		 panelBotones.setLayout(new FlowLayout());
		 JButton submit = new JButton("Ingresar Conductor");
		 submit.addActionListener(e -> createNewDriver());

			
		 panelBotones.add(submit);
		 cp.add(panelBotones, BorderLayout.SOUTH);
		
	}

	private void createNewDriver() {
		// form driver
		Driver driver = new Driver();
		driver.setTypeIdentification(tdi.getSelectedIndex());
		driver.setNumberIdentification(Integer.parseInt(ndi.getText()));
		driver.setName(tnombre.getText());
		driver.setAddress(tdireccion.getText());
		driver.setCity(tciudad.getText());
		driver.setDepartment(tdepartamento.getText());
		driver.setCountry(tpais.getText());
		driver.setPhone(Integer.parseInt(ttelefono.getText()));
		driver.setVehicle_id(cvehi.getSelectedIndex());

		ServiceGenerator.createService(RestEndPoint.class).addDriver(driver).enqueue(new Callback<Void>() {
			@Override
			public void onResponse(Call<Void> call, Response<Void> response) {
				if (response.isSuccessful()) {
					JOptionPane.showMessageDialog(null, "Conductor fue creada con exito");
					ndi.setText("");
					tnombre.setText("");
					tdireccion.setText("");
					tciudad.setText("");
					tdepartamento.setText("");
					tpais.setText("");
					ttelefono.setText("");
				} else {
					JOptionPane.showMessageDialog(null, "Falla en la creacion de conductor");
				}
			}

			@Override
			public void onFailure(Call<Void> call, Throwable t) {
				System.out.println("porfavor intentelo de nuevo");
			}
		});
	}

}
