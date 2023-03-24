class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        //분자
        int top = numer1*denom2+numer2*denom1;
        //분모
        int bot = denom1*denom2;
        //기약분수 > 최대공약수 있다면 나누기 > 분자 분모 둘 중 작은값 기준
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
