import math
import sys
from itertools import combinations, permutations

input = sys.stdin.readline

for _ in range(int(input())):
    year = input().strip()
    if (int(year) + 1) % int((year[2] + year[3])) == 0:
        print("Good")
    else:
        print("Bye")
