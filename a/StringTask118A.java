package a;

import java.util.Scanner;

public class StringTask118A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String resStr = "";
		for (char ch : str.toCharArray()) {
			if (!isVowel(ch)) {
				resStr += "." + Character.toLowerCase(ch);
			}
		}
		System.out.println(resStr);
	}
	
	public static boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'y' | ch == 'u' || ch == 'o')
			return true;
		return false;
	}
}

/**
 * Petya started to attend programming lessons. On the first lesson his task was
 * to write a simple program. The program was supposed to do the following: in
 * the given string, consisting if uppercase and lowercase Latin letters, it:
 * 
 * deletes all the vowels, inserts a character "." before each consonant,
 * replaces all uppercase consonants with corresponding lowercase ones.
 * 
 * Vowels are letters "A", "O", "Y", "E", "U", "I", and the rest are consonants.
 * The program's input is exactly one string, it should return the output as a
 * single string, resulting after the program's processing the initial string.
 * 
 * Help Petya cope with this easy task. Input
 * 
 * The first line represents input string of Petya's program. This string only
 * consists of uppercase and lowercase Latin letters and its length is from 1 to
 * 100, inclusive. Output
 * 
 * Print the resulting string. It is guaranteed that this string is not empty.
 * Sample test(s) Input
 * 
 * tour
 * 
 * Output
 * 
 * .t.r
 * 
 * Input
 * 
 * Codeforces
 * 
 * Output
 * 
 * .c.d.f.r.c.s
 * 
 * Input
 * 
 * aBAcAba
 * 
 * Output
 * 
 * .b.c.b
 */
