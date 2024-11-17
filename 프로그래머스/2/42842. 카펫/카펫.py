def solution(brown, yellow):
    answer = []
    for x in range(3, brown):
        for y in range(x, brown):
            if (x * 2) + ((y - 2) * 2) == brown and (x - 2) * (y - 2) == yellow:
                answer.append(x)
                answer.append(y)
                break
            if answer:
                break
    
    answer.sort(reverse=True)
    return answer