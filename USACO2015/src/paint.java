import java.io.*;
import java.util.Scanner;
public class paint {
	static boolean [] fence;
	static int a, b, c, d;
	static int count;
	static int painted;
	static Scanner in;
	static PrintWriter out;
	public static void main(String [] args) {
		try {
			init();
			solve();
			in.close();
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	static void init() throws IOException{
		in = new Scanner(new File("paint.in"));
		out = new PrintWriter(new File("paint.out"));
		fence = new boolean[101];
		a = in.nextInt(); b = in.nextInt();
		c = in.nextInt(); d = in.nextInt();
	}
	static void solve() {
		for(int i = a; i <=b; i++) {
			fence[i] = true;
		}
		for(int i = c; i<=d; i++) {
			fence[i] = true;
		}
		for(int i = 0; i < fence.length; i++) {
			if(fence[i] == true)
				count++;
			else
				continue;
		}
		painted = count-1;
		out.println(painted);
	}
}
