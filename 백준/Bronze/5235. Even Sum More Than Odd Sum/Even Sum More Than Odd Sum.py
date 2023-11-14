import math
import sys

input = sys.stdin.readline
for _ in range(int(input())):
    arr = list(map(int, input().split()))[1:]

    evenTot, oddTot = 0, 0

    for i in arr:
        if i % 2 == 0:
            evenTot += i
        else:
            oddTot += i

    if evenTot > oddTot:
        print("EVEN")
    elif oddTot > evenTot:
        print("ODD")
    else:
        print("TIE")