import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		//수 n
		int n = sc.nextInt();
		
		
		//출력 순서 수열
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		int k=0;
		int i=1;
        
        //스택
		Stack<Integer> st = new Stack<>();
		while(true) {
            //수열 순서와 일치하면 빼고
			if(!st.isEmpty() && st.peek()==arr[k]) {
				st.pop();
				sb.append("-\n");
				k++;
                //아니면 넣기
			}else {
				st.add(i);
				i++;
				sb.append("+\n");
                //수에 도달하면 멈춤
				if(i>n) break;
			}
		}
		
        //나머지 확인
		while(!st.isEmpty()) {
			if(st.peek()==arr[k]) {
				st.pop();
				sb.append("-\n");
				k++;
			}else break;
		}
		
		if(!st.isEmpty()) {
			sb = new StringBuilder();
			sb.append("NO");
		}
		System.out.println(sb);
		
	}

}
