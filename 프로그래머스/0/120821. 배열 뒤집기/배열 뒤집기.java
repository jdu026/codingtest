class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i=0; i<answer.length; i++){     //입력 배열과 같은 크기의 새로운 배열 선언.
            answer[i] += num_list[num_list.length -i -1];   //i는 정방향 인덱스, num_list.length -i -1은 역방향 인덱스(answer[i]에 num_list의 역순 요소를 복사함).
        }
        return answer;
    }
}