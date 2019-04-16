package co.micol.Lotto;

public class LottoGame2 {
	int i;

	public void lottoRun() {
		int Lotto[] = new int[6];

		for (int i = 0; i < Lotto.length; i++) {
			Lotto[i] = (int) ((Math.random() * 45) + 1);
			for (int j = 0; j < Lotto.length; j++) {
				int k;
				if (Lotto[i] < Lotto[j]) {
					k = Lotto[i];
					Lotto[i] = Lotto[j];
					Lotto[j] = k;
				}
			}
		}
		for (int i = 0; i < Lotto.length; i++) {

			System.out.print(Lotto[i] + " ");
		}
	}
}
