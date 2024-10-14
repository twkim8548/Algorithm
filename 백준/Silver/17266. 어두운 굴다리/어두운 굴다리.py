import sys

input = sys.stdin.readline

n = int(input())
m = int(input())
arr = list(map(int, input().split()))

max_size = 0
for i in range(1, m):
    max_size = max(max_size, arr[i] - arr[i - 1])

max_size = max((max_size+1) // 2, arr[0], n - arr[-1])

print(max_size)