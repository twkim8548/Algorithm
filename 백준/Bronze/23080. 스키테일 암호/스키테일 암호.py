import math
import sys

input = sys.stdin.readline

N = int(input())
str = input().strip()

for i in range(len(str)):
    if i % N == 0:
        print(str[i], end='')