import sys

input = sys.stdin.readline


n = int(input())

arr = list(map(int, input().split()))
reversed_arr = arr[::-1]

increase_dp = [1] * n
decrease_dp = [1] * n

for i in range(n):

    for j in range(i):
        if arr[i] > arr[j]:
            increase_dp[i] = max(increase_dp[i], (increase_dp[j] + 1))
        if reversed_arr[i] > reversed_arr[j]:
            decrease_dp[i] = max(decrease_dp[i], (decrease_dp[j] + 1))

decrease_dp = decrease_dp[::-1]

result = []

for i in range(n):
    result.append(decrease_dp[i] + increase_dp[i] - 1)



print(max(result))