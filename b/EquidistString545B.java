package b;

import java.util.Scanner;

public class EquidistString545B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		char[] str1Arr = str1.toCharArray();
		char[] str2Arr = str2.toCharArray();
		
		int str1D = 0;
		int str2D = 0;
		String resStr = "";
		
		for (int i=0; i<str1Arr.length; i++) {
			char ch1 = str1Arr[i];
			char ch2 = str2Arr[i];
			
			if (ch1 == ch2) {
				resStr += '0';
			} else {
				if (str1D == str2D) {
					resStr += ch1;
					str2D++;
				} else {
					if (str1D > str2D) {
						resStr += ch1;
						str1D--;
					} else {
						resStr += ch2;
						str2D--;
					}
				}
			}
		}
		
		if (str1D == 0 && str2D == 0)
			System.out.println(resStr);
		else
			System.out.println("impossible");
	}
}

/*
 * Little Susie loves strings. Today she calculates distances between them. As
 * Susie is a small girl after all, her strings contain only digits zero and
 * one. She uses the definition of Hamming distance:
 * 
 * We will define the distance between two strings s and t of the same length
 * consisting of digits zero and one as the number of positions i, such that si
 * isn't equal to ti.
 * 
 * As besides everything else Susie loves symmetry, she wants to find for two
 * strings s and t of length n such string p of length n, that the distance from
 * p to s was equal to the distance from p to t.
 * 
 * It's time for Susie to go to bed, help her find such string p or state that
 * it is impossible. Input
 * 
 * The first line contains string s of length n.
 * 
 * The second line contains string t of length n.
 * 
 * The length of string n is within range from 1 to 105. It is guaranteed that
 * both strings contain only digits zero and one. Output
 * 
 * Print a string of length n, consisting of digits zero and one, that meets the
 * problem statement. If no such string exist, print on a single line
 * "impossible" (without the quotes).
 * 
 * If there are multiple possible answers, print any of them. Sample test(s)
 * Input
 * 
 * 0001 1011
 * 
 * Output
 * 
 * 0011
 * 
 * Input
 * 
 * 000 111
 * 
 * Output
 * 
 * impossible
 * 
 * Note
 * 
 * In the first sample different answers are possible, namely — 0010, 0011,
 * 0110, 0111, 1000, 1001, 1100, 1101.
 */
