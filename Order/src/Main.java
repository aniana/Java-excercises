/**
 * @author Ania
 *
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException {
		/*Order firstOrder = new Order();
		createObject("skirt", 120, 65, firstOrder);
		createObject("dress", 5, 119, firstOrder);
		createObject("shirt", 12, 34, firstOrder);
		createObject("blouse", 3, 55, firstOrder);
		System.out.println(firstOrder.toString());
		//firstOrder.editPosition(2);
		createObject("blouse", 53, 55, firstOrder);*/
		Order firstOrder = loadOrder("Order.bin");
		System.out.println(firstOrder.toString());
		//writeOrder(firstOrder,"Order.bin");
		
	}
	/** 
	* Method creat a new object with given argument and add it to the list of ordered items
	* @param nameOfItem it's name of the ordered position
	* @param amount it's amount of the ordered item
	* @param price it's a price of ordered position
	* @param firstOrder it's an object of class order which helps to add new object to the list
	*/
	
	public static void createObject(String nameOfItem, int amount, double price, Order firstOrder) {
		Position position = new Position(nameOfItem, amount, price);
		System.out.println(position.toString());
		firstOrder.addPosition(position);
		//position.calculateValueWithDiscount();
	}
	/**
	 * this method write object to the file
	 * @param o it is an object which will be write to the file 
	 * @param nameFile it's a name of file
	 * @throws IOException signals that an I/O exception of some sort has occurred. It is the general class of exceptions
	 */
	public static void writeOrder(Order o, String nameFile) throws IOException{
		try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nameFile))) {
		    outputStream.writeObject(o);
		}
		catch (Exception e){
			System.out.println("Error");
		}
	}
	
	/**
	 * this method helps load written file with objects
	 * @param nameFile it's a name of create file
	 * @return it returns written objects
	 * @throws IOException signals that an I/O exception of some sort has occurred. It is the general class of exceptions
	 */
	public static Order loadOrder(String nameFile) throws IOException{
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nameFile))) {
		    Order order = (Order) inputStream.readObject();
		    //System.out.println(order);
		    return order;
		}
		catch(Exception e){
			System.out.println("Error");
			
		}
		return null;
		
	}
}
