/**
 * @author Ania
 *
 */
import java.io.Serializable;

/**
 * This class create all features of ordered position.
 * It cointains method which calculate the discount if the amount of items exceed 5
 *
 */


public class Position implements Serializable{


	private static final long serialVersionUID = 1L;
	private String _nameOfItem;
	private int _amount;
	private double _price;

	
	/**
	 * class constructor
	 * @param nameOfItem sets to name of the position 
	 * @param amount sets value to amount of the item
	 * @param price sets value to price of the item
	 */
	public Position(String nameOfItem, int amount, double price) {
		this._nameOfItem = nameOfItem;
		this._amount = amount;
		this._price = price;
	}

	
	/**
	 * method caculate total price ordered position considering its amount
	 * @return value of ordered position
	 */
	public double calculateValue() {
		return  _amount * _price;
	}

	/**
	 * method readout all features ordered position
	 * @return string with name, price, amount and total value. if th
	 */
	
	public String toString() {
		return String.format("%15s", _nameOfItem) + String.format("%10s", _price) + String.format("%4s", _amount)
				+ String.format("%10s", calculateValue()) + String.format("%10s", calculateValueWithDiscount());
	}
	
	/**
	 * Setter name of position
	 * @param name of position
	 */

	public void setName(String name) {
		this._nameOfItem = name;
	}

	/**
	 * Getter name of position
	 * @return name of position
	 */
	public String getName() {
		return _nameOfItem;
	}
	
	/**
	 * Setter amount of position
	 * @param amount of position
	 */
	public void setAmount(int amount){
		this._amount = amount;
	}
	
	/**
	 * Getter amount of position
	 * @return amount of position
	 */
	public int getAmount() {
		return _amount;
	}
	
	/**
	 * Setter price of position
	 * @param price of position
	 */
	public void setPrice(double price){
		this._price = price;
	}
	
	/**
	 * Getter price of position
	 * @return price of position
	 */
	public double getPrice() {
		return _price;
	}
	
	/**
	 * method calculate total value with discount if the amount of the position is greater than 5
	 * if amount of item is greater than 5 and less or equal than 10 the discount is 5%
	 * if amount of item is greater than 10 and less or equal than 20 the discount is 10%
	 * if amount of item is greater than 20 the discount is 15%
	 * @return method return calculate value with or without discount
	 *
	 */
	public double calculateValueWithDiscount() {
		double discount = calculateValue();
		if (getAmount() >= 5 && getAmount() <= 10) {
			discount = (double) (calculateValue() * 0.95);
			//System.out.print(" You got 5% discount for "+ getName()+"! Price: "+ discount);
		} else if (getAmount() > 10 && getAmount() <= 20) {
			discount = (double) (calculateValue() * 0.9);
			//System.out.print(" You got 10% discount for "+ getName()+"! Price: "+ discount);
		} else if (getAmount() > 20) {
			discount = (double) (calculateValue() * 0.85);
			//System.out.print(" You got 15% discount for "+ getName()+"! Price: "+ discount);
		} 
			
		return discount;
	}
}
