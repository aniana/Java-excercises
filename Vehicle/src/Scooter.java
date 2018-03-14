
public class Scooter extends Vehicle {

	/**
	 * This is class constructor with static parameters: weight, height, length, width,  number of wheels, max od speed and max acceleration.
	 * @param name. It is name of scooter
	 * @param state. State indicates whether the scooter is broken or not
	 */
	public Scooter(String name, boolean state) {
		super(110, 2, 100, 5, name, 1, 1.5, 0.6, state);
	}
	/**
	 * This method written statement that vehicle works good or not
	 * @param state. It takes the true (if it works good) or false if isn't
	 * @return true or false
	 */
	public boolean stateMethod(boolean state) {
		if (state) {
			System.out.println("The "+ _name + " works good");
		} else {
			System.out.println("the "+ _name + " works bad");
		}
		return state;
	}

}
