class Solution {
    public int[] solution(String[] strlist) {
        
        int[] answer = new int[strlist.length];
        int n = strlist.length;
        for (int i=0; i<n; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}