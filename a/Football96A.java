package a;

import java.util.Scanner;

public class Football96A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		char previous = str.charAt(0);
		int count = 1;
		String res = "NO";
		for (int i=1; i<str.length(); i++) {
			if (count > 6) {
				res = "YES";
				break;
			} else {
				if (previous == str.charAt(i)) {
					count++;
				} else {
					count = 1;
				}
				previous = str.charAt(i);
			}
		}
		
		if (count > 6)
			res = "YES";
		
		System.out.println(res);
	}
}

/*
 * Petya loves football very much. One day, as he was watching a football match,
 * he was writing the players' current positions on a piece of paper. To
 * simplify the situation he depicted it as a string consisting of zeroes and
 * ones. A zero corresponds to players of one team; a one corresponds to players
 * of another team. If there are at least 7 players of some team standing one
 * after another, then the situation is considered dangerous. For example, the
 * situation 00100110111111101 is dangerous and 11110111011101 is not. You are
 * given the current situation. Determine whether it is dangerous or not. Input
 * 
 * The first input line contains a non-empty string consisting of characters "0"
 * and "1", which represents players. The length of the string does not exceed
 * 100 characters. There's at least one player from each team present on the
 * field. Output
 * 
 * Print "YES" if the situation is dangerous. Otherwise, print "NO". Sample
 * test(s) Input
 * 
 * 001001
 * 
 * Output
 * 
 * NO
 * 
 * Input
 * 
 * 1000000001
 * 
 * Output
 * 
 * YES
 */
