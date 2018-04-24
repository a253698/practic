package java2.io;

public class PracticABNumber {

	String guessnumber;

	public PracticABNumber(String guessnumber) {
		this.guessnumber = guessnumber;
	}

	public int validate(String secret) {
		//驗證
		int result = 0;
		//由Tester那定
		int length = secret.length();
		for (int i = 0; i < guessnumber.length(); i++) {
			char c = guessnumber.charAt(i);
			for (int j = 0; j < length; j++) {
				if (c == secret.charAt(j)) {
					if (i == j) {
						result = result + 10;
					} else {
						result = result + 1;
					}
					break;
				}
			}
		}
		return result;
	}

}
