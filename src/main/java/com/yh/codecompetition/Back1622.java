package com.yh.codecompetition;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;
public class Back1622 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String in1 = scanner.next();
		String in2 = scanner.next();
		Vector<String> vCh = new Vector<String>();
		for(int i = 0 ;  i < in1.length() ; ++i) {
			int in1Pos = i;
			StringBuilder result = new StringBuilder();
			for(int j = 0 ;  j < in2.length() && in1Pos < in1.length() ; ++j) {
				if(in1.charAt(in1Pos) == in2.charAt(j)) {
					result.append(in2.charAt(j));
					in1Pos++;
					continue;
				}
			}
			if(result.length() != 0) {
				vCh.add(result.toString());
			}
		}
		Collections.sort(vCh, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() > o2.length()) // 길이 큰것 앞으로
					return -1;
				else if(o1.length() == o2.length()) {
					for(int i = 0 ; i < o1.length() ; ++i) {
						if(o1.charAt(i) >  o2.charAt(i)) // 크기가 크면 뒤로
							return 0;
						if(o1.charAt(i) <  o2.charAt(i)) // 크기가 작으면 앞으로
							return 1;
					}
					return 0;
				}
				return 1; // 길이가 작은것 뒤로
			}
		});
		
		System.out.println(vCh.get(0));
	}
}
