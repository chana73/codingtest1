class Solution {
    public String solution(String[] seoul) {
        String answer = "";

        for (int i=0; i< seoul.length; i++) {
            //System.out.println(seoul[i]);

            // Kim이 발견되면 그 인덱스(i)가 몇번인지 출력해보세요.
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 " +i+"에 있다";
                
            }
        }
        return answer;
    }
}