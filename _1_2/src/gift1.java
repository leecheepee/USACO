/*
ID: leerach1
LANG: JAVA
TASK: gift1
 */



import java.io.File;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class gift1 {
	static Scanner in;
	static PrintWriter out;
	static String inFile = "gift1.in";
	static String outFile = "gift1.out";



//input Variables
	static LinkedHashMap<String, Integer> list;
	static int NP;

public static void main(String[] args) {

	try {

		//initialize in & out
		in = new Scanner(new File("gift1.in"));
		out = new PrintWriter(new File("gift1.out"));

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

		NP = Integer.parseInt(in.nextLine());
		list = new LinkedHashMap<String, Integer>();
		
		for(int i = 0; i < NP; i++) {
			list.put(in.nextLine(), 0);
		}

}

	private static String solve() {
		String result = "";
		
		for(int i = 0; i < NP; i++) {
			String giver = in.nextLine();
			String [] temp = in.nextLine().split(" ");
			int totalMoney = Integer.parseInt(temp[0]);
			int numbPeop = Integer.parseInt(temp[1]);
			
			if(numbPeop == 0)
				continue;
			
			int money = totalMoney/numbPeop;
			int left = totalMoney-(money*numbPeop);
			
			list.put(giver, list.get(giver)-totalMoney+left);
			
			
			for(int j = 0; j < numbPeop; j++) {
				String receiver = in.nextLine();
				list.put(receiver, list.get(receiver) +money);
		}
	}
	
	for(String s: list.keySet()) {
		result += s + " " + list.get(s) + "\n";
	}
	return result;
}

//Algorithm methods
//private static int change(String s){
//
//}
}
