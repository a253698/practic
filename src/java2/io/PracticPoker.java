package java2.io;

import java.util.Random;

public class PracticPoker {

	Random random = new Random();
	String cardsflower = "ABCD";
	int[] cards = new int[52];
	
	public PracticPoker() {
		for (int i = 0; i < cards.length; i++) {
			cards[i] = i;
			//cards有52張
		}
	}
	public void shuffle() {
		for (int i = 0; i < cards.length; i++) {
			int j = random.nextInt(52);
			int tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
			
		}
	}
	public void print() {
		for (int i = 0; i < cards.length; i++) {
			int a = cards[i];
			System.out.println((a % 13) + 1 + "" + (cardsflower.charAt(a / 13)));
		}
	}
}
