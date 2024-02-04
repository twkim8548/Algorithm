import math
import sys
from itertools import combinations, permutations

input = sys.stdin.readline

for _ in range(int(input())):
    a, b = input().strip().split()

    tot = int(a[::-1]) + int(b[::-1])

    print(int(str(tot)[::-1]))
