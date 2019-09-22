package com.yh.codecompetition;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Back1408 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		Scanner sc = scanner.useDelimiter(Pattern.compile("[\\r\\n:]+"));
		int t1 = Integer.parseInt(sc.next()) * 60 * 60
				+ Integer.parseInt(sc.next()) * 60
				+ Integer.parseInt(sc.next());
		
		int t2 = Integer.parseInt(sc.next()) * 60 * 60
				+ Integer.parseInt(sc.next()) * 60
				+ Integer.parseInt(sc.next()) + 24 * 60 * 60;
		
		int retainTime = (t2 - t1) % (24 * 60 * 60);
		
		System.out.println(String.format("%02d",retainTime / (60 * 60)) 
				+ ":" + String.format("%02d", retainTime % (60 * 60) / 60)  
				+ ":" + String.format("%02d",retainTime % 60));
	}
}
