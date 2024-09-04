a, b, c, m = map(int, input().split())
ans = 0

p = 0
w = 0
for i in range(24):
    if p + a <= m:
        w += b
        p += a
    else:
        p -= c
        if p < 0:
            p = 0

print(w)

