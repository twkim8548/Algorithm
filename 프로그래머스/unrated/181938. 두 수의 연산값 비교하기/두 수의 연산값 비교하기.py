def solution(a, b):
    answer = 0
    strA = int(str(a) + str(b))
    strB = 2 * a * b
    if (strA >= strB):
        answer = strA
    else:
        answer = strB
    return answer