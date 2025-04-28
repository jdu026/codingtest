class Solution {
    public int solution(int[] num_list) {
        int evenNum = 0;
        int oddNum = 0;
        
        for(int i=0; i<num_list.length; i++){
            if(i%2 == 0){
                evenNum += num_list[i];
            }
            else{
                oddNum += num_list[i];
            }
        }
        
        return (oddNum > evenNum) ? oddNum : evenNum;
        //모두 더한 홀수랑 모두 더한 짝수를 비교해서 더 큰 것을 반환.
    }
}