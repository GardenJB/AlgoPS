import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();
		
		//string.replaceAll("","")용법 주의*****
		//해당 문자열을 한자리수 문자열로 바꾸기
		st=st.replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=", "1");
		//문자열 길이 정답
		int ans = st.length();
		System.out.println(ans);
	}

}
