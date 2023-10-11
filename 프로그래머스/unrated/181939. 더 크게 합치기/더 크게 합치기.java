    class Solution {
        public int solution(int a, int b) {
            int answer = 0;

            String str1 = a+"";
            String str2 = b+"";

            answer = Integer.parseInt(str1+str2);
            int answer2 = Integer.parseInt(str2+str1);

            if (answer < answer2) {
                answer = answer2;
            }
            return answer;
        }
    }