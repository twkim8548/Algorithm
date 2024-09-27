n = int(input())

arr = list(map(int, input().split()))

v = 0
for i in arr:
    v = 1 - ((1 - v) * (1 - i / 100))
    print(v * 100)
