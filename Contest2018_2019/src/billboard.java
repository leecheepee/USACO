import java.io.*;
import java.util.*;

public class billboard {
	static PrintWriter out;
	static Scanner in;
	static int count;
	static int x1, x2, y1, y2, c1, c2, c3, c4, maxI, minI, maxJ, minJ;
	static boolean a[][];
	
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
		x1 = in.nextInt() + 1000; y1 = in.nextInt() + 1000; x2 = in.nextInt()+1000; y2 = in.nextInt()+1000;
		c1 = in.nextInt()+1000; c2 = in.nextInt()+1000; c3 = in.nextInt()+1000; c4 = in.nextInt()+1000;
		a = new boolean[2001][2001];
		in.close();
		
	}
	static void solve() {
		for(int i = x1; i < x2; i++) {
			for(int j = y1; j<y2; j++) {
				a[i][j] = true;
			}
		}
		for(int i = c1; i < c2; i++) {
			for(int j = c3; j<c4; j++) {
				a[i][j] = false;
			}
		}
		
		for(int i = 0; i< a.length-1; i++) {
			for(int j = 0; j < a.length-1; j++) {
				if(a[i][j])
					maxI = Math.max(maxI, i);
					minI = Math.min(minI, i);
					maxJ = Math.max(maxJ, j);
					minJ = Math.min(minJ, j);
			}
		}
		count = (maxJ-minJ)*(maxI*minJ);
		out.println(count);
	}
}
