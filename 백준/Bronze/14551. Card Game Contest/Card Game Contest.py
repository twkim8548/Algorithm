n, m = map(int, input().split())
ans = 1
for i in range(n):
    a = int(input())
    ans *= a if a > 0 else 1

print(ans % m)
