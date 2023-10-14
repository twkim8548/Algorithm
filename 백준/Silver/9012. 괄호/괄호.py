import sys

input = sys.stdin.readline

T = int(input())

for _ in range(T):
  stk = []
  ans = 'YES'
  for c in input():
    if c == '(':
      stk.append(c)
    elif c == ')':
      if len(stk) > 0:
        stk.pop()
      else:
        ans = 'NO'
  if len(stk) > 0:
    ans = 'NO'
  print(ans)