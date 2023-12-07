import math
import sys

input = sys.stdin.readline

for _ in range(int(input())):
    num = int(input())

    for i in range(2, 1_000_001):
        if num % i == 0:
            print("NO")
            break
        if i == 1_000_000:
            print("YES")


