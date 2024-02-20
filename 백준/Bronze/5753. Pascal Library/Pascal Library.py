while True:
    n, d = map(int, input().split())
    if n == 0 and d == 0:
        break
    arr = []
    for _ in range(n):
        arr.append(True)
    for _ in range(d):
        for index, isParticipate in enumerate(input().split()):
            if not bool(int(isParticipate)):
                arr[index] = bool(int(isParticipate))
    if True in arr:
        print('yes')
    else:
        print('no')
