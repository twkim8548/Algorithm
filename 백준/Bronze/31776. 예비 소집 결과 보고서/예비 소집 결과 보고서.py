n = int(input())

ans = 0

for i in range(n):
    t1, t2, t3 = map(int, input().split())
    if t1 == -1 and t2 == -1 and t3 == -1:
        continue

    isSolved = False
    if t3 != -1:
        if t2 != -1 and t2 <= t3 and t1 != -1 and t1 <= t2:
            isSolved = True
    elif t2 != -1:
        if t1 != -1 and t1 <= t2:
            isSolved = True
    elif t1 != -1:
        isSolved = True
    if isSolved:
        ans += 1

print(ans)