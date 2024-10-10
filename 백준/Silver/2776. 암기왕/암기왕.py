import sys

input = sys.stdin.readline


def find_number(i, arr):
    low = 0
    high = len(arr) - 1
    while low <= high:
        mid = (low + high) // 2

        if arr[mid] == i:
            return 1

        if arr[mid] < i:
            low = mid + 1
        elif arr[mid] > i:
            high = mid - 1
    return 0


for i in range(int(input())):
    n = int(input())
    arr = list(map(int, input().split()))
    m = int(input())
    find_arr = list(map(int, input().split()))

    arr.sort()
    for j in find_arr:
        print(find_number(j, arr))