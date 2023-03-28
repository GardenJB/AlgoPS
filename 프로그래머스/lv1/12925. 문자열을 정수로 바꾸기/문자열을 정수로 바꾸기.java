class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split("");
        StringBuilder sb = new StringBuilder();
        if(arr[0].equals("-")) {
            for(int i=1; i<arr.length; i++) {
                sb.append(arr[i]);
            }
            answer = -(Integer.parseInt(sb.toString()));
        }else {
            answer = Integer.parseInt(s);
        }
        return answer;
    }
}