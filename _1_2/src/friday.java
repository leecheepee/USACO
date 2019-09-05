//package _1_2;
/*
ID: leerach1
LANG: JAVA
TASK: friday
 */
//package _1_2;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class friday {
	static Scanner in;
	static PrintWriter out;

	//static StringBuilder result;
	static int N;

	//input Variables
	static int[] list;
	static int[] dates = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	static int date = 0;

	public static void main(String[] args) {

		try {

			//initialize in & out
			in = new Scanner(new File("friday.in"));
			out = new PrintWriter(new File("friday.out"));

			init();

			//write out file
			out.print(solve());

			out.close();
			in.close();

		}catch(Exception e) {
			e.printStackTrace();
		}

	}

private static void init() {

	//get data
	//initialize input variables
	N = Integer.parseInt(in.nextLine()) + 1900;
	date =0;
	list = new int[7]; //MON - SUN
}

private static String solve() {
	String result = "";
	
	for(int i = 1900; i < N; i++) {
		for(int j = 1; j <=12; j++) {
			list[(date+13)%7]++;
			
			if(j == 2) {
				if(check(i)) {//combine as one by just saying check
					date+=29;
				}else {
					date +=28;
				}
			}else {
				date+= dates[j];
			}
		}
	}
	result+=list[6] + " ";
	for(int i = 0; i < 6; i++) {
		if(i == 5)
				result += list[i] + "\n";
		else
			result += list[i] + " ";
	}
	//In this problem, there are 7 values for the answer, so we may not need to 
	//result = list[6] + " " + list[0] + " " + list[1] + " "... + list[5] + "\n"
	
	result = list[6] + " " + list[0] + " " + list[1] + " " + list[2] + " " + list[3] + " " + list[4] + " " + list[5] + "\n";
	return result;

}

//Algorithm methods
private static boolean isLeaf(int y) {
	
	return y%4 == 0;
}
private static boolean isCentury(int y) {
	if(y % 100 == 0) {
		if(y%400 == 0)
			return false;
		return true;
	}else {
		return false;
	}
}
private static boolean check(int y) {
	return y%4 == 0 && (y%400 == 0 || y%100 !=0);
}
}
