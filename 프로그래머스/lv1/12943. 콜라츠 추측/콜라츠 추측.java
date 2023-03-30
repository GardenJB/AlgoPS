class Solution {
    //오버 플로우 방지하기 위해 num 을 long으로 바꿔줘야... 아니면 -1이 아닌 값이 나옴 ***
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
            //수 세는 위치**
            cnt++;
            
            //부등호 등호*
            if(cnt>500) {
                cnt=-1;
                break;
            }              
        }
        answer = cnt;
        return answer;
    }
}