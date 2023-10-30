import sys

input = sys.stdin.readline

w, h, d = map(int, input().strip().split())

if d * 2 >= h or d * 2 >= w:
    print(0)
else:
    print((w - d * 2) * (h - d * 2))
