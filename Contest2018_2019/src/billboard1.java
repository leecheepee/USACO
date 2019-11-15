import java.io.*;
import java.util.*;

public class billboard1 {
	static int x1, y1, x2, y2, x3, y3, x4, y4, t1, t2, t3, t4;
	static boolean a[][];
	static int count;
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
		in = new Scanner(new File("billboard.in"));
		out = new PrintWriter(new File("billboard.out"));
		x1 = in.nextInt()+1000; y1 = in.nextInt()+1000; x2 = in.nextInt()+1000; y2 = in.nextInt()+1000;
		x3 = in.nextInt()+1000; y3 = in.nextInt()+1000; x4 = in.nextInt()+1000; y4 = in.nextInt()+1000;
		t1 = in.nextInt()+1000; t2 = in.nextInt()+1000; t3 = in.nextInt()+1000; t4 = in.nextInt()+1000;
		
		a = new boolean[2001][2001];
		in.close();
		
	}
	static void solve() {
		for(int i = x1; i < x2; i++) {
			for(int j = y1; j<y2; j++) {
				a[i][j] = true;
				count++;
			}
		}
		for(int i = x3; i < x4; i++) {
			for(int j = y3; j<y4; j++) {
				a[i][j] = true;
				count++;
			}
		}
		
		for(int i = t1; i<t3; i++) {
			for(int j = t2; j<t4; j++) {
				if(a[i][j] == true) {
					count--;
				}else {
					continue;
				}
			}
		}
		out.println(count);
	}
}
