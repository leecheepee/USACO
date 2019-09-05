//package _1_2;

/*
ID: leerach1
LANG: JAVA
TASK: beads
 */

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class beads {
	static Scanner in;
	static PrintWriter out;


	//input Variables
	static String[] list;
	static String bead[];
	static int N;
	static String b;

	public static void main(String[] args) {

		try {

			//initialize in & out
			in = new Scanner(new File("beads.in"));
			out = new PrintWriter(new File("beads.out"));

			init();

			//write out file
			out.println(solve());

			out.close();
			in.close();

		}catch(Exception e) {
			e.printStackTrace();
		}

	}

private static void init() {

	N = Integer.parseInt(in.nextLine());
	b = in.nextLine();
	
}

private static String solve() {
	String result = "";
	int max = 0;
	b+=b;
	
	for(int i =0; i < b.length()/2; i++) {
		int c = 1; 
		char start = b.charAt(i);
		
		if(start == 'w') {
			c = Math.max(recur(i, 'r'), recur(i,'b'));
		}else
			c = recur(i,start);
		if(max<c)
			max = c;
	}
	result = "" + max;
	return result;


}

private static int recur(int i, char c) {
	boolean flag = false;
	int idx = i+1;
	int count = 2;
	System.out.print(idx + " : ");
	while(count < b.length()/2) {
		char curr = b.charAt(idx);
		System.out.print(curr);
		
		if(!flag) {
			if(curr == c || curr == 'w')
				count++;
			else
				flag = true;
		}else {
			if(curr!=c || curr == 'w')
				count++;
			else
				break;
		}
		idx++;
	}
	System.out.print("[" + count + "]\n");
	return count;
}

}
