class Solution {
    public String solution(String[] my_strings, int[][] parts) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < parts.length; i++) {
			String substring = my_strings[i].substring(parts[i][0], parts[i][1]+1);
			sb.append(substring);
		}
        return sb.toString();
    }
}