class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int top = numer1*denom2+numer2*denom1;
        int bot = denom1*denom2;
        for(int i=Math.min(top, bot); i>=1; i--) {
            if(top%i==0 && bot%i==0){
                answer[0]=top/i;
                answer[1]=bot/i;
                break;
            }
        }
        return answer;
    }
}