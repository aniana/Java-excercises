import java.util.ArrayList;

/**
 * @author Ania
 *
 */

public class VehicleList{
/**
 * This class creat a list where all the vehicles will be set. 
 * For example from workshop or parking. 
 *
 */
	
	ArrayList<Vehicle> vehicleList;
	
	/**
	 * Class constructor.
	 * It creates an array where all the vehicles will be set
	 */
	public VehicleList(){
		super();
		vehicleList = new ArrayList<Vehicle>();
	}
	
	/**
	 * This method adds new vehicle to the list
	 * @param vehicle. It is created vehicle
	 */
	public void addVehicle(Vehicle vehicle){
		vehicleList.add(vehicle);
	}
	
	/**
	 * This method removes specific vehicle from the array
	 * @param index. It is an index of removing vehicle
	 */
	public void removeVehicle(int index){
		vehicleList.remove(index);
	}
	
	/**
	 * This method writes all objectes from the list
	 */
	public void show(){
		for (int i = 0; i < vehicleList.size(); i++){
			System.out.println(vehicleList.get(i).getString());
		}
	}
	
	
	/**
	 * This method writes vehicle with specific index
	 * @param index. It is an index of vehicle which will be written
	 */
	public void showIndex(int index){
		System.out.println(vehicleList.get(index).getString());
	}
}
