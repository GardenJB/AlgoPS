class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        //10인분 당 서비스 하나
        int bonus = n/10;
        answer = n*12000+(k-bonus)*2000;
        return answer;
    }
}