class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int ha = 0;
        int temp =x;
        
        while(temp>0) {
            if(temp==10) ha+=temp/10;
            else ha+=temp%10;
            temp/=10;
        }
        
        answer = x%ha==0 ? true : false; 
        return answer;
    }
}