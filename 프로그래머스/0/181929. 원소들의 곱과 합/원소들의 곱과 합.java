class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int product = 1;
        
        for(int num : num_list){
            sum += num;
            product *= num;
        }
        int multiply = sum*sum;
        
        if(product < multiply){
            answer = 1;
        }
        else{
            answer = 0;
        }
        return answer;
    }
}