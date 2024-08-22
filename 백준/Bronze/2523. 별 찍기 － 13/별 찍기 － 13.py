n = int(input())
cnt = 1
isMax = False
for i in range(2*n + 1):
    for _ in range(cnt):
        print('*', end='')
    if cnt >= n:
        isMax = True
    if isMax:
        cnt -= 1
    else:
        cnt += 1
    print()
