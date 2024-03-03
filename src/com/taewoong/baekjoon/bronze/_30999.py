import math

n, m = map(int, input().split())
ans = 0
for _ in range(n):
    str = input()
    cnt = 0
    for c in str:
        if c == 'O':
            cnt += 1
    if math.ceil(m/2) <= cnt:
        ans += 1
print(ans)
