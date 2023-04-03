class Solution {
    public int solution(int n) {
        int answer = 0;
        int i=1;
        int k=1;
        while(true) {
            k=k*i;
            if(k>n) {
                answer=i-1;
                break;
            }
            i++;
            
        }
        return answer;
    }
}