
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//위치 좌표 x, y
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		//직사각형 우상 w, h
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		int[] arr = {x, y, Math.abs(x-w), Math.abs(y-h)};
		int min_d =x;
		for(int a : arr) {
			if(min_d>a) min_d=a;
		}
		
		System.out.println(min_d);
	}
}
