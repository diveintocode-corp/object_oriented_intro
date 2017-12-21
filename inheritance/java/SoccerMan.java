package schoo_Noro;

public class SoccerMan {

	//スタミナ
	private int stamina;
	//スピード
	private int pace;
	private int skill;

	public int get_skill(){
		return skill ;
	}

	SoccerMan(){
		this.stamina = 100;
		//スピード
		this.pace = 0;
	}

	public void set_skill(int new_skill){
		skill = new_skill;
	}

	public void get_status(){
		System.out.println("stamina:" + stamina);
		System.out.println("pace:" + pace);
		System.out.println("skill:" + skill);
	}
	public void run(){
		System.out.println(" -- run -- ");
		stamina--;
		pace++;
	}
	public void stop(){
		System.out.println(" -- stop -- ");
		pace--;
	}
	public void rest(){
		System.out.println(" -- rest -- ");
		stamina = 100;
	}

	public void acceleration(){
			System.out.println(" -- acceleration -- ");
			stamina--;
			stamina--;
			stamina--;
			pace = pace + 5;
		}

	public void sprint_speed(){
		System.out.println(" -- sprint_speed -- ");
		stamina--;
		stamina--;
		pace += skill;
	}
	public void practice(){
		System.out.println(" -- practice -- ");
		skill = skill + skill;
	}
}
