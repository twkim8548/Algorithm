import math
import sys
from itertools import combinations, permutations

input = sys.stdin.readline

a = 1
b = 1
N = int(input())

while a * b < N:
    if a > b:
        b += 1
    else:
        a += 1

print(a, b)