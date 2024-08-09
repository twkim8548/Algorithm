ans = 0
arr = []
x, y = 1, 1
for _ in range(9):
    arr.append(list(map(int, input().split())))
for i in range(9):
    for j in range(9):
        if ans < arr[i][j]:
            ans = arr[i][j]
            x = i + 1
            y = j + 1
print(ans)
print(x, y)