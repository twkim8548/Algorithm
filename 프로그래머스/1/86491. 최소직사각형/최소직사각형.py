def solution(sizes):
    answer = 0
    maxW = 0
    maxH = 0
    for size in sizes:
        size.sort()

        if size[0] > maxW:
            maxW = size[0]
        if size[1] > maxH:
            maxH = size[1]
    answer = maxW * maxH
    return answer