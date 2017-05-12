package a;

import java.util.Scanner;

public class TheatreSquare1A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long m = sc.nextInt();
		long n = sc.nextInt();
		long a = sc.nextInt();
		
		long res = 0;
		if (m != 0 && n != 0 && a != 0) {
			long res1 = (m%a == 0) ? m/a : m/a+1;
			long res2 = (n%a == 0) ? n/a : n/a+1;
			res = res1 * res2;
		}
		
		System.out.println(res);
	}
}

/*
 * Theatre Square in the capital city of Berland has a rectangular shape with
 * the size n × m meters. On the occasion of the city's anniversary, a decision
 * was taken to pave the Square with square granite flagstones. Each flagstone
 * is of the size a × a.
 * 
 * What is the least number of flagstones needed to pave the Square? It's
 * allowed to cover the surface larger than the Theatre Square, but the Square
 * has to be covered. It's not allowed to break the flagstones. The sides of
 * flagstones should be parallel to the sides of the Square. Input
 * 
 * The input contains three positive integer numbers in the first line: n, m and
 * a (1 ≤ n, m, a ≤ 109). Output
 * 
 * Write the needed number of flagstones. 
 * 
 * Examples 
 * 
 * Input
 * 
 * 6 6 4
 * 
 * Output
 * 
 * 4
 */
