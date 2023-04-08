class Solution {
    public long[] solution(int x, int n) {
            long[] answer = new long[n]; // x = 2, n = 5
            // answer { answer[0], answer[1], answer[2], answer[3], answer[4] }
            for (int i=0; i<n; i++) {
                answer[i] = (long) x *(i+1);
            }
            return answer;
    }
}