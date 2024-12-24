from math import pi

n = int(input())

for i in range(n):
    a1, p1 = map(int, input().split())
    r1, p2 = map(int, input().split())
    if pi * (r1 ** 2) / p2 > a1/p1:
        print("Whole pizza")
    else:
        print("Slice of pizza")

