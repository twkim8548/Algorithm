import sys

input = sys.stdin.readline

n = int(input())
arr = [input().strip() for i in range(n)]

for s in arr:
    reverse = s[::-1]
    if reverse in arr:
        print(len(s), s[len(s) // 2])
        break