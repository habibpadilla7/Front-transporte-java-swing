package model;

public class Driver {
	private int typeIdentification;
	private int numberIdentification;
	private String name;
	private String address;
	private String city;
	private String department;
	private String country;
	private int phone;
	private int vehicle_id;
	
	public int getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public int getTypeIdentification() {
		return typeIdentification;
	}
	public void setTypeIdentification(int typeIdentification) {
		this.typeIdentification = typeIdentification;
	}
	public int getNumberIdentification() {
		return numberIdentification;
	}
	public void setNumberIdentification(int numberIdentification) {
		this.numberIdentification = numberIdentification;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	

	@Override
	public String toString() {
	        return typeIdentification + " \t"
	        		+numberIdentification + " \t"
	        		+name + " \t"
	        		+address + " \t"
	        		+city + " \t"
	        		+department + " \t"
	        		+country + " \t"
	        		+phone+"".toString();
	}
	
	

}
