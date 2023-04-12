    class Solution {
        public long solution(int price, int money, int count) {
            long answer = -1;
            // 총 얼마를 내야 하는지 : price, count
            long total = 0; // count 번 탔을 때 총 얼마를 내야 하는지
            for (int i = 0; i < count; i++) { // price = 3, count = 4
                total += (long) price * (i + 1);
            } // total = 30, money = 40
            // 그만큼 타려면 얼마가 부족한지 : total, money -> answer
            answer = (long) total - money;
            if (answer < 0) {
                return 0;
            } else {
                return answer;
            }
        }
    }