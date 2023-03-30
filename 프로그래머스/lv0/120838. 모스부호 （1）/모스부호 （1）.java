class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] l =letter.split(" ");
        String[] e = {"a", "b", "c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] m ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        for(int i=0; i<l.length; i++){
            for(int j=0; j<m.length; j++){
                if(l[i].equals(m[j])){
                    answer += e[j];
                }
            }
        }
        return answer;
    }
}