// class Solution {
//     public String solution(String letter) {
//         String answer = "";
//         String[] morse = {".-","-...","-.-.","-..",".","..-.",
//                 "--.","....","..",".---","-.-",".-..","--","-.",
//                 "---",".--.","--.-",".-.","...","-","..-","...-",
//                 ".--","-..-","-.--","--.."};
//         String alph = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
//         String[] al = alph.split(" ");
       
//         String[] str = letter.split(" ");
               
//         for(int i = 0;i<str.length;i++){
//             for(int j = 0;j<morse.length;j++){
//                 if(str[i] == morse[j]) {
//                     answer += al[j];
//                     break;
//                 }
//             }
//         }
        
//         return answer;
//     }
// }

class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        String[] morseString;
        morseString = letter.split(" ");

        StringBuilder sb = new StringBuilder();
        for (String word : morseString) {
            for (int i = 0; i < morse.length; i++) {
                if (word.equals(morse[i])) sb.append(Character.toString(i + 'a'));
            }
        }
        return sb.toString();
    }
}