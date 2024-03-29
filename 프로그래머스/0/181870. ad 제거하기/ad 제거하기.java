import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String[] strArr) {
        
        List<String> list = new ArrayList<>(Arrays.asList(strArr));
        
        for(int i=0; i<strArr.length; i++) {
            if(strArr[i].contains("ad")) {
                list.remove(strArr[i]);
            }
        }
        
        return list.toArray(new String[0]);
    }
}