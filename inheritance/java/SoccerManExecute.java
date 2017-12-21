package schoo_Noro;

public class SoccerManExecute {

	SoccerManGon gon = new SoccerManGon();

	public void excute_nakata(){
		SoccerManNakata nakata = new SoccerManNakata();
		nakata.get_status();
		nakata.run();
		nakata.get_status();
		nakata.stop();
		nakata.get_status();
		nakata.sprint_speed();
		nakata.practice();
		nakata.acceleration();
		nakata.get_status();
	}

	public void excute_gon(){
		SoccerManGon gon = new SoccerManGon();
		gon.get_status();
		gon.run();
		gon.get_status();
		gon.stop();
		gon.get_status();
		gon.sprint_speed();
		gon.practice();
		gon.acceleration();
		gon.get_status();
	}
}
