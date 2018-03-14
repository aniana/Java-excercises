/**
 * @author Ania
 *
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Order implements Serializable{
	
	/**
	 * This class is a list with ordered items. 
	 * List allows adding new position, editing it and removing. 
	 * Methods in this class calculate total value of the order, increase amount of the position by adding given amount and readout all position with total price
	 */
	private static final long serialVersionUID = 1L;
	List<Position> list = new ArrayList<Position>();
	private int _addCounter = 0;
	private int _maxAmountOfPosition;
	
	/**
	 * class constructor without arguments
	 */
	public Order() {
		_maxAmountOfPosition = 10;
	}
	
	/**
	 * class constructor with an argument
	 * @param maxAmountOfPosition define the maximum number of items in the order
	 */
	public Order(int maxAmountOfPosition) {
		this._maxAmountOfPosition = maxAmountOfPosition;
	}
	

	/**
	 * method increases amount of position with given index
	 * @param amount increases the amount of position
	 * @param index is an item index  which amount is increasing
	 */
	public void increaseAmount(int amount, int index){
		list.get(index).setAmount(list.get(index).getAmount() + amount);
	}

	
	/**
	 * method which adds the given position to the orders 
	 * method  will append an object if it is not already in the array 
	 * otherwise method increases its amount
	 * @param p is an ordered item
	 */
	public void addPosition(Position p) {
		boolean flag = true;
		for (int i = 0; i < list.size(); i++) {
			if (p.getName().equals(list.get(i).getName())) {
				System.out.println("Object has been found. Its amount has been increased");
				increaseAmount(p.getAmount(),i);
				flag = false;
				break;
			}	
		}
		if (flag)
			list.add(p);
		_addCounter++;
	}
	
	/**
	 * method calculate value of position (item)
	 * if the amount is greater than 5 it calculates the order value of a given item with a discount which depends on the number of pieces
	 * @return method returns all ordering items with total value
	 */
	public double calculateValue() {
		double sum = 0;
		for (int i = 0; i < list.size(); i++)
			if (list.get(i).getAmount() >= 5)
				sum += list.get(i).calculateValueWithDiscount();
			else
				sum += list.get(i).calculateValue();
		return sum;
	}
	
	/**
	 * method readout all order positions with summing values
	 * @see java.lang.Object#toString()
	 * @return method returns a list of ordered items and the total value of the order
	 */
	public String toString() {
		String names = "";
		for (int i = 0; i < list.size(); i++) {

			names += list.get(i).getName() +" ";
		}
		return names + calculateValue();
	}
	
	
	/**
	 * method removes position with given index
	 * @param index. It is index of position  which will be remove
	 */
	
	public void removePosition(int index){
		list.remove(index);
	}
	
	
	/**
	 * method allows to edit the selected order item
	 * @param index. It is position index where we want to edit name, amount or price
	 */
	public void editPosition(int index){
		System.out.println("Set new name of item, amount of this and its price.");
		Scanner input = new Scanner(System.in);
		System.out.println("Give name: ");
		String name = input.nextLine();
		System.out.println("amount: ");
		int amount = input.nextInt();
		System.out.println("price: ");
		double price = input.nextDouble();
		list.get(index).setName(name);
		list.get(index).setAmount(amount);
		list.get(index).setPrice(price);
	}
	
}
