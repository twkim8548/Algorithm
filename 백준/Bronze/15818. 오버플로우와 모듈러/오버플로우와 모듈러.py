import sys

input = sys.stdin.readline

N, M = map(int, input().split())
tot = 1

for a in input().strip().split():
    tot *= int(a)

print(tot % M)