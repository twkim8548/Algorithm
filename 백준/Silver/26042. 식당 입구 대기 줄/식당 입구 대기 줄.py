import sys
from collections import deque

input = sys.stdin.readline

queue = deque()
max_line = 0
min_num = 0
for i in range(int(input())):
    s = input()
    if ' ' in s:
        a, b = map(int, s.split())
        queue.append(b)
        if max_line < len(queue):
            max_line = len(queue)
            min_num = b
        elif max_line == len(queue):
            min_num = min(min_num, b)
    else:
        x = int(s)
        queue.popleft()


print(max_line, min_num)