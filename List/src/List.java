/**
 * @author Ania
 *
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;



/**
 * This class create an array with capacity given by users. The array stores numbers. 
 *
 */

public class List {
	private int[] _numbers;
	private int _capacity;
	private int _size = -1;
	
	/**
	 * Class constructor. It attribute capacity to the array
	 * @param capacity it's attribute to the size of array
	 */

	public List(int capacity) {
		this._capacity = capacity;
		_numbers = new int[_capacity];
	}
 /**
  * This method add new element to array. When the list is full message is displayed
  * @param element it's a number which will be add to the array
  */
	public void addElement(int element) {
		_size += 1;
		if (_size >= _capacity)
			System.out.println("List is full!");
		_numbers[_size] = element;
	}

	/**
	 * This method is looking for given element in an array.
	 * @param element it's a number which is looking for in an array
	 * @return method returns index of the searched number or -1 if the number doesnt occure
	 */
	public int find(int element) {

		boolean flag = true;
		for (int i = 0; i <= _size; i++) {
			if (_numbers[i] == element) {
				System.out.println("Search element is in the position number: ");
				flag = false;
				return i;

			}
		}
		if (flag)
			return -1;
		return 0;
	}
	/**
	 * Method writes all numbers which contains the array 
	 */
	public void elements() {
		for (int i = 0; i <= _size; i++) {
			System.out.print(_numbers[i] + " ");
		}
	}

	/**
	 * Method writes all features an array(size, capacity) with all elements located in a list 
	 */
	
	public void write() {
		System.out.println(String.format("\nSize:%s \nCapacity:%s", _size, _capacity));
		System.out.println("Elements: ");
		elements();
	}

	/**
	 * This method removes the first occurrence of a number given as a parameter if it is on the list, i.e. if the number appears more than once, only the first occurrence is deleted 
	 * @param element it's a searched number
	 */
	
	public void removeFirst(int element) {
		int count = 0;
		for (int i = 0; i <= _size; i++) {
			if (_numbers[i] == element) {
				count += 1;
				if (count > 1) {
					for (i = 0; i <= _size; i++) {
						if (_numbers[i] == element) {
							for (i += 1; i <= _size; i++) {
								_numbers[i - 1] = _numbers[i];
							}
							_size -= 1;
						}
					}
				}
			}
		}
		
	}
 
	/**
	 * Method remove all elements repeating in the list.
	 * After execut this method there should be only single number, without repetitions
	 */
	public void removeRepeating() {
		for (int i = 0; i <= _size - 1; i++) {
			for (int j = i + 1; j <= _size; j++) {
				if (_numbers[i] == _numbers[j]) {
					int k = i;
					int l = j;
					for (i += 1; i <= _size; i++) {
						_numbers[i - 1] = _numbers[i];
					}
					_size -= 1;
					i = k;
					j = l - 1;
					// System.out.println("\n"+ j + " " + i);
				}
			}
		}
		System.out.println("\n"+_size);
	}
	/**
	 * This method revers the list. First element becomes last, last becomes firs and so on
	 * 
	 */
	public void revers() {
		int j = 0;
		for (int i = 0; i <= _size / 2; i++) {
			int a = _numbers[i];
			_numbers[i] = _numbers[_size - j];
			_numbers[_size - j] = a;
			j++;
		}
	}

	/**
	 * This method write all array elements to the file
	 * @param nameFile it's a name of the file
	 * @throws IOException signals that an I/O exception of some sort has occurred. It is the general class of exceptions
	 */
	public void writeToFile(String nameFile) throws IOException {
		BufferedWriter outputWriter = null;
		outputWriter = new BufferedWriter(new FileWriter(nameFile));
		for (int i = 0; i <= _size; i++) {
			outputWriter.write(Integer.toString(_numbers[i]));
			outputWriter.newLine();
		}
		outputWriter.flush();
		outputWriter.close();
	}
}
