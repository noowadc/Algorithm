import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        
        Map<Integer, Integer> attackInfo = new HashMap<>();
        int endTime = 0;
        int successiveTime = 0;
        int answer = 0;
        
        answer = health;
        for (int[] attack : attacks) {
            attackInfo.put(attack[0], attack[1]);
            endTime = attack[0];
        }
        
         for (int i = 1; i <= endTime; i++) {
            if (attackInfo.containsKey(i)) { // 공격이 있다면
                answer -= attackInfo.get(i);
                successiveTime = 0;
            } else { // 공격이 없다면
                answer += bandage[1];
                successiveTime++;

                if (successiveTime == bandage[0]) {
                    answer += bandage[2];
                    successiveTime = 0;
                }
                if (answer > health) {
                    answer = health;
                }
            }

            if (answer <= 0) { // 이번 턴을 마치고 체력이 바닥났다면 종료
                return -1;
            }
        }
        

        return answer;
    }
}