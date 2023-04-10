import java.util.*;

class Solution {
    public int[] solution(long n) {
        long copy = n;

        // 자리수 세기
        int cnt = 0;
        while (copy != 0) {
            cnt++;
            copy /= 10;
        }

        int[] answer = new int[cnt];
        for(int i = 0; i < cnt; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }

        return answer;
    }
}