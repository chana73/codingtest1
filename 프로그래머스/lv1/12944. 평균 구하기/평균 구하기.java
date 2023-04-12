
        class Solution {
            public double solution(int[] arr) {
                double answer = 0;
                int array = 0;

                for (int i =0; i<arr.length; i++) {
                    array += arr[i];
                }
                answer = (double) array/arr.length;

                return answer;
            }
        }