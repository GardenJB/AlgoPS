import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();
		
		//*****
		st=st.replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=", "1");
		
		int ans = st.length();
		System.out.println(ans);
	}

}
