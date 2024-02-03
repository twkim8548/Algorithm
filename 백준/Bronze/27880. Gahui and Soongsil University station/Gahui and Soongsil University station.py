import math
import sys
from itertools import combinations, permutations

input = sys.stdin.readline

ans = 0
for _ in range(4):
    path, height = input().strip().split()
    if path == 'Stair':
        ans += int(height) * 17
    else:
        ans += int(height) * 21

print(ans)