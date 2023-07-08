class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i=0; i<queries.length; i++){
            int[] q = queries[i];
            int a = q[0];
            int b = q[1];
            
            int tmp = arr[a];
            arr[a] = arr[b];
            arr[b] = tmp;
        }
        return arr;
    }
}