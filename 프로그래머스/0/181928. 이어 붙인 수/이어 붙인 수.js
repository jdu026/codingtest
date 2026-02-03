function solution(num_list) {
    var answer = 0;
    
    let a = num_list.filter(n1 => (n1%2 == 1));
    let b = num_list.filter(n2 => (n2%2 == 0));
    
    let evenNum = Number(a.join(''));
    let oddNum = Number(b.join(''));
    
    answer = evenNum + oddNum;
    
    return answer;
}