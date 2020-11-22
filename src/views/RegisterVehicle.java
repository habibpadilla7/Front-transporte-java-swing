package views;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

import application.Main;
import controller.StatuController;
import controller.VehicleController;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import services.ServiceGenerator;
import repository.RestEndPoint;
import model.Statu;
import model.Vehicle;
import views.RegisterVehicle;


public class RegisterVehicle extends JFrame {
	
	private JTextField tplaque;
	private JTextField tmotor;
	private JTextField tchassis;
	private JTextField tmodel;
	private JTextField tregistrationDate;
	private JTextField tseatedPassengers;
	private JTextField tstandingPassengers;
	private JTextField tweight;
	private JTextField tdry;
	private JTextField tgrossWeight;
	private JTextField tnumberDoors;
	private JTextField tbrand;
	private JTextField tline;
	private JTextField tcompany;
	private JTextField tid;
	private JComboBox cstate;
	
	private JLabel lplaque;
	private JLabel lmotor;
	private JLabel lchassis;
	private JLabel lmodel;
	private JLabel lseatedPassengers;
	private JLabel lstandingPassengers;
	private JLabel lweight;
	private JLabel ldry;
	private JLabel lbrand;
	private JLabel lgrossWeight;
	private JLabel lline;
	private JLabel lstate;
	private JButton submit;
	private JButton edit;
	
	public void CloseJframe() {
		super.dispose();
	}
	
	public RegisterVehicle() {
		
		 super("Registrar Vehiculo");
		 JPanel panelDatos = new JPanel();
		 panelDatos.setLayout(null);

		 lplaque=new JLabel("Placa del vehiculo");
		 lplaque.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 lplaque.setBounds(50,30,250,30);
		 panelDatos.add(lplaque);
		 tplaque = new JTextField();
		 tplaque.setBounds(247,30, 286, 30);
		 panelDatos.add(tplaque); 
		 
		 JButton buscar = new JButton("Buscar");
		 buscar.addActionListener(e -> searchVehicle());
		 buscar.setBounds(540,30, 90, 30);
		 panelDatos.add(buscar); 
		 
	     lmotor = new JLabel("Motor");
	     lmotor.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 lmotor.setBounds(50,70,250,30);
		 panelDatos.add(lmotor);
	     tmotor = new JTextField();
	     tmotor.setBounds(247, 70, 286, 30);
		 panelDatos.add(tmotor);

		 lchassis= new JLabel("Chasis");
		 lchassis.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 lchassis.setBounds(50,110,250,30);
		 panelDatos.add(lchassis);
		 tchassis = new JTextField();
		 tchassis.setBounds(247, 110, 286, 30);
		 panelDatos.add(tchassis);
		 
		 lmodel =new JLabel("Modelo");
		 lmodel.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 lmodel.setBounds(50,150,250,30);
		 panelDatos.add(lmodel);
		 tmodel = new JTextField();
		 tmodel.setBounds(247, 150, 286, 30);
		 panelDatos.add(tmodel);
		 
		 JLabel lregistrationDate=new JLabel("Fecha de matricula");
		 lregistrationDate.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 lregistrationDate.setBounds(50,190,250,30);
		 panelDatos.add(lregistrationDate);
		 tregistrationDate = new JTextField();
		 tregistrationDate.setBounds(247, 190, 286, 30);
		 panelDatos.add(tregistrationDate);
		 
		  
	     lseatedPassengers=new JLabel("Pasajeros Sentados");
	     lseatedPassengers.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 lseatedPassengers.setBounds(50,230,250,30);
		 panelDatos.add(lseatedPassengers);
	     tseatedPassengers = new JTextField();
	     tseatedPassengers.setBounds(247, 230, 286, 30);
		 panelDatos.add(tseatedPassengers);
		 
	     lstandingPassengers=new JLabel("pasajeros de Pie");
	     lstandingPassengers.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 lstandingPassengers.setBounds(50,270,250,30);
		 panelDatos.add(lstandingPassengers);
	     tstandingPassengers = new JTextField();
	     tstandingPassengers.setBounds(247, 270, 286, 30);
		 panelDatos.add(tstandingPassengers);
		 
		 lweight = new JLabel("Peso");
		 lweight.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 lweight.setBounds(50,310,250,30);
		 panelDatos.add(lweight);
		 tweight = new JTextField();
		 tweight.setBounds(247, 310, 286, 30);
		 panelDatos.add(tweight);
		 
		 ldry =new JLabel("Seco");
		 ldry.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 ldry.setBounds(50,350,250,30);
		 panelDatos.add(ldry);
		 tdry = new JTextField();
		 tdry.setBounds(247, 350, 286, 30);
		 panelDatos.add(tdry);
		 
		 lgrossWeight =new JLabel("Peso Bruto");
		 lgrossWeight.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 lgrossWeight.setBounds(50, 390,250,30);
		 panelDatos.add(lgrossWeight);
		 tgrossWeight = new JTextField();
		 tgrossWeight.setBounds(247, 390, 286, 30);
		 panelDatos.add(tgrossWeight);
		 
		 JLabel lnumberDoors=new JLabel("Cantidad de puertas");
		 lnumberDoors.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 lnumberDoors.setBounds(50,430,250,30);
		 panelDatos.add(lnumberDoors);
		 tnumberDoors = new JTextField();
		 tnumberDoors.setBounds(247, 430, 286, 30);
		 panelDatos.add(tnumberDoors);
		 
		 tcompany = new JTextField();
		 tcompany.setText(""+Main.getMainInstance().getCompany_id());
		 panelDatos.add(tcompany);
		 tcompany.setVisible(false);
		 
		 tid = new JTextField();
		 panelDatos.add(tcompany);
		 tid.setVisible(false);

	     lbrand =new JLabel("Marca");
	     lbrand.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 lbrand.setBounds(50,470,250,30);
		 panelDatos.add(lbrand);
	     tbrand = new JTextField();
	     tbrand.setBounds(247, 470, 286, 30);
		 panelDatos.add(tbrand);
		 
	     lline = new JLabel("Linea");
	     lline.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 lline.setBounds(50,510,250,30);
		 panelDatos.add(lline);
	     tline = new JTextField();
	     tline.setBounds(247, 510, 286, 30);
		 panelDatos.add(tline);
		 
		 
		 lstate =new JLabel("Estado del vehiculo");
		 lstate.setFont(new java.awt.Font("Tahoma", 0, 16)); 
		 lstate.setBounds(50,550,250,30);
		 panelDatos.add(lstate);
		 
		 ArrayList<Statu> sta= StatuController.getInstance().fetchNexts();
		 try {
			   Thread.sleep(3*1000);
		}
		catch (Exception e) {
			   System.out.println(e);
		}
		 DefaultComboBoxModel model = new DefaultComboBoxModel();
		 model.addElement("Seleccione el estado del vehiculo");
		 for (Statu pruebo : sta) {
				Object[] o = new Object[2];
				o[0] = pruebo.getId();
				o[1] = pruebo.getName();
				model.addElement(o[1]);
		 }
		 cstate= new JComboBox(model);
	     cstate.setBounds(247, 550, 286, 30);
		 panelDatos.add(cstate);
		 
		 
		 Container cp = getContentPane();
		 cp.add(panelDatos, BorderLayout.CENTER);
		 
		 JPanel panelBotones = new JPanel();
		 panelBotones.setLayout(new FlowLayout());
		 submit = new JButton("Ingresar Vehiculo");
		 submit.addActionListener(e -> createNewVehicle());
		 
		 edit = new JButton("Actualizar Vehiculo");
		 edit.addActionListener(e -> EditVehicle());
		 edit.setVisible(false);

			
		 panelBotones.add(submit);
		 panelBotones.add(edit);
		 cp.add(panelBotones, BorderLayout.SOUTH);
		
	}
	
	private void searchVehicle() {
		
		VehicleController.getInstance().fetchNextById(tplaque.getText());
		try {
			   Thread.sleep(3*1000);
		}
		catch (Exception e) {
			   System.out.println(e);
		}
		ArrayList<Vehicle> vehicle = new ArrayList<>();
		vehicle = VehicleController.getInstance().getVehicles();

		tmotor.setText(""+vehicle.get(0).getMotor());
		tmotor.disable();
		cstate.setSelectedIndex(vehicle.get(0).getState_id());
		tchassis.setText(vehicle.get(0).getChassis());
		tchassis.disable();
		tmodel.setText(vehicle.get(0).getModel());
		tmodel.disable();
		tregistrationDate.setText(vehicle.get(0).getRegistrationDate());
		tregistrationDate.disable();
		tseatedPassengers.setText(""+vehicle.get(0).getSeatedPassengers());
		tseatedPassengers.disable();
		tstandingPassengers.setText(""+vehicle.get(0).getStandingPassengers());
		tstandingPassengers.disable();
		tweight.setText(vehicle.get(0).getWeight());
		tweight.disable();
		tdry.setText(vehicle.get(0).getDry());
		tdry.disable();
		tgrossWeight.setText(vehicle.get(0).getGrossWeight());
		tgrossWeight.disable();
		tnumberDoors.setText(""+vehicle.get(0).getNumberDoors());
		tnumberDoors.disable();
		tbrand.setText(vehicle.get(0).getBrand());
		tbrand.disable();
		tline.setText(vehicle.get(0).getLine());
		tline.disable();
		tcompany.setText(""+vehicle.get(0).getCompany_id());
		tid.setText(""+vehicle.get(0).getId());
		submit.setVisible(false);
		edit.setVisible(true);
		
	}
	private void EditVehicle() {
		// form vehicle
		
		Vehicle vehicle = new Vehicle();
		vehicle.setPlaque(tplaque.getText());
		vehicle.setMotor(tmotor.getText());
		vehicle.setState_id(cstate.getSelectedIndex());
		vehicle.setChassis(tchassis.getText());
		vehicle.setModel(tmodel.getText());
		vehicle.setRegistrationDate(tregistrationDate.getText());
		vehicle.setSeatedPassengers(Integer.parseInt(tseatedPassengers.getText()));
		vehicle.setStandingPassengers(Integer.parseInt(tstandingPassengers.getText()));
		vehicle.setWeight(tweight.getText());
		vehicle.setDry(tdry.getText());
		vehicle.setGrossWeight(tgrossWeight.getText());
		vehicle.setNumberDoors(Integer.parseInt(tnumberDoors.getText()));
		vehicle.setBrand(tbrand.getText());
		vehicle.setLine(tline.getText());
		vehicle.setCompany_id(Integer.parseInt(tcompany.getText()));
		System.out.println(tplaque.getText()+"   "+tmotor.getText()+"   "+cstate.getSelectedIndex()+"   "+tchassis.getText()+"   "+tmodel.getText()+"   "+tregistrationDate.getText()+"   "+tseatedPassengers.getText()+"   "+tstandingPassengers.getText()+"   "+tweight.getText()+"   "+tdry.getText()+"   "+tgrossWeight.getText()+"   "+tnumberDoors.getText()+"   "+tbrand.getText()+"   "+tline.getText());
		
		ServiceGenerator.createService(RestEndPoint.class).editVehicle(vehicle, Integer.parseInt(tid.getText()))
		.enqueue(new Callback<Void>() {
			@Override
			public void onResponse(Call<Void> call, Response<Void> response) {
				if (response.isSuccessful()) {
					JOptionPane.showMessageDialog(null, "Vehiculo fue Actualizado con exito");
					CloseJframe();
					
				} else {
					JOptionPane.showMessageDialog(null, "Falla en la actualizacion del vehiculo");
				}
			}

			@Override
			public void onFailure(Call<Void> call, Throwable t) {
				JOptionPane.showMessageDialog(null, "porfavor intentelo de nuevo");
			}
		});
	}
	private void createNewVehicle() {
		// form vehicle
		
		Vehicle vehicle = new Vehicle();
		vehicle.setPlaque(tplaque.getText());
		vehicle.setMotor(tmotor.getText());
		vehicle.setState_id(cstate.getSelectedIndex());
		vehicle.setChassis(tchassis.getText());
		vehicle.setModel(tmodel.getText());
		vehicle.setRegistrationDate(tregistrationDate.getText());
		vehicle.setSeatedPassengers(Integer.parseInt(tseatedPassengers.getText()));
		vehicle.setStandingPassengers(Integer.parseInt(tstandingPassengers.getText()));
		vehicle.setWeight(tweight.getText());
		vehicle.setDry(tdry.getText());
		vehicle.setGrossWeight(tgrossWeight.getText());
		vehicle.setNumberDoors(Integer.parseInt(tnumberDoors.getText()));
		vehicle.setBrand(tbrand.getText());
		vehicle.setLine(tline.getText());
		vehicle.setCompany_id(Main.getMainInstance().getCompany_id());
		System.out.println(tplaque.getText()+"   "+tmotor.getText()+"   "+cstate.getSelectedIndex()+"   "+tchassis.getText()+"   "+tmodel.getText()+"   "+tregistrationDate.getText()+"   "+tseatedPassengers.getText()+"   "+tstandingPassengers.getText()+"   "+tweight.getText()+"   "+tdry.getText()+"   "+tgrossWeight.getText()+"   "+tnumberDoors.getText()+"   "+tbrand.getText()+"   "+tline.getText());
		
		ServiceGenerator.createService(RestEndPoint.class).addVehicle(vehicle).enqueue(new Callback<Void>() {
			@Override
			public void onResponse(Call<Void> call, Response<Void> response) {
				if (response.isSuccessful()) {
					JOptionPane.showMessageDialog(null, "Vehiculo fue creada con exito");
					CloseJframe();
				} else {
					JOptionPane.showMessageDialog(null, "Falla en la creacion del vehiculo");
				}
			}

			@Override
			public void onFailure(Call<Void> call, Throwable t) {
				System.out.println("porfavor intentelo de nuevo");
			}
		});
	}


	

}
