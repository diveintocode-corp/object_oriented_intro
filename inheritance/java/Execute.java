package schoo_Noro;

public class Execute {

	public void excute_super_car(){
		SuperCar super_car = new SuperCar();
		super_car.get_status();
		super_car.run();
		super_car.get_status();
		super_car.stop();
		super_car.get_status();
	}

	public void excute_truck(){
		Truck truck = new Truck();
		truck.get_status();
		truck.run();
		truck.load();
		truck.get_status();
		truck.stop();
		truck.get_status();
	}
}
