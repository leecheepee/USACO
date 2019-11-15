import java.util.*;
import java.io.*;

public class shell {
	
	static Scanner in;
	static PrintWriter out;
	static int n, shell, point;
	static int a[], b[], c[];

	
	public static void main(String [] args) {
		
		try {
			in= new Scanner(new File("shell.in"));
			out = new PrintWriter(new File("shell.out"));
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
		a = new int[n];
		b = new int[n];
		c = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = in.nextInt();
			b[i] = in.nextInt();
			c[i] = in.nextInt();
		}
		in.close();
	}
	static void solve() {
		int max = 0;

		max = Math.max(point(1), max);
		max = Math.max(point(2), max);
		max = Math.max(point(3), max);
		
		out.println(max);
	}
	
	static int point(int sh) {
		
		int p = 0;
		
		for(int i = 0 ; i < n; i++) {
		if(sh==b[i])
			sh = a[i];
		else if(sh == a[i])
			sh = b[i];
		
		if(sh == c[i])
			p++;

		}
		return p;
	}
	
}
