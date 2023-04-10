class Solution {
    public long solution(long n) {
        long answer = 0;

//        for (int i=0; i<n; i++) {
//            for (int x=0; x<n; x++)
//                if (x==Math.sqrt(n)) {
//                    return answer = (long)Math.pow(x,n);
//                } else {
//                    return  -1;
//                }
//        }

        long x = (long)Math.sqrt(n);

        if(Math.pow(x,2)==n) {
            return (long)Math.pow(x+1,2);
        }else {
            return -1;
        }



    }
}