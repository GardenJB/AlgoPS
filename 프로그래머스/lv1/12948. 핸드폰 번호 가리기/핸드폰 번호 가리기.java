class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int le = phone_number.length();
        for(int i=0; i<le-4; i++) {
        	answer+="*";
        }
        for(int i=le-4; i<le; i++) {
        	answer+=phone_number.valueOf(phone_number.charAt(i));
        }
  
        return answer;
    }
}