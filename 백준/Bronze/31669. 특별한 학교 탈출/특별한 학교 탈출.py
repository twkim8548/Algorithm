n, m = map(int, input().split())

arr = [False for _ in range(m)]
for i in range(n):
    for j, c in enumerate(input()):
        if not arr[j]:
            arr[j] = False if c == 'X' else True

print(arr.index(False) + 1 if arr.count(False) > 0 else 'ESCAPE FAILED')