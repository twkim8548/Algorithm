n = int(input())

a = list(map(int, input().split()))
b = list(map(int, input().split()))

ans = 0
for i in range(n):
    if b[i] < a[i]:
        ans += a[i] - b[i]

print(ans)