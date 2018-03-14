import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		//VehicleList newVehicle = new VehicleList();
		Parking parking = new Parking(1.5,6,2,5000);
		Car car = new Car("Ford mustang",1.5,3,2,true);
		Scooter scooter = new Scooter("Kymco",true);
		Motorcycle motorcycle = new Motorcycle("Hayabusa",false);
		Workshop workshop = new Workshop();

		parking.addVehicle(car);
		parking.addVehicle(scooter);
		parking.addVehicle(motorcycle);
		parking.show();
		parking.removeVehicle(1);
		parking.show();
		
		workshop.addVehicle(car);
		workshop.addVehicle(motorcycle);
		workshop.show();
		workshop.repair(0);
	
	}

}
