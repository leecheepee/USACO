import java.io.*;
import java.util.*;
public class teleport {
	static Scanner in;
	static PrintWriter out;
	static int [] ary;
	static int count;
	public static void main(String [] args) {
		try {
			in = new Scanner(new File("teleport.in"));
			out = new PrintWriter(new File("teleport.out"));
			init();
			solve();
			in.close();
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	static void init() {
		ary = new int[1000];
		
	}
	static void solve() {
		
	}
}
