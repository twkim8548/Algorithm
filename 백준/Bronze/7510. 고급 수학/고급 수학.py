import math
import sys
from itertools import combinations, permutations

input = sys.stdin.readline

for i in range(int(input())):
    arr = list(map(int, input().split()))
    arr.sort()
    a, b, c = arr[0], arr[1], arr[2]
    print(f"Scenario #{i+1}:")
    if pow(a, 2) + pow(b, 2) == pow(c, 2):
        print("yes")
    else:
        print("no")
    print()
