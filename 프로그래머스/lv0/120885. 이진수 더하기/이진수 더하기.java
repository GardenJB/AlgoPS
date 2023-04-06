import java.util.Stack;

class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        //스택은 나중에 넣은 값부터 나온다
        Stack<Integer> st1 = new Stack<>();
		Stack<Integer> st2 = new Stack<>();
		for(int i=0; i<bin1.length(); i++) {
			st1.push((int) bin1.charAt(i)-'0');
		}
		for(int i=0; i<bin2.length(); i++) {
			st2.push((int) bin2.charAt(i)-'0');
		}
		
		int temp =0;
		int a=0;
		int b=0;
		Stack<Integer> st3 = new Stack<>();
        //둘 모두 비어 있지 않는 한 진행
		while(!st1.isEmpty() || !st2.isEmpty()) {
			if(!st1.isEmpty()) a=st1.pop();
			else a=0;
			if(!st2.isEmpty()) b = st2.pop();
			else b=0;
			st3.push((temp+a+b)%2);
			temp = (temp+a+b)/2;
			
		}
		if(temp==1) st3.push(temp);
		while(!st3.isEmpty()) {
			answer+=st3.pop();
		}
        return answer;
    }
}