import sys

input = sys.stdin.readline


n = int(input())

arr = [0] + list(map(int, input().split()))

dp = [0] * 1001

dp[1] = 1

for i in range(2, n+1):
    dp_arr = [1]

    for j in range(1, i+1):
        if arr[i] > arr[j]:
            dp_arr.append(dp[j] + 1)
    dp[i] = max(dp_arr)

print(max(dp))