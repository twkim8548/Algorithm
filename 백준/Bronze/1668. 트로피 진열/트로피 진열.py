n = int(input())
arr = []
for i in range(n):
    arr.append(int(input()))

ans = 0
m = 0
for i in arr:
    if i > m:
        ans += 1
        m = i
print(ans)
ans = 0
m = 0
arr.reverse()
for i in arr:
    if i > m:
        ans += 1
        m = i
print(ans)
