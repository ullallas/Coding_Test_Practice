import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); // 중복을 제거하기 위한 HashSet
        
        // 중복을 제거하여 HashSet에 폰켓몬의 종류 번호 추가
        for (int num : nums) {
            set.add(num);
        }
        
        // 중복을 제거한 폰켓몬의 종류 수와 N/2 중 작은 값을 선택하여 반환
        return Math.min(set.size(), nums.length / 2);
    }
}
