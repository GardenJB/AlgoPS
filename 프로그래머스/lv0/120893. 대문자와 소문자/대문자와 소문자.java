class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        String temp="";
        for (int i =0; i<arr.length; i++){
            if (arr[i]>=97 && arr[i]<=122){
                temp=arr[i]+"";
                answer +=temp.toUpperCase();
                
            } else if (arr[i]>=65 && arr[i]<=90){
                temp=arr[i]+"";
                answer+= temp.toLowerCase();
            }
        }
        return answer;
    }
}