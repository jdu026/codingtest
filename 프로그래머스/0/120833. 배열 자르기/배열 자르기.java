class Solution {
//numbers: 원본배열, num1: 잘라낼 시작 인덱스, num2: 잘라낸 끝 인덱스
//num2-num1+1을 한이유: 예를 들어 num1=1, num2=3이면 answer의 크기는 3-1+1=3(새로운배열의크기)
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        int index = 0;
        
        for(int i = num1; i<=num2; i++){
            answer[index] = numbers[i];
            index++;
        }
        
        return answer;
    }
}