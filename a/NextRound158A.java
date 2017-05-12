package a;

import java.util.Scanner;

public class NextRound158A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int pos = sc.nextInt();
		
		int[] scores = new int[count];
		for (int i=0; i<count; i++) {
			scores[i] = sc.nextInt();
		}
		
		int qualifyScore = scores[pos-1];
		int numQualifiers = 0;
		
		for (int score : scores) {
			if (score > 0 && score >= qualifyScore)
				numQualifiers++;
		}
		
		System.out.println(numQualifiers);
	}
}

// Input : 
// 4 2
// 0 0 0 0
// Output : 0
