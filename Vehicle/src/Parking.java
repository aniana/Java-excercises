/*
 * This class adds vehilces to the parking list if it meets the requires
 */
public class Parking extends VehicleList {

	protected double _maxHeight;
	protected double _maxLength;
	protected double _maxWidth;
	protected double _maxWeight;

	/**
	 * This is class constructor.
	 * @param maxHeight. this is the max height that a vehicle can have in order to be let in the parking
	 * @param maxLength. this is the max length that a vehicle can have in order to be let in the parking
	 * @param maxWidth. this is the max width that a vehicle can have in order to be let in the parking
	 * @param maxWeight. this is the max weight that a vehicle can have in order to be let in the parking
	 */
	public Parking(double maxHeight, double maxLength, double maxWidth, double maxWeight) {
		this._maxHeight = maxHeight;
		this._maxLength = maxLength;
		this._maxWidth = maxWidth;
		this._maxWeight = maxWeight;
	}

	
	/* 
	 * This method adding vehicles to the list with vehicles with specific dimensions. 
	 * If vehicle meets requirements it can be added to the list
	 */
	
	@Override
	public void addVehicle(Vehicle vehicle) {

		if (vehicle.get_height() > _maxHeight) {
			System.out.println(vehicle.get_name() + " is too high");
		}
		else if (vehicle.get_length() > _maxLength) {
			System.out.println(vehicle.get_name() + " is too long");
		}
		else if (vehicle.get_width() > _maxWidth) {
			System.out.println(vehicle.get_name() + " is too wide");
		} 
		else if (vehicle.get_weight() > _maxWeight) {
			System.out.println(vehicle.get_name() + " is too heavy");

		} 
		else {
			super.addVehicle(vehicle);
		}

	}
}