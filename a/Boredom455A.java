package a;

import java.util.Scanner;

public class Boredom455A {
	static long[] arr = new long[100001];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for (int i=0; i<count; i++) {
			arr[sc.nextInt()]++;
		}
		
		for (int i=2; i<arr.length; i++) {
			arr[i] = Math.max(arr[i-1], i*arr[i] + arr[i-2]);
		}
		
		System.out.println(arr[arr.length-1]);
	}
}

/*
 * Alex doesn't like boredom. That's why whenever he gets bored, he comes up
 * with games. One long winter evening he came up with a game and decided to
 * play it.
 * 
 * Given a sequence a consisting of n integers. The player can make several
 * steps. In a single step he can choose an element of the sequence (let's
 * denote it ak) and delete it, at that all elements equal to ak + 1 and ak - 1
 * also must be deleted from the sequence. That step brings ak points to the
 * player.
 * 
 * Alex is a perfectionist, so he decided to get as many points as possible.
 * Help him. Input
 * 
 * The first line contains integer n (1 ≤ n ≤ 105) that shows how many numbers
 * are in Alex's sequence.
 * 
 * The second line contains n integers a1, a2, ..., an (1 ≤ ai ≤ 105). Output
 * 
 * Print a single integer — the maximum number of points that Alex can earn.
 * Sample test(s) Input
 * 
 * 2 1 2
 * 
 * Output
 * 
 * 2
 * 
 * Input
 * 
 * 3 1 2 3
 * 
 * Output
 * 
 * 4
 * 
 * Input
 * 
 * 9 1 2 1 3 2 2 2 2 3
 * 
 * Output
 * 
 * 10
 */