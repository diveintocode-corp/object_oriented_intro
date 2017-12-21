package schoo_Noro;

public class Execute {

	public void excute_bad_car(){
		BadCar bad_car = new BadCar();
		bad_car.get_status();
		bad_car.speed_meter++;
		bad_car.fuel_gauge--;
		bad_car.get_status();
		bad_car.speed_meter--;
		bad_car.fuel_gauge++;
		bad_car.get_status();
	}

	public void excute_car(){
		Car car = new Car();
		car.get_status();
		car.run();
		car.get_status();
		car.stop();
		car.get_status();
	}

}
