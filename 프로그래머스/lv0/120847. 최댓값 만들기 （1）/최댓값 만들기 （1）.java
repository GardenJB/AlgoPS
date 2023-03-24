class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max1 = 0;
        int max2 =0;
        //가장 큰 두 수 갱신하기
        for(int x : numbers){
            if(x>=max2){
                max2=max1;
                max1=x;
            }
        }
        answer = max1*max2;
        return answer;
    }
}