class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = Integer.toString(order);
        char[] arr = new char[str.length()];
        
        for(int i = 0;i<str.length();i++){
            arr[i] = str.charAt(i);
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == '3' || arr[i] == '6' || arr[i]== '9') answer++;
        }
        return answer;
    }
}