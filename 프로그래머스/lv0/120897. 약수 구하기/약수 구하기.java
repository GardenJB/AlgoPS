class Solution {
    public int[] solution(int n) {
        int[] answer;
        int k =0;
        int[] temp = new int[n];
        for(int i=1; i<=n; i++){
            if(n%i==0){
                temp[k]=i;
                k++;
            }
        }
        
        answer = new int[k];
        for(int i=0; i<k; i++){
            answer[i]=temp[i];
        }
        
        return answer;
    }
}