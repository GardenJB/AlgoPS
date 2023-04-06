
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//test case
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			
			//문자 배열
			char[][] arr = new char[5][];
			int max_ss =0;
			for(int j=0; j<5; j++) {
				String s = br.readLine();
				arr[j]=s.toCharArray();
				
				//가장 긴 문자열 길이
				if(max_ss<arr[j].length) {
					max_ss=arr[j].length;
					//System.out.println(max_ss);
				}
			}
			//세로 줄 넣 스택
			Stack<Character> st = new Stack<>();
				
			//빈 공간 빼고 끝에서부터 넣
			
			for(int a =max_ss-1; a>=0; a--) {
				for(int b=4; b>=0; b--) {
					//길이의 일치 여부
					if(arr[b].length>a) {
						st.push(arr[b][a]);
					} 
				}
			}
			System.out.printf("#%d ", i+1);
			while(!st.isEmpty()) {
				System.out.print(st.pop());
			}
			System.out.println();
		}
	}

}
