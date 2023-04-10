class Solution {
    boolean solution(String s) {

        int nP = 0;
        int nY = 0;
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'p' || c == 'P') { // 만약에 내가 보는 문자가 p나 P면
                nP += 1; // nP에 세어줘
            } else if (c == 'y' || c =='Y') { // 만약에 내가 보는 문자가 y나 Y면
                nY += 1; // nY에 세어줘
            }
        }
        // nP => p의 개수
        // nY => y의 개수
        boolean a = (nP==nY) ? true : false;
        System.out.println(a);

        return a;
    }
}