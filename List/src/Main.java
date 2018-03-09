import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		List newList = new List(6);
		newList.addElement(1);
		newList.addElement(4);
		newList.addElement(3);
		newList.addElement(2);
		newList.addElement(2);
		System.out.println(newList.find(2));
		newList.write();
		newList.removeFirst(2);
		newList.removeRepeating();
		//newList.revers();
		newList.write();
		// newList.writeToFile("List.txt");
	}

}
