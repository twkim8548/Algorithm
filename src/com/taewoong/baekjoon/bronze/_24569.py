import sys

input = sys.stdin.readline

n = int(input())
arr = []
cnt = 0
for _ in range(n):
  plus = int(input())
  minus = int(input())
  arr.append(plus * 5 - minus * 3)
  if plus * 5 - minus * 3 > 40:
    cnt += 1

print(cnt, end='')
if cnt == n:
  print('+')
