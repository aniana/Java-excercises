
public class Motorcycle extends Vehicle {

	/**
	 * This is class constructor with static parameters: weight, height, length, width,  number of wheels, max od speed and max acceleration.
	 * @param name. It is name of motorcycle
	 * @param state. State indicates whether the motorcycle is broken or not
	 */
	public Motorcycle(String name, boolean state) {
		super(200, 2, 200, 20, name, 1, 1.5, 0.5, state);

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
