class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int concatValue = Integer.valueOf((String.valueOf(a) + String.valueOf(b)));
        int concatValue2 = a*b*2;
        
        return concatValue > concatValue2 ? concatValue : concatValue2;
        //조건식 ? 참일 때 값 : 거짓일 때 값;
    }
}