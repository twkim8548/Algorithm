import sys
from collections import deque

input = sys.stdin.readline

q = deque()

N = int(input())
for i in range(N):
    q.append(i + 1)

while len(q) > 1:
    q.popleft()
    q.append(q.popleft())

print(q.pop())