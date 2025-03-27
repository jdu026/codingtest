class Solution {
    public int solution(int price) {
        int answer = 0;

        if (price >= 500000) {
            answer = (int)(price * 0.8);    //소수점 계산 결과를 정수로 변환해야 하므로 (int)를 사용
        } else if (price >= 300000) {
            answer = (int)(price * 0.9);
        } else if (price >= 100000) {
            answer = (int)(price * 0.95);
        } else {            //할인 조건에 해당하지 않는 경우 원래 가격을 반환하도록 기본값을 설정
            answer = price;
        }

        return answer;
    }
}
