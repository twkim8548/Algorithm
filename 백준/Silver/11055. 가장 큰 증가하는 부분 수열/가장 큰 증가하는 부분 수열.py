import sys

input = sys.stdin.readline

# 1, 100, 2, 50, 60, 3, 5, 6, 7, 8


n = int(input())

arr = [0] + list(map(int, input().split()))
dp = [0] * (n + 1)
dp[1] = arr[1]

for i in range(2, n + 1):
    dp_arr = [arr[i]]

    for j in range(1, i):
        if arr[j] < arr[i]:
            dp_arr.append(dp[j] + arr[i])
    dp[i] = max(dp_arr)

print(max(dp))
