class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i=my_string.length()-1; i>=0; i--){ //문자열을 뒤집어서 순회하기
            answer += my_string.charAt(i);  //현재 인덱스 i에 있는 문자를 가져와 answer에 추가
                                //charAt: 인덱스에 가져오고자 하는 문자의 위치(0부터시작)
        }
        return answer;
    }
}