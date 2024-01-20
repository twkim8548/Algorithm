import math
import sys
from itertools import combinations, permutations

input = sys.stdin.readline

for _ in range(int(input())):
    a, b, x = map(int, input().split())
    print(a * (x - 1) + b)
