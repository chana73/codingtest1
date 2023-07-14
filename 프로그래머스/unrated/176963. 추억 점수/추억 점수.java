import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        List<Integer> answerList = new ArrayList<>();

        for (String[] rememberList : photo) {
            int sum = 0;
            for (int j = 0; j < name.length; j++) {
                List<String> strList = new ArrayList<>(Arrays.asList(rememberList));
                if (strList.contains(name[j]))
                    sum += yearning[j];
            }
            answerList.add(sum);
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}