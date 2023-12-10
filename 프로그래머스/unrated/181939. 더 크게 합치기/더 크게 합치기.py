def solution(a, b):
    answer = 0
    strA = int(str(a)+ str(b))
    strB = int(str(b)+ str(a))
    if (strA >= strB):
        answer += strA
    else:
        answer += strB
    return answer