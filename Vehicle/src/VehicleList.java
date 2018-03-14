import java.util.ArrayList;

public class VehicleList{

	ArrayList<Vehicle> vehicleList;
	
	public VehicleList(){
		super();
		vehicleList = new ArrayList<Vehicle>();
	}
	
	public void addVehicle(Vehicle vehicle){
		vehicleList.add(vehicle);
	}
	
	public void removeVehicle(int index){
		vehicleList.remove(index);
	}
	
	public void show(){
		for (int i = 0; i < vehicleList.size(); i++){
			System.out.println(vehicleList.get(i).getString());
		}
	}
	
	public void showIndex(int index){
		System.out.println(vehicleList.get(index).getString());
	}
}
