import sys

input = sys.stdin.readline


n = int(input())

arr = []
me = int(input())

for i in range(n-1):
    arr.append(int(input()))

ans = 0
if n == 1:
    print(0)
else:
    while me <= max(arr):
        arr[arr.index(max(arr))] -= 1
        me += 1
        ans += 1

    print(ans)