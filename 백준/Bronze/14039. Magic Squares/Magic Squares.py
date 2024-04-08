arr = []
for i in range(4):
    arr.append(list(map(int, input().split())))
    tot = sum(arr[i])

isSame = True
for i in range(4):
    if arr[i][0] + arr[i][1] + arr[i][2] + arr[i][3] != tot:
        isSame = False
    if arr[0][i] + arr[1][i] + arr[2][i] + arr[3][i] != tot:
        isSame = False

if isSame is not True:
    print("not magic")
else:
    print("magic")