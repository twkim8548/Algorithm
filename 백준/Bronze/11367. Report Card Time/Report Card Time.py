import sys
from math import ceil

input = sys.stdin.readline

N = int(input())

for _ in range(N):
    name, N = input().strip().split()
    N = int(N)

    if N >= 97:
        print(f"{name} A+")
    elif N >= 90:
        print(f"{name} A")
    elif N >= 87:
        print(f"{name} B+")
    elif N >= 80:
        print(f"{name} B")
    elif N >= 77:
        print(f"{name} C+")
    elif N >= 70:
        print(f"{name} C")
    elif N >= 67:
        print(f"{name} D+")
    elif N >= 60:
        print(f"{name} D")
    else:
        print(f"{name} F")