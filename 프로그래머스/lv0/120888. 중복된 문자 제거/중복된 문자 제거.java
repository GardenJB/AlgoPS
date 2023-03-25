import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        Set<String> set = new LinkedHashSet<>();
		String[] st = my_string.split("");
		for(int i=0; i<st.length; i++) {
			set.add(st[i]);
		}
		
		answer = String.join("", set);
      
        // for(int i =0; i<my_string.length();i++){
        //     if(my_string.indexOf(my_string.charAt(i))==i){
        //         answer += my_string.charAt(i);
        //     }
        // }
        return answer;
    }
}