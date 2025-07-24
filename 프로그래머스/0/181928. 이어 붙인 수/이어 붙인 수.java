class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        
        for(int num : num_list){
            if(num%2 == 0)
                even.append(num);
            else
                odd.append(num);
        }
        int evenNum = Integer.parseInt(even.toString());
        int oddNum = Integer.parseInt(odd.toString());
        
        answer = evenNum + oddNum;
        return answer;
    }
}