class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int a=i; a<=j; a++) {
			String s = a+"";
			char[] arr = s.toCharArray();
			for(int b=0; b<arr.length; b++) {
				if((int)(arr[b]-'0') == k) {
					answer++;
				}
			}
		}
        return answer;
    }
}