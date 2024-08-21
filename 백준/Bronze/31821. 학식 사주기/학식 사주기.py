n = int(input())
arr = []
for _ in range(n):
    arr.append(int(input()))

m = int(input())

ans = 0
for _ in range(m):
    b = int(input())
    ans += arr[b - 1]
print(ans)