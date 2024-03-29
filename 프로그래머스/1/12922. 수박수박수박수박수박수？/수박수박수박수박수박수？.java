class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder(); // 결과 문자열을 저장할 StringBuilder 객체 생성
        
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0) { // 짝수번째 인덱스에 "수" 추가
                answer.append("수");
            } else { // 홀수번째 인덱스에 "박" 추가
                answer.append("박");
            }
        }
        
        return answer.toString(); // StringBuilder 객체를 문자열로 변환하여 반환
    }
}