import math
import sys

input = sys.stdin.readline

for _ in range(int(input())):
    str = input().strip()
    if str[len(str) - 1] != '.':
        print(str + '.')
    else:
        print(str)