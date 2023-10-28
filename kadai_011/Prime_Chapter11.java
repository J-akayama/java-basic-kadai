package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		boolean[] numS = new boolean[101]; // 素数かどうか

		for (int i = 1; i < numS.length; i++) {
			numS[i] = true;
		}
		int numD = 2;
		while (numD < numS.length) {
			// その数でしか割り切れない
			for (int i = numD + 1; i < numS.length; i++) {
				// その数以外で割り切れる（素数ではない）
				if (i % numD == 0) {
					numS[i] = false;
	                continue;
				}
			}
			numD += 1;
		}
		// 素数を出力する
		for (int i = 2; i < numS.length; i++) {
			if (numS[i]) {
			System.out.println(i);
			}
		}
	}
}