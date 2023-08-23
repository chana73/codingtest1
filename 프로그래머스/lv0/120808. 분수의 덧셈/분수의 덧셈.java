class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numerator = (numer1*denom2)+(numer2*denom1);
        int denomirator = (denom1*denom2);
        int max = 1;
            
        for(int i = 1; i<= numerator && i<=denomirator; i++) {
            if(numerator%i == 0 && denomirator%i == 0) {
                max = i;
            }
        }
        
        numerator = numerator/max;
        denomirator = denomirator/max;
        
        int[] answer = {numerator, denomirator};
        
        return answer;
    }
}