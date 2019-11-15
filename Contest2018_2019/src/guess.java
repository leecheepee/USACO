import java.io.*;
import java.util.*;

public class guess {
	static int n, count, num, max;
	static Scanner in;
	static PrintWriter out;
	static String animal[], traits[];
	static ArrayList<String>[] a;
	
	public static void main(String [] args) {
		try {
			in = new Scanner(new File("guess.in"));
			out = new PrintWriter(new File("guess.out"));
			init();
			solve();
			in.close();
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void init() throws IOException{
		n = in.nextInt();
		a = new ArrayList[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = new ArrayList<String>();//these are common in USACO study these
			in.next();
			int x = in.nextInt();
			for(int j = 0; j < x; j++) {
				a[i].add(in.next());
			}
		}
		
	}
	
	static void solve() {
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				count = 0;
				for(String s:a[i]) {
					if(a[j].contains(s)) {
						count++;
					}
				}
				max = Math.max(max, count);//use this as a formula IMPORTANT 
				
			}
		}out.println(max+1);
		
		
	}
}
