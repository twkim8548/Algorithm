import heapq
import sys
from itertools import permutations
from itertools import combinations

input = sys.stdin.readline

arr = [int(input()) for _ in range(9)]
ans = 0

for i in combinations(arr, 7):
    if sum(i) == 100:
        for j in sorted(i):
            print(j)
        break