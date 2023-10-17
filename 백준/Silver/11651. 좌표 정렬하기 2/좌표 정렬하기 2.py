import math
import sys

input = sys.stdin.readline

arr = []

for _ in range(int(input())):
    a = input().split(" ")
    arr.append((int(a[0]), int(a[1])))


arr.sort(key=lambda x: (x[1], x[0]))

for i in arr:
    print(f"{i[0]} {i[1]}")