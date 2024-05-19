import sys

input = sys.stdin.readline

s, n, m = map(int, input().split())
size = s
num = 0
for i in range(n + m):
    m = int(input())
    if m == 1:
        num += 1
    else:
        num -= 1
    if size < num:
        size += size
        
print(size)
