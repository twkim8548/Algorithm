import math
import sys
from itertools import combinations, permutations

input = sys.stdin.readline

w = int(input())
n = int(input())
tot = 0
for _ in range(n):
    a, b = map(int, input().split())
    tot += a*b

print(tot // w)