package a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SetOfStrings544A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = sc.next();

		if (num == 1) {
			System.out.println("YES");
			System.out.println(str);
			return;
		}

		if (str != null && str.length() > 0) {
			int start = 0;

			boolean[] flagArr = new boolean[26];
			flagArr[str.charAt(0) - 97] = true;

			List<String> resList = new ArrayList<>();
			for (int i = 1; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (!flagArr[ch - 97]) {
					flagArr[ch - 97] = true;
					if (num == 2) {
						resList.add(str.substring(start, i));
						resList.add(str.substring(i, str.length()));
						num = num - 2;
						break;
					} else {
						resList.add(str.substring(start, i));
						num--;
						start = i;
					}
				}
			}

			if (num == 0) {
				System.out.println("YES");
				for (String s : resList)
					System.out.println(s);
			} else
				System.out.println("NO");
		}
	}
}

/*
 * You are given a string q. A sequence of k strings s1, s2, ..., sk is called
 * beautiful, if the concatenation of these strings is string q (formally,
 * s1 + s2 + ... + sk = q) and the first characters of these strings are
 * distinct.
 * 
 * Find any beautiful sequence of strings or determine that the beautiful
 * sequence doesn't exist. Input
 * 
 * The first line contains a positive integer k (1 ≤ k ≤ 26) — the number of
 * strings that should be in a beautiful sequence.
 * 
 * The second line contains string q, consisting of lowercase Latin letters. The
 * length of the string is within range from 1 to 100, inclusive. Output
 * 
 * If such sequence doesn't exist, then print in a single line "NO" (without the
 * quotes). Otherwise, print in the first line "YES" (without the quotes) and in
 * the next k lines print the beautiful sequence of strings s1, s2, ..., sk.
 * 
 * If there are multiple possible answers, print any of them.
 *
 * Examples
 * Input
 * 
 * 1
 * abca
 * 
 * Output
 * 
 * YES
 * abca
 * 
 * Input
 * 
 * 2
 * aaacas
 * 
 * Output
 * 
 * YES
 * aaa
 * cas
 * 
 * Input
 * 
 * 4
 * abc
 * 
 * Output
 * 
 * NO
 * 
 * Note
 * 
 * In the second sample there are two possible answers: {"aaaca", "s"} and {"aaa", "cas"}.
 */
