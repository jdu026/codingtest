function solution(l, r) {
    var answer = [];

    for (let i = l; i <= r; i++) {
        let str = String(i);
        let isValid = true;

        for (let j = 0; j < str.length; j++) {
            if (str[j] !== "0" && str[j] !== "5") {
                isValid = false;
                break;
            }
        }

        if (isValid) {
            answer.push(i);
        }
    }

    if (answer.length === 0) {
        answer.push(-1);
    }

    return answer;
}