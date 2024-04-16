n = int(input())
arr = []
for i in range(n):
    arr.append(list(input()))

feeling = int(input())

if feeling == 1:
    for i in range(n):
        for j in range(n):
            print(arr[i][j], end="")
        print()
elif feeling == 2:
    for i in range(n):
        for j in range(n):
            print(arr[i][n-1-j], end="")
        print()
else:
    for i in range(n):
        for j in range(n):
            print(arr[n-1-i][j], end="")
        print()