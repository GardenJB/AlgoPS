import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		
		outer:
		for(int i=-999; i<=999; i++) {
			for(int j=-999; j<=999; j++) {
				if(a*i+b*j == c && d*i+e*j == f) {
					System.out.printf("%d %d", i, j);
					break outer;
				}
			}
		}
	}

}
