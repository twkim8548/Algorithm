import sys

input = sys.stdin.readline

arr = []
for _ in range(4):
    sub = []
    for _ in range(13):
        sub.append(False)
    arr.append(sub)

for _ in range(51):
    str, num = input().strip().split()
    num = int(num)
    if str == 'S':
        arr[0][num-1] = True
    elif str == 'B':
        arr[1][num-1] = True
    elif str == 'V':
        arr[2][num-1] = True
    elif str == 'K':
        arr[3][num-1] = True

for i in range(4):
    for j in range(13):
        if not arr[i][j]:
            if i == 0:
                print("S", j + 1)
                break
            elif i == 1:
                print("B", j + 1)
                break
            elif i == 2:
                print("V", j + 1)
                break
            elif i == 3:
                print("K", j + 1)
                break
                