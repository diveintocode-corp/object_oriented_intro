package schoo_Noro;

public class Main {

	public static void main(String[] args) {
		Execute exe = new Execute();
		// 良い例
		System.out.println("-- 良い例 -- ");
		exe.excute_car();

		// 悪い例
		System.out.println("-- 悪い例 -- ");
		exe.excute_bad_car();

	}

}
