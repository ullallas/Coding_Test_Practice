import java.util.Arrays;

class Solution {
    public String solution(String s) {
        
        String[] numbers = s.split(" ");
        
        int[] intArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            intArray[i] = Integer.parseInt(numbers[i]);
        }
        
        Arrays.sort(intArray);
        
        int min = intArray[0];
        int max = intArray[intArray.length - 1];
        
        return min + " " + max;
    }
}
