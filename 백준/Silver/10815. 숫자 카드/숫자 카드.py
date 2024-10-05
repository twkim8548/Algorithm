import sys

input = sys.stdin.readline

n = int(input())
nArr = list(map(int, input().split()))
m = int(input())
mArr = list(map(int, input().split()))
nArr.sort()


def find_arr(arr, num):
    low = 0
    high = len(arr) - 1

    while low <= high:
        mid = (low + high) // 2
        if arr[mid] == num:
            return True
        else:
            if arr[mid] > num:
                high = mid - 1
            else:
                low = mid + 1
    return False

for i in mArr:
    if find_arr(nArr, i):
        print(1, end=' ')
    else:
        print(0, end=' ')