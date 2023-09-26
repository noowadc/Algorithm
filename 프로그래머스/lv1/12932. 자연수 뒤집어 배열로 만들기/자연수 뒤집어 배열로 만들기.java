class Solution {
    public int[] solution(long n) {

        String str = Long.toString(n);
        int b = str.length();
        int[] answer = new int[b];
        for(int i = 0;i<b;i++){
            answer[i] = (str.charAt(b - i - 1))-'0';
        }
        
        return answer;
    }
}