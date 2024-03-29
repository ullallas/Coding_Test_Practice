class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        
        for (String s : number.split("")) {
            sum += Integer.parseInt(s);
            answer = sum%9;
        }
        
        return answer;
    }
}