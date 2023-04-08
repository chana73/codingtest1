class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
               /*
        arr1          arr2
        | 1 | 2 |    | 3 | 4 |     | 4 | 6 |
        | 2 | 3 |    | 5 | 6 |  =  | 7 | 9 |
        | 7 | 0 |    | 1 | 2 |     | 8 | 2 |
         */

                int nRow = arr1.length;
                int nCol = arr1[0].length;

                int[][] answer = new int[nRow][nCol];

                for (int r = 0; r < nRow; r++) {
                    for (int c = 0; c < nCol; c++) {
                        answer[r][c] = arr1[r][c] + arr2[r][c];
//                System.out.println("arr1["+(r+1)+"]["+(c+1)+"] = "+arr1[r][c]);
                    }
//            System.out.println(Arrays.toString(answer[r]));
                }
                return answer;
    }
}