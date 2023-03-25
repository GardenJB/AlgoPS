class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int x : array){
            if (n==x){
                answer++;
            }
        }
        return answer;
    }
}