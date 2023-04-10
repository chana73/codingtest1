import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        // Map ; <Key, value>
        HashMap<String, Integer> map = new HashMap<>();
        // 참여자 숫자 세기
        for (String man : participant) {
            map.put(man, map.getOrDefault(man, 0)+1);
            // mislav
            // 첫번째 mislav
            // map.put("mislav", map.getOrDefault("mislav", 0)+1)
            // -> ("mislav", 1)
            // 두번째 mislav
            // map.put("mislav", map.getOrDefault("mislav", 0)+1)
            //                   ---------------------------- 1
            // -> ("mislav", 2)
        }

        // 완주한 사람 제거하기
        for (String man : completion) {
            map.put(man, map.get(man) - 1);
        }

        // 완주에 실패한 동명이인 찾기 <key, 1>
        for (Map.Entry<String, Integer> elem : map.entrySet()) { //Map의 for문 사용법
            if (elem.getValue() == 1) answer = elem.getKey();
        }
        
        return answer;
    }
}

/*

문제
마라톤에 참여한 선수 : participant
그 중 완주한 선수 : completion
완주 못한 선수 : return

** completion.length = participant.length-1
동명이인 있음
 */
