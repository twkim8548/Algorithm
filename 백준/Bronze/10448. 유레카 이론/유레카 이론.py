import heapq
import sys
from itertools import permutations
from itertools import combinations

input = sys.stdin.readline

T = [int(n * (n+1) / 2) for n in range(46)]
isFind = False

for _ in range(int(input())):
    K = int(input())
    isPossible = False
    for i in range(1, 46):
        for j in range(1, 46):
            for k in range(1, 46):
                if T[i] + T[j] + T[k] == K:
                    isPossible = True
                    break
            if isPossible:
                break
        if isPossible:
            break
    print("1" if isPossible else "0")