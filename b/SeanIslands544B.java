package b;

import java.util.Arrays;
import java.util.Scanner;

public class SeanIslands544B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int desired = sc.nextInt();
		
		char[][] arr = new char[n][n];
		for (char[] arr1 : arr) {
			Arrays.fill(arr1, 'S');
		}
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (desired == 0)
					break;
				else {
					if ((i+j)%2 == 0) {
						arr[i][j] = 'L';
						desired--;
					}
				}
			}
		}

		if (desired == 0) {
			System.out.println("YES");
			for (int i=0; i<n; i++) {
				for (int j=0; j<n; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
		} else {
			System.out.println("NO");
		}
	}
}

/*
 * A map of some object is a rectangular field consisting of n rows and n
 * columns. Each cell is initially occupied by the sea but you can cover some
 * some cells of the map with sand so that exactly k islands appear on the map.
 * We will call a set of sand cells to be island if it is possible to get from
 * each of them to each of them by moving only through sand cells and by moving
 * from a cell only to a side-adjacent cell. The cells are called to be
 * side-adjacent if they share a vertical or horizontal side. It is easy to see
 * that islands do not share cells (otherwise they together form a bigger
 * island).
 * 
 * Find a way to cover some cells with sand so that exactly k islands appear on
 * the n × n map, or determine that no such way exists. Input
 * 
 * The single line contains two positive integers n, k (1 ≤ n ≤ 100, 0 ≤ k ≤ n2)
 * — the size of the map and the number of islands you should form. Output
 * 
 * If the answer doesn't exist, print "NO" (without the quotes) in a single
 * line.
 * 
 * Otherwise, print "YES" in the first line. In the next n lines print the
 * description of the map. Each of the lines of the description must consist
 * only of characters 'S' and 'L', where 'S' is a cell that is occupied by the
 * sea and 'L' is the cell covered with sand. The length of each line of the
 * description must equal n.
 * 
 * If there are multiple answers, you may print any of them.
 * 
 * You should not maximize the sizes of islands. Sample test(s) Input
 * 
 * 5 2
 * 
 * Output
 * 
 * YES SSSSS LLLLL SSSSS LLLLL SSSSS
 * 
 * Input
 * 
 * 5 25
 * 
 * Output
 * 
 * NO
 */
