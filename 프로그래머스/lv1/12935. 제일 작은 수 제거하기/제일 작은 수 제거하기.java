

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        if(arr.length ==1) answer = new int[] {-1};
        else {
            int min_a = Integer.MAX_VALUE;
            for(int i=0; i<arr.length; i++) {
                 min_a = min_a>arr[i] ? arr[i] : min_a;
            }
            answer = new int[arr.length-1];
            int k=0;
            for(int i=0; i<arr.length; i++) {
                if(arr[i] != min_a) {
                    answer[k]=arr[i];
                    k++;
                }
            }
        }
        
        return answer;
    }
}