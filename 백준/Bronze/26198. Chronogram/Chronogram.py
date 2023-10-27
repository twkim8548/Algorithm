import sys

input = sys.stdin.readline

N = int(input())
for _ in range(N):
    arr = list(input().strip().split())
    tot = 0
    for str in arr:
        for c in str:
            if c == 'I':
                tot += 1
            elif c == "V":
                tot += 5
            elif c == "X":
                tot += 10
            elif c == "L":
                tot += 50
            elif c == "C":
                tot += 100
            elif c == "D":
                tot += 500
            elif c == "M":
                tot += 1000
    print(tot)