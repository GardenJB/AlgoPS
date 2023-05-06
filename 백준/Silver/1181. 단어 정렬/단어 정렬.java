import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
 
 
public class Main {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
 
		int n = in.nextInt();
		String[] arr = new String[n];
 
		in.nextLine();
 
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextLine();
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
			
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} 
			
				else {
					return s1.length() - s2.length();
				}
			}
		});
 
 
		StringBuilder sb = new StringBuilder();
 
		sb.append(arr[0]).append('\n');
		
		for (int i = 1; i < n; i++) {
		
			if (!arr[i].equals(arr[i - 1])) {
				sb.append(arr[i]).append('\n');
			}
		}
		System.out.println(sb);
	}
 
}