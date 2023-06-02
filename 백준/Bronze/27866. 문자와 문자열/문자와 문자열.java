import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//문자열 s
		String s = sc.next();
		
		//정수 i
		int i = sc.nextInt()-1;
		
		char[] arr = s.toCharArray();
		
		System.out.println(arr[i]);
	}

}
