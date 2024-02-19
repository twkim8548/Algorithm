import math
import sys
from itertools import combinations, permutations

input = sys.stdin.readline

while True:
    try:
        try:
            r, s = input().split()
        except ValueError:
            break
        r = int(r)
        s = float(s)

        print(round((r * (s + 0.16) / 0.067) ** (1/2)))
    except EOFError:
        break
