import java.util.Date;

import java.util.ArrayList;

public class Lloguer {
	private Date data;
	private int dies;
	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	public Lloguer(Date data, int dies, ArrayList<Vehicle> vehicles) {
		this.data = data;
		this.dies = dies;
		this.vehicles = vehicles;
	}
	public Lloguer(Date date, int i, Vehicle vehicleBasic) {
		this.data = data;
		this.dies = dies;
		this.vehicles = new ArrayList<Vehicle>();
		this.vehicles.add(vehicleBasic);
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
}
