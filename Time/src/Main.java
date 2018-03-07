
public class Main {

	public static void main(String[] args) {
		Time time = new Time(5,230);
		Time time2 = new Time(1,140);
		System.out.println(time.toString());
		System.out.println(time.addTime(time2));
		System.out.println(time.subTime(time2));
		System.out.println(time.multiTime(3));
		Time [] array = new Time[3];
		array[0] = time;
		array[1] = time;
		array[2] = time2;
		System.out.println(Time.append(array,2));
	}

}
