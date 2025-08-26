import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=1; i<=n; i++){
            if(i%k == 0){
                list.add(i);
            }
        }
        
        int[] answer = new int[list.size()]; //가변적이기 때문에 최종적으로 얼마나 들어갔는지 알수 없다 그래서 list.size()만큼 길이를 가진 배열로 만들기
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i); //get: Arraylist안에 들어있는 값을 인덱스로 꺼내오는기능
        }
        return answer;
    }
}