class Solution {
    public int[] solution(int n) {
        int[] answer1= new int[n];
        int k =0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                answer1[k]=i;
                k++;
            }
        }
        
        int[] answer = new int[k];
        for(int i=0; i<k; i++){
            if(answer1[i]!=0){
                answer[i]=answer1[i];
            }
        }
        
        return answer;
    }
}