import java.util.Arrays;
import java.util.Scanner;
//**
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		//소문자 a =97, 알파벳 26개**
		int[] arr = new int[26];
		Arrays.fill(arr, -1);
		
		for(int i=0; i<s.length(); i++) {
			int idx = (int) (s.charAt(i)-'a');
			if(arr[idx] == -1) arr[idx]=i;
			
		}
		for(int i=0; i<26; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}