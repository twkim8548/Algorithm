import math
import sys
from itertools import combinations, permutations

input = sys.stdin.readline

n = int(input()) // 3
cnt = 0
print((n-1) * (n-2) // 2)
