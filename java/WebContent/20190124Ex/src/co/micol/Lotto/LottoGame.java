package co.micol.Lotto;

import java.util.Arrays;
import java.util.Scanner;

public class LottoGame {
	private int[][] lotto;// [][]

//	public void lottoRun() {
//		//int game = money/1000;
//		lotto = new int[6];
//		for(int i = 0; i < 6; i++) {
//			double r = Math.random();
//			lotto[i] = (int)(r * 45)+1;
//		}
//		Arrays.parallelSort(lotto);
//		for(int n : lotto)
//			System.out.print(n +" ");
//	}

	public void multiLotto(int money) {
		lotto = new int[money][6];
		int g;
		for (int i = 0; i < money; i++) {
			for (int j = 0; j < 6; j++) {
				double r = Math.random();
				lotto[i][j] = (int) (r * 45) + 1;
				for(int k = 0; k < lotto.length; k++) {					
					if(lotto[i][j] < lotto[i][k]) {
						g = lotto[i][j];
						lotto[i][j]=lotto[i][k];
						lotto[i][k]= g;
					}
				}
			}			
		}
		//Arrays.parallelSort(lotto[i]);
		for (int i = 0; i < money; i++) {
			for(int j = 0; j <6; j++) {
				System.out.print(lotto[i][j] + " ");
			}
			System.out.println();
		}
	}
}
