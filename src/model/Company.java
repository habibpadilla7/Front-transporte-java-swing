package model;

public class Company {
	private int typeIdentification;
	private int numberIdentification;
	private String name;
	private String address;
	private String city;
	private String department;
	private String country;
	private int phone;
	private int repreLTypeIdentification;
	private int repreLNumberIdentification;
	private String repreLName;
	private String repreLAddress;
	private String repreLCity;
	private String repreLDepartment;
	private String repreLCountry;
	private int repreLPhone;
	public int getRepreLTypeIdentification() {
		return repreLTypeIdentification;
	}
	public void setRepreLTypeIdentification(int repreLTypeIdentification) {
		this.repreLTypeIdentification = repreLTypeIdentification;
	}
	public int getRepreLNumberIdentification() {
		return repreLNumberIdentification;
	}
	public void setRepreLNumberIdentification(int repreLNumberIdentification) {
		this.repreLNumberIdentification = repreLNumberIdentification;
	}
	public String getRepreLName() {
		return repreLName;
	}
	public void setRepreLName(String repreLName) {
		this.repreLName = repreLName;
	}
	public String getRepreLAddress() {
		return repreLAddress;
	}
	public void setRepreLAddress(String repreLAddress) {
		this.repreLAddress = repreLAddress;
	}
	public String getRepreLCity() {
		return repreLCity;
	}
	public void setRepreLCity(String repreLCity) {
		this.repreLCity = repreLCity;
	}
	public String getRepreLDepartment() {
		return repreLDepartment;
	}
	public void setRepreLDepartment(String repreLDepartment) {
		this.repreLDepartment = repreLDepartment;
	}
	public String getRepreLCountry() {
		return repreLCountry;
	}
	public void setRepreLCountry(String repreLCountry) {
		this.repreLCountry = repreLCountry;
	}
	public int getRepreLPhone() {
		return repreLPhone;
	}
	public void setRepreLPhone(int repreLPhone) {
		this.repreLPhone = repreLPhone;
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
	        		+phone + " \t"
	        		+country.toString();
	 }

}
