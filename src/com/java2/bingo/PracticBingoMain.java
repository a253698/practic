package com.java2.bingo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PracticBingoMain {

	FileReader fr;

	public PracticBingoMain() {
		try {
			fr = new FileReader("bingo.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			int bingochart = Integer.parseInt(line);
			int chartrow = (int) Math.sqrt(bingochart);
			line = in.readLine();
			String tokens[] = line.split(",");
			List<Integer> ans = new ArrayList<Integer>();
			for (int i = 0; i <= tokens.length - 1; i++) {
				int a = Integer.parseInt(tokens[i]);
				ans.add(a);
			}
			PracticBingoChart bc = new PracticBingoChart(bingochart, chartrow, ans, tokens);
			bc.PrintChart();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


	public static void main(String[] args) {
		new PracticBingoMain();

	}

}
