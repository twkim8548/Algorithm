import math
import sys

input = sys.stdin.readline

str = input().strip().upper()

for i in range(26):
    c = chr(i + 65)
    print(f"{c} | ", end="")
    for _ in range(str.count(c)):
        print('*', end="")
    print()