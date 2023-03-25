class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        // String temp = num+"";
        // boolean ch = false;
        // for(int i=0; i<temp.length(); i++) {
        //     if(Integer.parseInt(temp.valueOf(temp.charAt(i)))==k) {
        //         answer = i+1;
        //         ch=true;
        //         break;
        //     }
        //     if(!ch) answer = -1;
        // }
        
        String n = String.valueOf(num);
        
        System.out.println(n);
        answer = n.indexOf(String.valueOf(k))>=0? n.indexOf(String.valueOf(k))+1 : -1;
        return answer;
    }
}