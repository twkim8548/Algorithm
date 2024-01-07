import sys

input = sys.stdin.readline


N = int(input())

str = input().strip()
cnt = 0
for i in range(N//2):
    if str[i] != str[N - 1 - i]:
        cnt += 1
print(cnt)