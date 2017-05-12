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

/**
 * 
 * "Contestant who earns a score equal to or greater than the k-th place finisher's score will advance to the next round, as long as the contestant earns a positive score..."
 * — an excerpt from contest rules.
 * 
 * A total of n participants took part in the contest (n ≥ k), and you already
 * know their scores. Calculate how many participants will advance to the next
 * round. Input
 * 
 * The first line of the input contains two integers n and k (1 ≤ k ≤ n ≤ 50)
 * separated by a single space.
 * 
 * The second line contains n space-separated integers a1, a2, ..., an (0 ≤ ai ≤
 * 100), where ai is the score earned by the participant who got the i-th place.
 * The given sequence is non-increasing (that is, for all i from 1 to n - 1 the
 * following condition is fulfilled: ai ≥ ai + 1). Output
 * 
 * Output the number of participants who advance to the next round. Examples
 * Input
 * 
 * 8 5 10 9 8 7 7 7 5 5
 * 
 * Output
 * 
 * 6
 * 
 * Input
 * 
 * 4 2 0 0 0 0
 * 
 * Output
 * 
 * 0
 * 
 * Note
 * 
 * In the first example the participant on the 5th place earned 7 points. As the
 * participant on the 6th place also earned 7 points, there are 6 advancers.
 * 
 * In the second example nobody got a positive score.
 * 
 */
