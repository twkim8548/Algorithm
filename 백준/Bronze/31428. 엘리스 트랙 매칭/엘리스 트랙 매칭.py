import sys

input = sys.stdin.readline

n = int(input())

arr = input().split()

hello_bit = input().strip()

cnt = 0

for c in arr:
    if c == hello_bit:
        cnt += 1
print(cnt)