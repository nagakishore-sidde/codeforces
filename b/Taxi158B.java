package b;

import java.util.Scanner;

public class Taxi158B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int people = sc.nextInt();
		int[] countArr = new int[3];

		int numTaxis = 0;
		for (int i=0; i<people; i++) {
			int count = sc.nextInt();
			// If group contains 4 members we need one extra taxi anyway
			if (count == 4)
				numTaxis++;
			else
				// If count is less than 4, just increment the corresponding array elment count
				countArr[count-1]++;
		}
		
		// We need extra taxi for each group with count 3. In this taxi, we can also accommodate group with count 1.
		numTaxis += countArr[2];
		// So remove the groups with count '1' that can go along with group with count 3
		countArr[0] -= countArr[2];
		
		// Now, calculate the remaining folks from groups of size 1 and 2, and then allocate taxis for them
		int remaining = 2*countArr[1];
		if (countArr[0] > 0)
			remaining += countArr[0];
		
		numTaxis += (remaining%4 == 0) ? remaining/4 : remaining/4+1;
		System.out.println(numTaxis);
	}
}

/*
 * After the lessons n groups of schoolchildren went outside and decided to
 * visit Polycarpus to celebrate his birthday. We know that the i-th group
 * consists of si friends (1 ≤ si ≤ 4), and they want to go to Polycarpus
 * together. They decided to get there by taxi. Each car can carry at most four
 * passengers. What minimum number of cars will the children need if all members
 * of each group should ride in the same taxi (but one taxi can take more than
 * one group)? Input
 * 
 * The first line contains integer n (1 ≤ n ≤ 105) — the number of groups of
 * schoolchildren. The second line contains a sequence of integers
 * s1, s2, ..., sn (1 ≤ si ≤ 4). The integers are separated by a space, si is
 * the number of children in the i-th group. Output
 * 
 * Print the single number — the minimum number of taxis necessary to drive all
 * children to Polycarpus. Sample test(s) Input
 * 
 * 5 
 * 1 2 4 3 3
 * 
 * Output
 * 
 * 4
 * 
 * Input
 * 
 * 8 
 * 2 3 4 4 2 1 3 1
 * 
 * Output
 * 
 * 5
 * 
 * Note
 * 
 * In the first test we can sort the children into four cars like this:
 * 
 * the third group (consisting of four children), the fourth group (consisting
 * of three children), the fifth group (consisting of three children), the first
 * and the second group (consisting of one and two children, correspondingly).
 * 
 * There are other ways to sort the groups into four cars.
 */
