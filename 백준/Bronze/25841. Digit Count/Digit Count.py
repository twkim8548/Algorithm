i, j, k = map(int, input().split())
ans = 0
for a in range(i, j + 1):
    a = str(a)
    ans += a.count(str(k))
print(ans)