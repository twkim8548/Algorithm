import sys

input = sys.stdin.readline


n = int(input())
arr = []
for i in range(n):
    arr.append(int(input()))

arr.reverse()
prev_score = arr[0]
ans = 0
for i in range(1, n):
    if prev_score - 1 <= arr[i]:
        ans += (arr[i] - (prev_score - 1))
        prev_score = prev_score - 1
    else:
        prev_score = arr[i]
print(ans)