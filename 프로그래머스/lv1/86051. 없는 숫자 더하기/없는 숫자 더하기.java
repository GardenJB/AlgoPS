class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int i=0; i<=9; i++) {
			boolean ch = true;
			for(int n : numbers) {
				if(n==i) ch=false;
			}
			if(ch) answer +=i;
		}
        return answer;
    }
}