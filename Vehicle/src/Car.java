
public class Car extends Vehicle {

	/**
	 * This is class constructor with fixed parameters: weight,  number of wheels, max od speed and max acceleration.
	 * @param name. It is name of car
	 * @param state. State indicates whether the car is broken or not
	 */
	public Car(String name, double height, double length, double width, boolean state) {
		super(1500, 4, 200, 10, name, height, length, width, state);

	}

	/**
	 * This method writes statement that vehicle works good or not
	 * @param state. It takes the true (if it works good) or false if isn't
	 * @return true or false
	 */
	public boolean stateMethod(boolean state) {
		if (state) {
			System.out.println("The "+ _name +" works good");
		} else {
			System.out.println("the "+ _name+ " works bad");
		}
		return state;
	}

}
