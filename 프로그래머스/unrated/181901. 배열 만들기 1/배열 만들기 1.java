class Solution {
    public int[] solution(int n, int k) {
        int p = n/k;
        int[] answer = new int[p];

        for (int i = 0; i < p; i++) {
            answer[i] = k*(i+1);
        }

        return answer;
    }
}