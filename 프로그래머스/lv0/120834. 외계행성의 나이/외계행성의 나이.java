import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public String solution(int age) {
        String answer = "";
        String[] age1 = {"a","b","c","d","e","f","g","h","i","j"};
        List<String> temp = new LinkedList<>(); 
        while(age>0) {
        	temp.add(age1[age%10]);
        	age=age/10;
        }
        Collections.reverse(temp);
        for(int i=0; i<temp.size(); i++) {
        	answer+=temp.get(i);
        }
        return answer;
    }
}