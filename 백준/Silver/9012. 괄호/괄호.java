import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=t; tc++) {
			String s = br.readLine();
			
			//괄호 담을 스택
			Stack<Character> st = new Stack<>();
			boolean ch = true;
			for(int i=0; i<s.length(); i++) {
                //여는 괄호는 넣기
				if(s.charAt(i)=='(') st.add(s.charAt(i));
				else {
                    //닫는 괄호의 경우, 스택에 여는 괄호가 앞에 있으면 빼기
					if(st.size()>0 && st.peek()=='(') st.pop();
					else {
                        //아닌 경우 no
						ch=false;
						break;
					}
				}
			}
			//괄호가 다 쌍인지 확인
			if(!st.isEmpty()) ch=false;
			
			if(ch) System.out.println("YES");
			else System.out.println("NO");
		}
	}

}
