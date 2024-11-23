import sys

input = sys.stdin.readline


n = int(input())

arr = [0] + list(map(int, input().split()))

dp = [1] * (n + 1)

dp[1] = 1

for i in range(1, n+1):
    arr_dp = [1]
    for j in range(1, i):
        if arr[j] > arr[i]:
            arr_dp.append(dp[j] + 1)
    dp[i] = max(arr_dp)

print(max(dp))
