import java.util.Arrays;  // 꼭 필요!

class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int last = num_list[len - 1];
        int secondLast = num_list[len - 2];

        // 새로운 값 계산
        int newVal;
        if (last > secondLast) {
            newVal = last - secondLast;
        } else {
            newVal = last * 2;
        }

        // 배열 복사 후 마지막에 새 값 추가
        int[] answer = Arrays.copyOf(num_list, len + 1);
        answer[len] = newVal;

        return answer;
    }
}
