package model;


public class Vehicle {
	private int id;
	private String plaque;
	private String motor;
	private String chassis;
	private String model;
	private String registrationDate;
	private int seatedPassengers;
	private int standingPassengers;
	private String weight;
	private String dry;
	private String grossWeight;
	private int numberDoors;
	private String brand;
	private String line;
	private int state_id;
	private int company_id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
	public int getState_id() {
		return state_id;
	}
	public void setState_id(int state_id) {
		this.state_id = state_id;
	}
	public String getPlaque() {
		return plaque;
	}
	public void setPlaque(String plaque) {
		this.plaque = plaque;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public String getChassis() {
		return chassis;
	}
	public void setChassis(String chassis) {
		this.chassis = chassis;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	public int getSeatedPassengers() {
		return seatedPassengers;
	}
	public void setSeatedPassengers(int seatedPassengers) {
		this.seatedPassengers = seatedPassengers;
	}
	public int getStandingPassengers() {
		return standingPassengers;
	}
	public void setStandingPassengers(int standingPassengers) {
		this.standingPassengers = standingPassengers;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getDry() {
		return dry;
	}
	public void setDry(String dry) {
		this.dry = dry;
	}
	public String getGrossWeight() {
		return grossWeight;
	}
	public void setGrossWeight(String grossWeight) {
		this.grossWeight = grossWeight;
	}
	public int getNumberDoors() {
		return numberDoors;
	}
	public void setNumberDoors(int numberDoors) {
		this.numberDoors = numberDoors;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	
	@Override
	public String toString() {
	        return plaque + " \t"
	        		+motor + " \t"
	        		+chassis + " \t"
	        		+model + " \t"
	        		+registrationDate + " \t"
	        		+seatedPassengers + " \t"
	        		+standingPassengers + " \t"
	        		+weight + " \t"
	        		+dry + " \t"
	        		+grossWeight + " \t"
	        		+numberDoors + " \t"
	        		+brand + " \t"
	        		+line+"".toString();
	}

}
