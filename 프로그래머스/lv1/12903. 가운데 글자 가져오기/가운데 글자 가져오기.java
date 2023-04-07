class Solution {
    public String solution(String s) {
        String answer = "";
        

        // s의 길이가 홀수일까? 짝수일까?
        if (s.length()%2==0) {
            // 짝수일 때, (가운데 두글자 추출)
            answer = s.substring(s.length()/2-1, (s.length()/2+1));
        } else {
            // 홀수일 때, (가운데 한글자 추출)
            answer = s.substring(s.length() / 2, (s.length() / 2) + 1); // c
        }

        return answer;
    }
}