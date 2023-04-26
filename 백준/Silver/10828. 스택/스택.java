
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		//스택 만들기
		List<Integer> stack = new ArrayList<>();
        //비어 있을 경우 맨 앞은 -1
		int peek = -1;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				String s = st.nextToken();
				
				switch(s) {
				case "push" :
					int x = Integer.parseInt(st.nextToken());
					stack.add(x);
					peek++;
					break;
				case "pop" :
					if(peek != -1) {
						int a = stack.get(peek);
						System.out.println(a);
                        //없애주기
						stack.remove(peek);
						peek--;
					}else System.out.println(peek);
					break;
				case "size" :
					System.out.println(stack.size());
					break;
				case "empty" :
					if(peek == -1) System.out.println(1);
					else System.out.println(0);
					break;
				case "top" :
					if(peek != -1) System.out.println(stack.get(peek));
					else System.out.println(peek);
					break;
				}
			}
		}
		
		
	}

}
