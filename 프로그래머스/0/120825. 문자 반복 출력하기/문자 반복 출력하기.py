def solution(my_string, n):
    answer = []
    for i in my_string:
        answer.append(i*n)
    return "".join(i*n for i in my_string)