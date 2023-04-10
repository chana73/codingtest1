class Solution {
    public boolean solution(String s) {
        boolean answer = true;

        if (s.length() ==4 || s.length() ==6) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                // '0' = 48, '9' = 57
                if (48 < c && c > 57) { // 숫자 아니면
                    return false; // 바로 false 반환하고 끝내
                }
            }
            return true; // 검사를 무사히 마쳤다면 당연히 숫자로만 이루어졌겠지
        } else {
            return false;
        }
    }
}

/*
문제
1. 문자열 s의 길이가 4 or 6 그리고 숫자로만 구성되어있는지 확인 하는 함수
    "a234" -> false : 문자열의 길이는 4이지만, 알파벳이 포함
    "1234" -> True
    "12345" -> false : 문자열의 길이가 5
2. ** 길이 1<=s<=8
      대소문자/0~9 숫자

풀이 방법
1. 모든 글자를 확인하면서 숫자인지 아닌지 체크한다. (아스키 코드 활용)
2. (수준 높은 방법) 문자열의 숫자를 전부 제거하고, 문자열의 길이를 체크
    문자열의 길이가 0이 아니면 false (문자열에 알파벳이 남았다는 뜻이므로)
 */