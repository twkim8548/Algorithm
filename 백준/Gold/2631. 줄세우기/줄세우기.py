import sys

input = sys.stdin.readline

dp = [0] * 201

n = int(input())
arr = [0]
for i in range(n):
    arr.append(int(input()))

dp[1] = 1

for i in range(2, n+1):
    dp_arr = [1]
    for j in range(1, i):
        if arr[j] < arr[i]:
            dp_arr.append(dp[j] + 1)
    dp[i] = max(dp_arr)
print(n-max(dp))