class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min_c=Integer.MAX_VALUE;
        int min_i =0;
        for(int a : array){
            int temp = Math.abs(n-a);
            if(min_c>temp) {
                min_c=temp;
                min_i=a;
            }else if(min_c==temp) {
                min_i = min_i>a ? a : min_i;
            }
        }
        answer = min_i;
        return answer;
    }
}