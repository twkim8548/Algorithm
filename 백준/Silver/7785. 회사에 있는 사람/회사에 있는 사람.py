import sys

input = sys.stdin.readline


n = int(input())

arr = dict()

for i in range(n):
    name, status = input().split()
    if status == "enter":
        arr[name] = True
    else:
        if name in arr:
            arr[name] = False


for name in sorted(arr, reverse=True):
    if arr[name]:
        print(name)