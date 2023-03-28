import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		//사람 수 n
		int n = sc.nextInt();
		//k번째 제거
		int k = sc.nextInt();
		
		//사람 저장
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i=1; i<=n; i++) {
			q.add(i);
		}
		//순서 저장
		Queue<Integer> q1 = new LinkedList<>();
		for(int i=1; i<=k; i++) {
			q1.add(i);
		}
		sb.append("<");
		while(!q.isEmpty()) {
			int p = q.poll();
			int m = q1.poll();
			if(m==k) {
				if(q.isEmpty()) {
					sb.append(p+">");
					break;
				}
				sb.append(p+", ");
				q1.add(m);
				
			}else {
				q.add(p);
				q1.add(m);
			}
			
		}
		System.out.println(sb);
 	}

}
