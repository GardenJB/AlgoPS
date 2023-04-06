class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int cnt =1;
        for(int i=0; i<numbers.length; i+=2) {
            //번호는 인덱스+1**
            if(cnt==k) {
                answer=i+1;
                break;
            }
            cnt++;
            //**
            if(i==numbers.length-1) i=-1;
            if(i==numbers.length-2) i=-2;
            
        }
        return answer;
    }
}