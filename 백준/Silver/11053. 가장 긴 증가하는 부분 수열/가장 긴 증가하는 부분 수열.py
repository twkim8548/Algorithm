import sys

input = sys.stdin.readline

n = int(input())
arr = [0] + list(map(int, input().split()))

dp = [1] * (n+1)

for i in range(2, n + 1):
    for j in range(1, i):
        if arr[j] < arr[i]:
            dp[i] = max(dp[i], dp[j] + 1)

print(max(dp))