import sys

input = sys.stdin.readline

P = int(input())
C = int(input())

ans = 0

ans += P * 50
ans -= C * 10

if P > C:
    ans += 500

print(ans)