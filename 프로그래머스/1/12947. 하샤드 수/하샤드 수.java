class Solution {
    public boolean solution(int x) {
        int answer = 0;
        int originalX = x;
        
        while(x > 0) {
            answer += x % 10;
            x /= 10;
        }
        
        if(originalX % answer == 0)
            return true;
        
        return false;
    }
}