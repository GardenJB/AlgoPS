class Solution {
    public int solution(int n) {
        int answer = 0;
        int t=1;
        while(t>0) {
            if(6*t%n==0) {
                answer = t;
                break;
            }
            t++;
        }
        return answer;
    }
}