import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//숫자 10
		Set<Integer> set = new HashSet<>();
		for(int i =0; i<10; i++) {
			int temp = sc.nextInt();
			set.add(temp%42);
		}
		
		System.out.println(set.size());
		
		
	}

}
