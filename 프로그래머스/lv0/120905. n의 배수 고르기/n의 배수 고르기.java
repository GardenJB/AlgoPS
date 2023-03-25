import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer;
        int[] temp = new int[numlist.length];
		int cnt=0;
		for(int i=0; i<numlist.length; i++) {
			if(numlist[i]%n==0) {
				temp[cnt]=numlist[i];
				cnt++;
			}
		}
		answer = Arrays.copyOf(temp, cnt);
        return answer;
    }
}