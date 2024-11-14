import sys

input = sys.stdin.readline


n = int(input())
k = int(input())

if k > n:
    print(0)
    exit(0)

arr = list(map(int, input().split()))
arr.sort()

arr_dis = []

for i in range(1, len(arr)):
    arr_dis.append(arr[i] - arr[i - 1])

while len(arr_dis) > n - 1 - (k - 1):
    find_idx = arr_dis.index(max(arr_dis))
    arr_dis = arr_dis[0:find_idx] + arr_dis[find_idx + 1:]

print(sum(arr_dis))