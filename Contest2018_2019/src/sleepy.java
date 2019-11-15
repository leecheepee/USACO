import java.io.*;
import java.util.*;

public class sleepy {
	static Scanner in;
	static PrintWriter out;
	static int n, count;
	static int cow[];
	
	public static void main(String [] args) {
		
		try {
			in = new Scanner(new File("sleepy.in"));
			out = new PrintWriter(new File("sleepy.out"));
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
		cow = new int[n];
		for(int i = 0; i < n; i++) {
			cow[i] = in.nextInt();
		}
	}
	static void solve() {
		count = 0;
		
		for(int j = cow.length-1; j > 0; j--) {
			if(cow[j]<cow[j-1]) {
				count = j;
				break;
			}
		}
		out.println(count);
	}
}
