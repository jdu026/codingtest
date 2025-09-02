class Solution {
    public String solution(String code) {
        StringBuilder result = new StringBuilder();
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);

            if (c == '1') {
                // '1'을 만나면 mode 전환
                mode = (mode == 0) ? 1 : 0;
            } else {
                // mode와 인덱스 조건 체크
                if (mode == 0 && i % 2 == 0) {
                    result.append(c);
                } else if (mode == 1 && i % 2 == 1) {
                    result.append(c);
                }
            }
        }

        return result.length() > 0 ? result.toString() : "EMPTY";
    }
}
