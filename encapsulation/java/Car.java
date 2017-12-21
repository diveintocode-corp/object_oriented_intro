package schoo_Noro;

public class Car {

	private int fuel_gauge = 100;
	private int speed_meter = 0;

	public void get_status(){
		System.out.println("fuel_gauge:" + fuel_gauge);
		System.out.println("speed_meter:" + speed_meter);
	}

	public void run(){
		fuel_gauge--;
		speed_meter++;
	}

	public void stop(){
		speed_meter--;
	}

	public void refuel(){
		if(speed_meter == 0){
			fuel_gauge = 100;
		}else{
			System.out.println("Boo!!");
		}
	}
}
