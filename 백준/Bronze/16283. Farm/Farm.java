
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		//양 하루 사료 a
		int a = sc.nextInt();
		//염소 하루 사료 b
		int b = sc.nextInt();
		//전체 가축 수 n
		int n = sc.nextInt();
		//하루 소비 사료 w
		int w = sc.nextInt();
		
		//유일 해 표시
		int k =0;
		int x = 1;
		int y = 1;
	
		for(int i=1; i<1000; i++) {
			//**
			if(a*(n-i) + b*i == w && n-i>0) {
				x = n-i;
				y = i;
				k++;
			}
		}
		
		if(k == 1) System.out.printf("%d %d\n", x, y);
		else System.out.println(-1);
	}
}
