import math
import sys
from itertools import combinations, permutations

input = sys.stdin.readline

for i in range(int(input())):
    start, end = map(int, input().split())
    print(f"Scenario #{i + 1}:")
    tot = 0
    print((end-start+1) * (start+end)//2)
    print()