class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = strArr;
        
        for (int i=0; i<strArr.length; i++) {
            if(i%2 == 0) {
                answer[i] = strArr[i].toLowerCase();
            } else {
                answer[i] = strArr[i].toUpperCase();
            }
        }
        
        return answer;
    }
}