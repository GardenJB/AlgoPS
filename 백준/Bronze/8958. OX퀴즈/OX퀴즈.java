import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//test case
		int t = sc.nextInt();
		
		for(int tc=1; tc<=t; tc++) {
			
			//퀴즈 결과
			String s = sc.next();
			char[] arr = s.toCharArray();
			int cnt=0;
			int ans =0;
			for(int i=0; i<arr.length; i++) {
				cnt = arr[i]=='O' ? cnt+1 : 0;
				ans+=cnt;
			}
			
			System.out.println(ans);
		}
	}

}
