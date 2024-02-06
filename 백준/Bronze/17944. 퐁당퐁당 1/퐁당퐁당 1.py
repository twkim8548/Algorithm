N, T = map(int, input().split())

cnt = 0
isDown = False
for i in range(1, T + 1):
    if cnt == 2 * N:
        isDown = True
    elif cnt == 1:
        isDown = False

    if isDown:
        cnt -= 1
    else:
        cnt += 1

print(cnt)