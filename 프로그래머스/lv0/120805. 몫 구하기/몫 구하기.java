class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        for(int i=0; i<num1; i++) {
            for(int j=0; j<num2; j++) {
                answer = num1/num2;
            }
        }
        return answer;
    }
}