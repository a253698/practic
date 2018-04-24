package java2.io;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PracticPoker2 {

	Random random = new Random();
	String cardsflowers = "ABCD";

	List<Integer> cards = new ArrayList<>();

	public PracticPoker2() {
		for (int i = 1; i < 54; i++) {
			cards.add(i);
			//53張牌
		}
	}

	public void pokershuffle2() {
		for (int i = 0; i < 54; i++) {
			int j = random.nextInt(52);
			cards.set(i, j);
			//將i卡隨機與亂數j交換
		}
	}

	public void pokerprint2() {
		for (int i = 0; i < 54; i++) {
			int a = cards.get(1);
			System.out.println((a % 13) + 1 + "" + (cardsflowers.charAt(a / 13)));
		}
	}

}
