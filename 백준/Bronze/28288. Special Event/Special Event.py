n = int(input())
arr = [0, 0, 0, 0, 0]
for i in range(n):
    for index, j in enumerate(input()):
        if j == 'Y':
            arr[index] += 1

m = max(arr)
ans = []
for i, v in enumerate(arr):
    if v == m:
        ans.append(f"{i + 1}")
print(','.join(ans))

