class Solution {
    boolean solution(String s) {
        int count_p = 0;
        int count_y = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if(s.toLowerCase().charAt(i) == 'p') {
                count_p++;
            } else if(s.toLowerCase().charAt(i) == 'y') {
                count_y++;
            }
        }
        
        if(count_p == count_y)
            return true;
        else
            return false;
    }
}
