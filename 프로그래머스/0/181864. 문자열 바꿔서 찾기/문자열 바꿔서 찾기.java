class Solution {
    public int solution(String myString, String pat) {
        String changed = "";
        
        for(int i=0; i < myString.length(); i++){
            char c = myString.charAt(i);
            if(c == 'A') changed += 'B';
            else changed += 'A';
            }
            
            for(int i=0; i<= changed.length() - pat.length(); i++){
                boolean check = true;
                
                for(int j=0; j<pat.length(); j++){
                    if(changed.charAt(i+j) != pat.charAt(j)){
                        check = false;
                        break;
                    }
                }
                if(check) return 1;
            }
        return 0;
        }
    }