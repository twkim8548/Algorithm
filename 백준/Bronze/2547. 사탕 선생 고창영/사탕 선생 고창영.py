import sys

input = sys.stdin.readline

for _ in range(int(input())):
    br = input()
    tot = 0
    N = int(input())
    for _ in range(N):
        tot += int(input())

    if  tot % N == 0:
        print("YES")
    else:
        print("NO")
    