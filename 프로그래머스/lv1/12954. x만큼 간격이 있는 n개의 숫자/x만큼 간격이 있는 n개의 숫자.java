class Solution {
    public long[] solution(int x, int n) {
        long[] answer= new long[n];
        int cnt=0;
        //x값이 음에서 양까지 변화 가능 ***
        long temp=x;
        while(cnt<n){
            answer[cnt] = temp;
            temp+=x;
            cnt++;
        }
        return answer;
    }
}