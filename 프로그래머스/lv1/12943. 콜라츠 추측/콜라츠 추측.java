class Solution {
    public int solution(long num) {
        int answer = 0;
        int cnt=0;
        //if(num==1) answer=0;
        while(num !=1) {
            if(num%2==0) {
                 num /= 2;
            } else {
                num = num*3+1;
            }
            cnt++;
            
            if(cnt>500) {
                cnt=-1;
                break;
            }              
        }
        answer = cnt;
        return answer;
    }
}