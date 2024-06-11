n, l = map(int, input().split())
ans = 0
arr = []
for i in range(n):
    isBlack = False
    cnt = 0
    for c in input():
        if c == '1':
            if not isBlack:
                cnt += 1
            isBlack = True
        else:
            isBlack = False
    arr.append(cnt)

print(max(arr), arr.count(max(arr)))
