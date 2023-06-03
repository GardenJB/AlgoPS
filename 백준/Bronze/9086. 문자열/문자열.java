import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int t = sc.nextInt();
		for(int tc=1; tc<=t; tc++) {
			StringBuilder sb = new StringBuilder();
			String s = sc.next();
			char[] arr = s.toCharArray();
			sb.append(arr[0]);
			sb.append(arr[s.length()-1]);
			System.out.println(sb);
		}
	}

}
