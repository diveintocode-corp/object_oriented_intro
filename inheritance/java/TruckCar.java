package schoo_Noro;

public class Truck extends Car {
	private int carrier = 0;

	public void get_status(){
		super.get_status();
		System.out.println("carrier:" + carrier);
	}
	public void unload(){
		carrier--;
	}
	public void load(){
		carrier++;
	}
}
