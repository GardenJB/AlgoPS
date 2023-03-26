class Solution {
    public int[] solution(int[][] score) {
        int students = score.length;
        int[] rank = new int[students];
        
        for (int i=0; i<rank.length; i++){
            rank[i] =1;
        }
        
        for(int i=0; i<students; i++){
            for (int j =0; j<students; j++){
                if(score[i][0]+score[i][1]<score[j][0]+score[j][1]){
                    rank[i]++;
                }
            }
        }
        return rank;
    }
}