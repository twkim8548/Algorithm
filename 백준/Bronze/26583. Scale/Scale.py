import sys

input = sys.stdin.readline

while True:
    str = input().strip()
    if (str is None) or (str == ""):
        break
    arr = list(map(int, str.split()))
    for i in range(len(arr)):
        if i == 0:
            print(arr[i] * arr[i+1], end=" ")
        elif i == len(arr) - 1:
            print(arr[i] * arr[i-1], end=" ")
        else:
            print(arr[i] * arr[i+1] * arr[i-1], end=" ")
    print()