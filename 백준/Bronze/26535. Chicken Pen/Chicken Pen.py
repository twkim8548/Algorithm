import sys
from math import ceil

input = sys.stdin.readline

N = int(input())
N = ceil(N ** (1/2))

for i in range(N + 2):
    if i == N +1 or i == 0:
        for j in range(N + 2):
            print('x', end='')
    else:
        print('x', end='')
        for j in range(N):
            print('.', end='')
        print('x', end='')
    print()