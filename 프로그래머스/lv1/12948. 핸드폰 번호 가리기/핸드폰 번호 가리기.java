class Solution {
        public String solution(String phone_number) {
        String answer = "";

        String dui = phone_number.substring(phone_number.length()-4, phone_number.length());
//        System.out.println(dui);

        int nStar = phone_number.length() - 4;
        String ap = "";

        for (int i =0; i<nStar; i++) {
            ap += "*";
        }
        System.out.println(ap);

        answer = ap + dui;

        return answer ;
    }
}