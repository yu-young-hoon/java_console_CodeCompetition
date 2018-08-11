package com.yh.codecompetition;

import java.util.*;

public class Back1003 {
	private static int[][] data;
	private static void printFiboMemorization(int n) {
		data = new int[2][2];
		data[0][0] = 1;
		data[0][1] = 0;
		data[1][0] = 0;
		data[1][1] = 1;
		
		for(int i = 2 ; i <= n; ++i) {
			data[i & 1][0] = data[0][0] + data[1][0];
			data[i & 1][1] = data[0][1] + data[1][1];
		}
		
		System.out.println(data[n & 1][0] + " " + data[n & 1][1]);
	}
	
	
    public static void main(String arg[]) {
        Scanner S=new Scanner(System.in);
		int a = S.nextInt();
		while(a-- != 0) {
			int b = S.nextInt();
			printFiboMemorization(b);
		}
    }
}