import sys

input = sys.stdin.readline

N = int(input())
str = input().strip()

for i in range(0, N - 1):
    if str[i + 1] == 'J':
        print(str[i])