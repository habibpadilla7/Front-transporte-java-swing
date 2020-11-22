package views;

import java.awt.*;
import javax.swing.*;
import javax.swing.JOptionPane;

import application.Main;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import services.ServiceGenerator;
import repository.RestEndPoint;

import model.Company;
import views.RegisterCompany;

public class RegisterCompany extends JFrame {

	private JTextField ndi;
	private JTextField tnombre;
    private JTextField tdireccion;
    private JTextField tciudad;
	private JTextField tdepartamento;
	private JTextField tpais;	
	private JTextField ttelefono;
	private JTextField ndil;
	private JTextField tnombrel;
    private JTextField tdireccionl;
    private JTextField tciudadl;
	private JTextField tdepartamentol;
	private JTextField tpaisl;	
	private JTextField ttelefonol;
	private JComboBox tdi,tdil;
	
	public void CloseJframe() {
		super.dispose();
	}
	
	public RegisterCompany() {
		
		 super("Registrar Empresa de transporte");
		 //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

		 JPanel panelDatos = new JPanel();
		 panelDatos.setLayout(null);
		 
		 JLabel lde= new JLabel("Datos de la Empresa");		 
		 lde.setFont(new java.awt.Font("Tahoma", 0, 32)); 
		 lde.setBounds(30,20,540,40);
		 panelDatos.add(lde);
		 
		 JLabel ltdi= new JLabel("Tipo Identificacion Empresa");		 
		 ltdi.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 ltdi.setBounds(50,70,240,30);
		 panelDatos.add(ltdi);
		 DefaultComboBoxModel modelI = new DefaultComboBoxModel();
		 modelI.addElement("Seleccione Tipo Identificacion");
		 modelI.addElement("Cedula");
		 modelI.addElement("Cedula de Extranjeria");
		 modelI.addElement("Nit");
		 tdi = new JComboBox(modelI);
		 
		 tdi.setBounds(270, 70, 200, 30);
		 panelDatos.add(tdi);
		 
		 JLabel lndi= new JLabel("Numero de identificacion");
		 lndi.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 lndi.setBounds(500,70,200,30);
		 panelDatos.add(lndi);
		 ndi = new JTextField();
		 ndi.setBounds(710, 70, 200, 30);
		 panelDatos.add(ndi);
		 
		 
		 JLabel lnombre=new JLabel("Nombre");
		 lnombre.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 lnombre.setBounds(50,120,240,30);
		 panelDatos.add(lnombre);
		 tnombre = new JTextField();
		 tnombre.setBounds(270, 120, 200, 30);
		 panelDatos.add(tnombre);
		 
		 JLabel ldireccion = new JLabel("Direccion");
		 ldireccion.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 ldireccion.setBounds(500,120,200,30);
		 panelDatos.add(ldireccion);
	     tdireccion = new JTextField();
	     tdireccion.setBounds(710, 120, 200, 30);
		 panelDatos.add(tdireccion);
		 
		 
		 JLabel lciudad =new JLabel("Ciudad");
		 lciudad.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 lciudad.setBounds(50,170,250,30);
		 panelDatos.add(lciudad);
	     tciudad = new JTextField();
	     tciudad.setBounds(270, 170, 86, 30);
		 panelDatos.add(tciudad);
		 
		 JLabel ldepartamento = new JLabel("Departamento");
		 ldepartamento.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 ldepartamento.setBounds(500,170,250,30);
		 panelDatos.add(ldepartamento);
		 tdepartamento = new JTextField();
		 tdepartamento.setBounds(710, 170, 86, 30);
		 panelDatos.add(tdepartamento);
		 
		 
		 JLabel lpais = new JLabel("Pais");
		 lpais.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 lpais.setBounds(50,220,250,30);
		 panelDatos.add(lpais);
		 tpais = new JTextField();
		 tpais.setBounds(270, 220, 86, 30);
		 panelDatos.add(tpais);
		 
		 JLabel ltelefono = new JLabel("Telefono");
		 ltelefono.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 ltelefono.setBounds(500,220,250,30);
		 panelDatos.add(ltelefono);
		 ttelefono = new JTextField();
		 ttelefono.setBounds(710, 220, 86, 30);
		 panelDatos.add(ttelefono);
		 
		 
		 JLabel lrl= new JLabel("Representaste legal");		 
		 lrl.setFont(new java.awt.Font("Tahoma", 0, 32)); 
		 lrl.setBounds(30,290,540,40);
		 panelDatos.add(lrl);
		 
		 JLabel ltdil= new JLabel("Tipo Identificacion Empresa");		 
		 ltdil.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 ltdil.setBounds(50,360,240,30);
		 panelDatos.add(ltdil);
		 DefaultComboBoxModel modelIl = new DefaultComboBoxModel();
		 modelIl.addElement("Seleccione Tipo Identificacion");
		 modelIl.addElement("Cedula");
		 modelIl.addElement("Cedula de Extranjeria");
		 modelIl.addElement("Nit");
		 tdil = new JComboBox(modelIl);
		 tdil.setBounds(270, 360, 200, 30);
		 panelDatos.add(tdil);
		 
		 JLabel lndil= new JLabel("Numero de identificacion");
		 lndil.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 lndil.setBounds(500,360,200,30);
		 panelDatos.add(lndil);
		 ndil = new JTextField();
		 ndil.setBounds(710, 360, 200, 30);
		 panelDatos.add(ndil);
		 
		 
		 JLabel lnombrel=new JLabel("Nombre");
		 lnombrel.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 lnombrel.setBounds(50,410,240,30);
		 panelDatos.add(lnombrel);
		 tnombrel = new JTextField();
		 tnombrel.setBounds(270, 410, 200, 30);
		 panelDatos.add(tnombrel);
		 
		 JLabel ldireccionl = new JLabel("Direccion");
		 ldireccionl.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 ldireccionl.setBounds(500,410,200,30);
		 panelDatos.add(ldireccionl);
	     tdireccionl = new JTextField();
	     tdireccionl.setBounds(710, 410, 200, 30);
		 panelDatos.add(tdireccionl);
		 
		 
		 JLabel lciudadl =new JLabel("Ciudad");
		 lciudadl.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 lciudadl.setBounds(50,450,250,30);
		 panelDatos.add(lciudadl);
	     tciudadl = new JTextField();
	     tciudadl.setBounds(270, 450, 86, 30);
		 panelDatos.add(tciudadl);
		 
		 JLabel ldepartamentol = new JLabel("Departamento");
		 ldepartamentol.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 ldepartamentol.setBounds(500,450,250,30);
		 panelDatos.add(ldepartamentol);
		 tdepartamentol = new JTextField();
		 tdepartamentol.setBounds(710, 450, 86, 30);
		 panelDatos.add(tdepartamentol);
		 
		 
		 JLabel lpaisl = new JLabel("Pais");
		 lpaisl.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 lpaisl.setBounds(50,490,250,30);
		 panelDatos.add(lpaisl);
		 tpaisl = new JTextField();
		 tpaisl.setBounds(270, 490, 86, 30);
		 panelDatos.add(tpaisl);
		 
		 JLabel ltelefonol = new JLabel("Telefono");
		 ltelefonol.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 ltelefonol.setBounds(500,490,250,30);
		 panelDatos.add(ltelefonol);
		 ttelefonol= new JTextField();
		 ttelefonol.setBounds(710, 490, 86, 30);
		 panelDatos.add(ttelefonol);
		 
		 
		 Container cp = getContentPane();
		 cp.add(panelDatos, BorderLayout.CENTER);
		 
		 JPanel panelBotones = new JPanel();
		 panelBotones.setLayout(new FlowLayout());
		 JButton submit = new JButton("Ingresar Empresa");
		 submit.addActionListener(e -> createNewCompany());
		 panelBotones.add(submit);
		 
		 cp.add(panelBotones, BorderLayout.SOUTH);
		

	}
	private void createNewCompany() {
		Company company = new Company();
		company.setTypeIdentification(tdi.getSelectedIndex());
		company.setNumberIdentification(Integer.parseInt(ndi.getText()));
		company.setName(tnombre.getText());
		company.setAddress(tdireccion.getText());
		company.setCity(tciudad.getText());
		company.setDepartment(tdepartamento.getText());
		company.setCountry(tpais.getText());
		company.setPhone(Integer.parseInt(ttelefono.getText()));
		
		company.setRepreLTypeIdentification(tdil.getSelectedIndex());
		company.setRepreLNumberIdentification(Integer.parseInt(ndil.getText()));
		company.setRepreLName(tnombrel.getText());
		company.setRepreLAddress(tdireccionl.getText());
		company.setRepreLCity(tciudadl.getText());
		company.setRepreLDepartment(tdepartamentol.getText());
		company.setRepreLCountry(tpaisl.getText());
		company.setRepreLPhone(Integer.parseInt(ttelefonol.getText()));

		ServiceGenerator.createService(RestEndPoint.class).addCompany(company).enqueue(new Callback<Void>() {
			
			@Override
			public void onResponse(Call<Void> call, Response<Void> response) {
				if (response.isSuccessful()) {
					JOptionPane.showMessageDialog(null, "Compañia fue creada con exito");
					CloseJframe();				
				} else {
					JOptionPane.showMessageDialog(null, "Compañia no fue creada");
				}
			}

			@Override
			public void onFailure(Call<Void> call, Throwable t) {
				System.out.println("porfavor intentelo de nuevo");
			}
		});
	}
}
