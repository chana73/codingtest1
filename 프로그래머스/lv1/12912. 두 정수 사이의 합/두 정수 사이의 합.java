        class Solution {
            public long solution(int a, int b) {
                long answer = 0;
                int big; //큰 수와
                int small; // 작은 수를 담을 통을 만들어 준다.

                if (a>b) { //만약 a가 b보다 크다면 a가 big이 되고 b가 small
                    big = a;
                    small = b;
                } else if (a<b) { //만약 b가 a보다 크다면 b가 big이 되고 a가 small
                    small = a;
                    big = b;
                } else { //a와 b가 같다면 아무거나 return이니까 그냥 a로 둠.
                    return a;
                }

                for (int i = small; i<=big; i++) { //i가 small인 수 ~ big까지 for문으로 돌려서
                    answer += i; // i를 answer 에 계속 더해줌
                }

                return answer;
            }
        }