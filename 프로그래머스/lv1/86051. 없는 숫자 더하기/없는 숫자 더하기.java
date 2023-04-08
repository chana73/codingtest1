class Solution {
        public static void main(String[] args) {
            Solution solution = new Solution();
//            System.out.println(Solution6.solution(new int[]{1,2,3,4,6,7,8,0}));
        }

        public int solution(int[] numbers) {
            int answer = 45;
            // numbers에 있는 숫자를 하나씩 꺼내기
            // numbers = {1, 2, 3, 4, 6, 7, 8, 0} => numbers.length() = 8
            //   index = {0, 1, 2, 3, 4, 5, 6, 7} => 7 = numbers.length() - 1

            for (int i=0; i<=(numbers.length - 1); i++) { // i가 0부터 10[numbers.length() - 1]까지 반복문
                System.out.println("index = " + i + ", numbers[" + i + "] = " + numbers[i]);
                answer -= numbers[i];
                //        answer = answer - (i - numbers[i]);
                // i = 0, answer =   45   - (0 - 1) = 46
                // i = 0, answer =   45   -  numbers[0] = 44
                // i = 1, answer =   44   -  numbers[1] = 42
                //        answer = answer -  numbers[i]
                // answer += 1
                // answer = answer + 1

            }
            return answer;
        }
    }