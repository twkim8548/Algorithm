def solution(str1, str2):
    answer = ''
    for i in range(len(str1) * 2):
        if i % 2 == 0:
            answer += (str1[int(i/2)])
        else:
            answer += (str2[int(i/2)])
    return answer