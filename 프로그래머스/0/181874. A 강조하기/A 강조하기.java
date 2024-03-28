class Solution {
    public String solution(String myString) {
        String answer = "";
        String lowerCase = "";
        String a = "a";
        
        lowerCase = myString.toLowerCase();
        answer = lowerCase.replace(a, a.toUpperCase());
        
        return answer;
    }
}