import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		if(a==b  && b==c) System.out.println(10000+a*1000);
		else if(a==b || a==c) System.out.println(1000+a*100);
		else if(b==c) System.out.println(1000+b*100);
		else {
			int max=a;
			if(max<b) max=b;
			if(max<c) max=c;
			System.out.println(max*100);
		}
		
	}
}