class Solution {
    public int[] solution(int[] arr) {
        int min = arr[0];


        if (arr.length ==1) {
            return new int[]{-1};
        }

        for (int i =0; i<arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int index =0;
        int[] answer = new int[arr.length-1];
        for (int j =0; j<arr.length; j++) {
            if (min==arr[j]) {
                continue;
            } else {
                answer[index] = arr[j];
                index++; //4,3,1,2  answer[0] =arr[0] -> [4 채워짐]
                        //
            }
        }


        return answer;
    }
}