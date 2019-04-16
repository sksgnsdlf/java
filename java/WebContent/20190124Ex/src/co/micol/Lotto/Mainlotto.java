package co.micol.Lotto;

import java.util.Scanner;

public class Mainlotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner money = new Scanner(System.in);
		int mone = money.nextInt();
		LottoGame game = new LottoGame();
		game.multiLotto(mone);
	}

}
