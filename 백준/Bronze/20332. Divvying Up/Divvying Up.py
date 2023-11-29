import math
import sys

input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))

if sum(arr) % 3 == 0:
    print("yes")
else:
    print("no")