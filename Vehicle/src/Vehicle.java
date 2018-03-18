
/**
 * @author Ania
 *
 */
public class Vehicle {
	protected double _weight;
	protected int _numberOfWheels;
	protected double _maxOfSpeed;
	protected double _maxAcceleration;
	protected String _name;
	protected double _length;
	protected double _width;
	protected double _height;
	protected boolean _state;
	
	/**
	 * This class creates a vehicle with couple of charecters such as weight, number of wheels, name, max speed, max acceleration, height, length, width and state.
	 * It's features are written by toString function
	 */
	public Vehicle(){}
	
	
	/**
	 * Class constructor. 
	 * @param weight. It is weight specific vehicle 
	 * @param numberOfWheels. It is an amount of wheels of specific vehicle
	 * @param maxOfSpeed. It is speed which specific vehicle could obtain
	 * @param maxAcceleration. It is max acceleration assigned to specific vehicle
	 * @param name. It is a name of adds vehicle
	 * @param height. It is height of specific vehicle
	 * @param length.It is length of specific vehicle 
	 * @param width. It is width of specific vehicle
	 * @param state. State indicates whether the vehicle is broken or not
	 */
	public Vehicle(double weight, int numberOfWheels, double maxOfSpeed, double maxAcceleration, String name, 
			double height, double length, double width, boolean state) {
		this._weight = weight;
		this._numberOfWheels = numberOfWheels;
		this._maxOfSpeed = maxOfSpeed;
		this._maxAcceleration = maxAcceleration;
		this._name = name;
		this._height = height;
		this._length = length;
		this._width = width;
		this._state = stateMethod(state);
	}

	
	/**
	 * This method writes statement that vheicle works good or not
	 * @param state. It takes the true (if it works good) or false if isn't
	 * @return true or false
	 */
	public boolean stateMethod(boolean state){
		if(state){
			System.out.println("The vehicle works good");}
		System.out.println("the vehicle works bad");
		return state;
	}


	
	/**
	 * There are  getters and setters all implemented fields
	 */
	
	public double get_length() {
		return _length;
	}

	public void set_length(double _length) {
		this._length = _length;
	}

	public double get_width() {
		return _width;
	}

	public void set_width(double _width) {
		this._width = _width;
	}

	public double get_height() {
		return _height;
	}

	public void set_height(double _height) {
		this._height = _height;
	}

	public boolean get_state() {
		return _state;
	}

	public void set_state(boolean _state) {
		this._state = _state;
	}
	
	public double get_weight() {
		return _weight;
	}
	public void set_weight(double weight) {
		this._weight = weight;
	}
	public int get_numberOfWheels() {
		return _numberOfWheels;
	}
	public void set_numberOfWheels(int numberOfWheels) {
		this._numberOfWheels = numberOfWheels;
	}
	public double get_maxOfSpeed() {
		return _maxOfSpeed;
	}
	public void set_maxOfSpeed(double maxOfSpeed) {
		this._maxOfSpeed = maxOfSpeed;
	}
	public double get_maxAcceleration() {
		return _maxAcceleration;
	}
	public void set_maxAcceleration(double maxAcceleration) {
		this._maxAcceleration = maxAcceleration;
	}
	public String get_name() {
		return _name;
	}
	public void set_name(String name) {
		this._name = name;
	}
	
	
	/**
	 * This method writes all features of specific vehicle
	 * @return. It returns string with name of vehicle, it's weight, height and so on
	 */
	public String getString(){
		return 	_name + String.format("\nWeight: %s", _weight) + String.format( "\nNumber of wheels: %s", _numberOfWheels ) + 
				String.format( "\nMax of speed: %s", _maxOfSpeed ) + String.format( "\nMax acceleration: %s", _maxAcceleration ) + 
				String.format( "\nHeight: %s", _height ) + String.format( "\nLength: %s", _length ) + String.format( "\nWidth: %s", _width );
	}
	
}
