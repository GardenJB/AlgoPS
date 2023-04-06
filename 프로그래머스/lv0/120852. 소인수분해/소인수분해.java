class Solution {
    public int[] solution(int n) {
        int[] answer;
        int[] temp = new int[n];
        int k=0;
        outer :
        for(int i=2; i<=n; i++) {
            int cnt=0;
            for(int j=1; j<=n; j++) {
                if(i%j==0) cnt++;
                if(cnt>2) continue outer;
                
            }
            //**다 돌고 소수인 경우
            if(n%i==0){
                temp[k]=i;
                k++;
            }
        }
        answer = new int[k];
        for(int i=0; i<k; i++) {
            answer[i]=temp[i];
        }
        return answer;
    }
}