import java.util.ArrayList;
import java.util.Arrays;


class Solution {
                    public int[] solution(int[] arr, int divisor) {
                        // arr = {5, 9, 7, 10}, divisor = 5
                        // divisor로 나눌 수 있는 지 확인 -> for문
                        // Arraylist 에 나누어지는 녀석들을 집어넣는다 // 5로 나누어지는 녀석들을 모을 거예요

                        ArrayList<Integer> answer = new ArrayList<>(); // 5의 배수를 모아놓을 곳
                        for (int i = 0; i < arr.length; i++) {
                            if (arr[i] % divisor == 0) {
                                answer.add(arr[i]); // 5의 배수이면 집어 넣는다!
                            }
                        }
                        int[] array; // 반환(return)할 배열을 만들어 둔 것
                        if (answer.size() == 0) { // 5의 배수가 입력된 배열에 하나도 없을 때
                            array = new int[]{-1};
                        } else {
                            array = new int[answer.size()]; // answer의 길이만큼의 배열로 설정
                            for (int i = 0; i < array.length; i++) {
                                array[i] = answer.get(i); // 반환할 배열에 값을 저장해주는 것
                            }
                        }
                        Arrays.sort(array); // 오름차순 정렬
                        return array;
                    }
                }