import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        //중복값에 주의 Map활용법****
        HashMap<String, Integer> hm = new HashMap<>();
        for(String s : participant) {
           hm.put(s, hm.getOrDefault(s, 0)+1);
        }
        for(String ss : completion) {
            hm.put(ss, hm.get(ss)-1);
        
        }
        for(String key : hm.keySet()) {
            if(hm.get(key) != 0) {
                answer+=key;
                break;
            }
        }
        return answer;
    }
}