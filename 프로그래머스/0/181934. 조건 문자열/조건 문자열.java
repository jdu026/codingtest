class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        
        if(n<m){
            return ineq.equals("<") ? 1:0; //n<m일때 ineq이 문자열 < 와 같으면 1, 아니면 0 
        }
        else if(n>m){
            return ineq.equals(">") ? 1:0; //n>m일때 eq이 문자열 > 와 같으면 1, 아니면 0
        }
        else{
            return eq.equals("=") ? 1:0;
        }
    }
}