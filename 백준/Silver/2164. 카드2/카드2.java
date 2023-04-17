import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//카드 수 n
		int n = sc.nextInt();
		
		//카드를 담을 큐
		Deque<Integer> q = new LinkedList<Integer>();
		for(int i=1; i<=n; i++) {
			q.add(i);
		}
		
		//마지막 카드가 나올 때까지 반복
		while(q.size()>=2) {
			//첫 번째 버림
			q.poll();
			int a = q.poll();
			//두 번째 더함
			q.add(a);
			
		}
		
		System.out.println(q.peek());
	}

}
