import sys

input = sys.stdin.readline

ans = 0
endTime = 0

for _ in range(int(input())):
    T, M = map(int, input().split())
    if M == 1:
        ans = max(ans, T - endTime)
        endTime = T
print(ans)
