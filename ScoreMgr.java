package com.tech1.score;

import java.util.Scanner;

public class ScoreMgr {

	public static void main(String[] args) {
int sum=0;
double avg=0.0;

		int scrArr[] = new int[5];
		Scanner scr = new Scanner(System.in);
		
		for (int i = 0; i < scrArr.length; i++) {
			scrArr[i] = scr.nextInt();
		}
		for (int j = 0; j < scrArr.length; j++) {
			
			sum+=scrArr[j];
		}
		avg= sum/5;
		System.out.println(sum);
		System.out.println(avg);
		scr.close();
	}
}
