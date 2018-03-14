
/*
 * This class add broken vehicle to the workshop and "repairs" it.
 * When the vehicle is repaired it is removed from the list and from the workshop
 */
public class Workshop extends VehicleList {

	
	/* 
	 * This method adds vehicle to the workshop if it is broken.
	 * Otherwise suitable statement is displayed
	 * 
	 */
	@Override
	public void addVehicle(Vehicle vehicle) {
		if (vehicle._state)
			System.out.println("The " + vehicle.get_name() + " isn't broken. It doesn't need to be repair");
		else
			super.addVehicle(vehicle);
	}

	
	/** This method adds object with specific index to the list with broken vehicle. 
	 * If it is broken it "repairs" the vehicle and removes it from workshop so from list too
	 * @param index. It is vehicle index in the list
	 * @throws IndexOutOfBoundsException. It catches mistakes for example if object with given index doesn't exist
	 */
	public void repair(int index) throws IndexOutOfBoundsException {
		try {
			if (vehicleList.get(index).get_state())
				System.out.println(vehicleList.get(index).get_name() + "doesn't need to be repair");
			else {
				vehicleList.get(index).set_state(true);
				System.out.println(vehicleList.get(index).get_name() + " is already repaired");
				vehicleList.remove(index);
			}
		}
		catch (IndexOutOfBoundsException e){
		System.out.println("Workshop is empty");
		}
	}

}
