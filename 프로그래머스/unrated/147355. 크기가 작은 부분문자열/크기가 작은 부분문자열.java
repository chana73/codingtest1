class Solution {
	public int solution(String t, String p) {
		int answer = 0;

		for (int i=0; i<t.length()-p.length()+1; i++ ) {
			String a = t.substring(i, i + p.length());

			Long a_num = Long.parseLong(a);
			Long p_num = Long.parseLong(p);

			if (a_num<=p_num) {
				answer++;
			}
		}

		return answer;
	}
}