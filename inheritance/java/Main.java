package schoo_Noro;

public class Main {

	public static void main(String[] args) {

		// スーパーカー
		System.out.println("-- スーパーカー -- ");
		exe.excute_super_car();

		// トラック
		System.out.println("-- トラック -- ");
		exe.excute_truck();

		// サッカーチーム
		SoccerManExecute soccer_exe = new SoccerManExecute();

		// サッカー選手なかた
		System.out.println("-- サッカー選手なかた -- ");
		soccer_exe.excute_nakata();

		// サッカー選手ごん
		System.out.println("-- サッカー選手ごん -- ");
		soccer_exe.excute_gon();
	}

}
