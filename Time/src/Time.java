
/**
 * @author Ania
 *
 */


public class Time {

	/**
	 * This class is used to remember given houres and minutes. 
	 * It can appends current period of time to previous and subtracts it. 
	 * There is also a method which multiples current period of the time by the given multiplier
	 */
	private int _hours;
	private int _minutes;
/**
 * Class constructor.
 * @param hours it's attribute to the hours
 * @param minutes it's attribute to the minutes. If there are more than 60 minutes, their value is divided by 60. 
 * The result is added to the value of hours and the rest is the value of minutes
 */
	public Time(int hours, int minutes) {
		this._hours = hours;
		this._minutes = minutes;
		if (_minutes>=60){
			int newHours = _minutes/60 +_hours;
			int newMinutes = _minutes%60;
			this._hours = newHours;
			this._minutes = newMinutes;	
		}
	}
	/** 
	 * Class constructor which based on the given string (as _h _ min)  sets the value of houres and minutes.
	 * This constructor divides given string into parts and takes only first and third components which are the hours and minutes
	 * constructor converts the string to an int values
	 * @param time it's a period of time given by users
	 */
	public Time(String time) {
		String[] temp;
		String delimeter = " ";
		temp = time.split(delimeter);
		try {
			for (int i = 0; i <= 3; i++){
				this._hours = Integer.parseInt(temp[0]);
				this._minutes = Integer.parseInt(temp[2]);
			}
			System.out.println(_hours + " " + _minutes);
		} catch (NumberFormatException e) {
			System.out.println("Error! Enter the correct format in the form: integer h integer min");
		}
	}
	/**
	 * This method write given period of time
	 * @return period of time as a string
	 */
	public String toString(){
		return String.format( "%s h %s min ",_hours, _minutes);
	}
	
	/**
	 * Setter hours of period of the time
	 * @param hours of the period
	 */
	public void setHours(int hours){
		this._hours = hours;
		
	}
	
	/**
	 * Setter minutes of period of the time
	 * @param minutes of the period
	 */
	public void setMinutes(int minutes){
		this._minutes = minutes;
	}
	
	/**
	 * Getter hours of the period of the time
	 * @return hours of the period
	 */
	public int getHours(){
		return _hours;
	}
	
	/**
	 * Getter minutes of the period of the time
	 * @return minutes of the period
	 */
	public int getMinutes(){
		return _minutes;
	}

	/**
	 * This method appends given period of time to the previous one
	 * If the number of minutes obtained after adding is greater than 60  their value is divided by 60. 
	 * The result of division is added to the value of hours and the rest is the value of minutes
	 * @param addTime it's a new period of time given by user which is adds to previous periods
	 * @return new object which is a new increases period
	 */
	public Time addTime(Time addTime){
		Time newTime = new Time(_hours+addTime._hours,_minutes+addTime._minutes);
		int hours;
		int minutes;
		if(newTime._minutes >= 60){
			hours = newTime._minutes/60 + newTime._hours;
			minutes = newTime._minutes%60;
			System.out.println(hours +" "+ minutes);
			return new Time(hours,minutes);
		}
		return newTime;
	}
	
	/**
	 * This method works as the same as previous method called addTime, but given period is subtracts from previous period
	 * @param subTime it's an object being a period of time which will be subtract
	 * @return this method return new time which is difference between current and previous period
	 */
	
	public Time subTime(Time subTime){
		Time newTime = new Time(_hours-subTime._hours,_minutes-subTime._minutes);
		int hours;
		int minutes;
		if(newTime._minutes < 0){
			hours = newTime._hours - 1;
			minutes = 60 + newTime._minutes;
			System.out.println(hours +" "+ minutes);
			return new Time(hours,minutes);
		}
		return newTime;
	}
	
	/**
	 * This method multiplies the period of the time by a given by user multiplier
	 * @param multiplier it's a integer number by which the period of time is to be multiplied
	 * @return it return new period of the time which is the result of multiply obtained by multiplying by given integer
	 */
	public Time multiTime(int multiplier){
		
		int hour = _hours * multiplier;
		int minutes = _minutes * multiplier;
		Time time3 = new Time(hour, minutes);
		if (minutes >=60 ){
			minutes = minutes%60;
			hour += minutes/60;
			new Time (hour, minutes);
		}
		return new Time(hour, minutes);
	}
	
	/** 
	 * This method adds specific number of periods of time sets in the array
	 * @param array it's an array with given elements by user in Main class
	 * @param count it tells how many elements of the array should be added from the beginning
	 * @return it returns an object which is a new period of the time obtained by adding specific number of elements
	 */
	public static Time append(Time [] array, int count){
		int sumHours = 0;
		int sumMinutes = 0;
		System.out.println(array.length);
		for (int i = 0; i <= count; i ++){
			sumHours += array[i]._hours;
			sumMinutes +=array[i]._minutes;
		}
		
		if (sumMinutes>=60){
			sumHours += sumMinutes/60;
			sumMinutes = sumMinutes%60;
		}
		
		Time newObject = new Time (sumHours,sumMinutes);
			return newObject;
	}

}

