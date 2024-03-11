n, s = map(int, input().split())
ans = 0
for i in range(n):
    a = int(input())
    ans += a
    if ans > s and i < n - 1:
        ans -= 1

print(ans)
