n, x = map(int, input().split())

arr = []

for i in range(n):
    s, t = map(int, input().split())
    if s + t <= x:
        arr.append(s)
if len(arr) == 0:
    print(-1)
else:
    print(sorted(arr)[-1])